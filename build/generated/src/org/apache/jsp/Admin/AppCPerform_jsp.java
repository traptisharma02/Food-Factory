package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.SendMail;
import java.sql.PreparedStatement;
import java.io.PrintWriter;
import DB.DBConnection;
import java.sql.Connection;

public final class AppCPerform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

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

      out.write('\n');

    String res=request.getParameter("res");
    String contact= request.getParameter("cont");
   
    if(res.equals("accept")){
        
        try{
                    String to="traptisharma992@gmail.com";
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

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
