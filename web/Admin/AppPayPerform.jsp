<%-- 
    Document   : AppCPreform
    Created on : 14 May, 2020, 6:28:55 PM
    Author     : DELL
--%>

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
    
    String contact= request.getParameter("cont");
    
        try{
                    PreparedStatement ps=con.prepareStatement("update user set payment_status=1 where contact_no='"+contact+"'");
                    int i=ps.executeUpdate();
                   if(i > 0)
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Payment accepted sucessfully');");  
                    out.println("location='ApprovePay.jsp';");
                    out.println("</script>");
                    }
                    else
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Problem in accepting payment');");
                   out.println("location='ApprovePay.jsp';");
                     out.println("</script>");
                    }
}
                    catch(Exception e){} 
    
    }
%>
