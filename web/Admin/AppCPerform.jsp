<%-- 
    Document   : AppCPreform
    Created on : 14 May, 2020, 6:28:55 PM
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.SendMail"%>
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
   
    if(res.equals("accept")){
        
        try{
                    String to="";
                    PreparedStatement ps2=con.prepareStatement("select * from user where contact_no='"+contact+"'");
                    ResultSet rs2=ps2.executeQuery();
                    while(rs2.next()){
                        to=rs2.getString("email_id");
                     }
                    
                    String subject="approval msg";
                    String message="request accepted";
                    String user="traptitrisha@gmail.com";
                    String pass="trapti18c3192@";
                    PreparedStatement ps=con.prepareStatement("update user set request_status=1 where contact_no='"+contact+"'");
                    int i=ps.executeUpdate();
                   if(i > 0)
                    {
                       SendMail.send(to,subject, message, user, pass);
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Request accepted sucessfully');");  
                    out.println("location='ApproveC.jsp';");
                    out.println("</script>");
                    }
                    else
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Problem in accepting request');");
                   out.println("location='ApproveC.jsp';");
                     out.println("</script>");
                    }
}
                    catch(Exception e){} 
    }
    else{
        try{
                    PreparedStatement ps=con.prepareStatement("delete from user where contact_no='"+contact+"'");
                    int i=ps.executeUpdate();
                   if(i > 0)
                    {
                        request.getRequestDispatcher("../sendMailBy.java").include(request, response);  
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Request rejected sucessfully');");  
                    out.println("location='ApproveC.jsp';");
                    out.println("</script>");
                    }
                    else
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Problem in rejecting request');");
                   out.println("location='ApproveC.jsp';");
                     out.println("</script>");
                    }
}
                    catch(Exception e){} 
    }
   }
%>
