/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.SignUpData;

import DAO.UpdateProfile1;
import DB.DBConnection;
import DTO.RegBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ChangeTransaction extends HttpServlet {
    Connection con=null;
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String date1=request.getParameter("date");
     String phone=request.getParameter("contact");
     String rest=request.getParameter("restaurent");
     String comment=request.getParameter("comment");
     String price=request.getParameter("price");
     PrintWriter out = response.getWriter();  
    
     boolean b1=update1(date1,phone,rest,comment,price);
        
     if(b1)
     {
         out.println("<script type=\"text/javascript\">");
         out.println("alert('Update successful');");  
         out.println("location='customer/MonthlySpending1.jsp';");
         out.println("</script>");
     }
     else{
         out.println("<script type=\"text/javascript\">");
         out.println("alert('Update unsuccessful');");  
         out.println("location='customer/MonthlySpending1.jsp';");
         out.println("</script>");
     }
        
 }
    public boolean update1(String date1,String phone,String rest,String comment,String price){
        int up=0;
        try {
            con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("UPDATE month_expense SET date1=?,restaurent=?,comment=?,price=? where contact_no=? and date1=?");
            int price1=Integer.parseInt(price);
            ps.setString(1, date1);
            ps.setString(2,rest);
            ps.setString(3,comment);
            ps.setInt(4,price1);
            ps.setString(5,phone);
            ps.setString(6,date1);
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
