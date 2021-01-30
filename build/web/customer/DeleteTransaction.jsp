<%-- 
    Document   : AppCPreform
    Created on : 14 May, 2020, 6:28:55 PM
    Author     : DELL
--%>

<%@page import="DAO.SendMailApprov"%>
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
                    out.println("location='../logIn.jsp';");
                    out.println("</script>");
    }
    else{ 
     Connection con=DBConnection.getConnection();
%>
<%
    String date1=request.getParameter("date1");
        try{
                    PreparedStatement ps1=con.prepareStatement("delete from month_expense where contact_no=? and date1=?");
                    ps1.setString(1, (String)session.getAttribute("contact"));
                    ps1.setString(2, date1);
                    int i=ps1.executeUpdate();
                   if(i > 0)
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Transaction deleted sucessfully');");  
                     out.println("location='MonthlySpending.jsp';");
                    out.println("</script>");
                    }
                    else
                    {
                    out.println("<script type=\"text/javascript\">");
                        out.println("alert('Problem in deletion');");
                   out.println("location='MonthlySpending.jsp';");
                     out.println("</script>");
                    }
}
                    catch(Exception e){} 
    }
%>
