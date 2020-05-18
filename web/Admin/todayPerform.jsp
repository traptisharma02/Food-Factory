<%-- 
    Document   : AppCPreform
    Created on : 14 May, 2020, 6:28:55 PM
    Author     : DELL
--%>

<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    session=request.getSession(false);
    if(session.getAttribute("contact")==null)
    {
       out.println("<script type=\"text/javascript\">");
                    out.println("alert('Pls login first');");  
                    out.println("location='../ALoginIn.jsp';");
                    out.println("</script>");
    }
    else{ 
     Connection con=DBConnection.getConnection();
%>
<%
    String res=request.getParameter("res");
    String contact= request.getParameter("cont");
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
   String del="";
        
        try{
                    PreparedStatement ps=con.prepareStatement("select delivery from customer_plan where contact_no='"+contact+"'");
                    ResultSet rs=ps.executeQuery();
                   while(rs.next()){
                       del=rs.getString("delivery");
                   }
                   int d=Integer.parseInt(del);
                   if(res.equals("deliver")){
                       del=String.valueOf(d-1);
                       PreparedStatement ps2=con.prepareStatement("update customer_plan set delivery='"+del+"' and last_delivery='"+timestamp+"' where contact_no='"+contact+"'");
                    int i=ps2.executeUpdate();
                   }
                   else{
                       PreparedStatement ps2=con.prepareStatement("update customer_plan set last_delivery='"+timestamp+"' where contact_no='"+contact+"'");
                    int i=ps2.executeUpdate();
                   }
                   
                    out.println("<script type=\"text/javascript\">");
                   out.println("location='TodayD.jsp';");
                    out.println("</script>");
               
        }
                    catch(Exception e){} 
   }     
%>
