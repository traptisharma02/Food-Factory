package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.io.PrintWriter;
import DB.DBConnection;
import java.sql.Connection;

public final class todayPerform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      Timestamp timestamp = new Timestamp(System.currentTimeMillis());
   String del="3";
        
        try{
                    PreparedStatement ps=con.prepareStatement("select * from customer_plan where contact_no='"+contact+"'");
                    ResultSet rs=ps.executeQuery();
                   while(rs.next()){
                      // del=rs.getString("delivery");
                   }
                   int d=Integer.parseInt(del);
                   if(res.equals("deliver")){
                     //  del=String.valueOf(d-1);
                       PreparedStatement ps2=con.prepareStatement("update customer_plan set delivery=3 and last_delivery='"+timestamp+"' where contact_no='"+contact+"'");
                    int i=ps2.executeUpdate();
                   }
                   else{
                       PreparedStatement ps2=con.prepareStatement("update customer_plan set last_delivery='"+timestamp+"' where contact_no='"+contact+"'");
                    int i=ps2.executeUpdate();
                   }
                   
                    out.println("<script type=\"text/javascript\">");
                   out.println("location='TodayDel.jsp';");
                    out.println("</script>");
               
        }
                    catch(Exception e){} 
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
