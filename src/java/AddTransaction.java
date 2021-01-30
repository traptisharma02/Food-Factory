/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.SignUpData;
import DB.DBConnection;
import DTO.RegBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddTransaction extends HttpServlet {
      Connection con=null;
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String date1=request.getParameter("date");
     String phone=request.getParameter("contact");
     String rest=request.getParameter("restaurent");
     String comment=request.getParameter("comment");
     String price=request.getParameter("price");
     PrintWriter out = response.getWriter();  
     
     boolean c1=check(date1,phone,rest,comment,price);
     if(c1){
         out.println("<script type=\"text/javascript\">");
       out.println("alert('Information submitted is already present in database');");
       out.println("location='customer/MonthlySpending.jsp'");
       out.println("</script>");        
       }
     else{
        boolean b1=insert(date1,phone,rest,comment,price);
     if(b1){
         out.println("<script type=\"text/javascript\">");
         out.println("alert('insertion successful');");  
         out.println("location='customer/MonthlySpending.jsp'");
         out.println("</script>");
         }
     else{
         out.println("<script type=\"text/javascript\">");
       out.println("alert('insertion unsuccessfull');");
       out.println("location='customer/AddTransaction.jsp?date1='"+date1);
       out.println("</script>");        
       }
        }
    }
    public boolean check(String date1,String phone,String rest,String comment,String price){
          boolean status=false;
		try{
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from month_expense where contact_no=? and date1=?");
                         ps.setString(1,phone);
                          ps.setString(2,date1);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}catch(Exception e){}
		return status;
	}
     public boolean insert(String date1,String phone,String rest,String comment,String price){
        int up=0;
        try {
            con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into month_expense values(?,?,?,?,?)");
            int price1=Integer.parseInt(price);
            ps.setString(1, phone);
            ps.setString(2,date1);
            ps.setString(3,rest);
            ps.setString(4,comment);
            ps.setInt(5,price1);
            
            up=ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        if(up!=0)
            return true;
        else
            return false;
    }
}
    