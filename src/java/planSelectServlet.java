/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DB.DBConnection;
import DTO.CusLogBean;
import DTO.NewsLetBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class planSelectServlet extends HttpServlet {
     private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(false);   
        String phone=(String)session.getAttribute("contact");  
        String category=request.getParameter("cat");
        PrintWriter out = response.getWriter();
        
       boolean res=insert(phone,category);
         if(res)
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Plan selected successfully');");  
                    out.println("location='customer/welcome.jsp#plans';");
                    out.println("</script>");
                }
                else
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Problem in selection');");
                    out.println("location='customer/welcome.jsp#plans';");
                    out.println("</script>");
                }
    }
    public boolean insert(String phone,String cat){
        int up=0;
        try {
            int del=0;
            Timestamp t=getT(cat);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Connection con = DBConnection.getConnection();
            PreparedStatement ps2=con.prepareStatement("delete from customer_plan where contact_no="+phone);
            PreparedStatement ps=con.prepareStatement("insert into customer_plan(contact_no,plan,planSelectDate,planDueDate,delivery) values(?,?,?,?,?)");
           if(cat.equals("Premium")){
               del=30;
           }
           else if(cat.equals("Pro")){
               del=3;
           }
           else if(cat.equals("Starter")){
               del=1;
           }
            ps.setString(1,phone);
           ps.setString(2,cat);
            ps.setTimestamp(3, timestamp);
           ps.setTimestamp(4, t);
           ps.setInt(5, del);
            ps2.executeUpdate();
            up=ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        if(up!=0)
            return true;
        else
            return false;
    }
    public Timestamp getT(String cat){
        Connection con = DBConnection.getConnection();
        Date currentDate = new Date();
        int days=0;
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

         try{
       PreparedStatement ps=con.prepareStatement("select * from meal where category='"+cat+"'");
                    ResultSet rs=ps.executeQuery();
                     
                    while(rs.next()){
                        
                    if(rs.getString("validity").equals("/meal")){
                        days=1;
                    }
                    else if(rs.getString("validity").equals("/week")){
                        days=7;
                    }
                     else{
                       days=30;
                    }
                    }
                   
        }
        catch(Exception e){
            System.err.println(e);
        }
          c.add(Calendar.DATE, days); //same with c.add(Calendar.DAY_OF_MONTH, days);
        
        Date currentDatePlusOne = c.getTime();
        long time = currentDatePlusOne.getTime();
        Timestamp ts=new Timestamp(time);
        return ts;
    }
   
}
