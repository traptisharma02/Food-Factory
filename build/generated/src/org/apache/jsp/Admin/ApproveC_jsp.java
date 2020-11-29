package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.DBConnection;
import java.sql.Connection;

public final class ApproveC_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/header4.jsp");
    _jspx_dependants.add("/Admin/footer4.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("  ");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"Omnifood is a premium food delivery service with the mission to bring affordable and healty meals to as many people as possible.\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/queries.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/approve.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,300italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <title>Omnifood</title>\n");
      out.write("        \n");
      out.write("           <link href=\"../vendors/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"../vendors/css/datatables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"../vendors/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level plugin JavaScript-->\n");
      out.write("    <script src=\"../vendors/js/jquery.datatables.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"../vendors/js/datatables.bootstrap4.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#myTable').DataTable();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row \" style=\"margin-left: 7%\">\n");
      out.write("                    <a href=\"admin.jsp\"> <img src=\"../resources/img/logo-white.png\" alt=\"Omnifood logo\" class=\"logo\">\n");
      out.write("                    <img src=\"../resources/img/logo.png\" alt=\"Omnifood logo\" class=\"logo-black\"></a>\n");
      out.write("                    <ul class=\"main-nav js--main-nav\" style=\"text-align: right;width: 90%\">\n");
      out.write("                        <li><a href=\"TodayD.jsp\">Today's Deliveries</a></li>\n");
      out.write("                        <li><a href=\"ApproveC.jsp\">Approve user</a></li>\n");
      out.write("                        <li><a href=\"ApprovePay.jsp\">Approve payment</a></li>\n");
      out.write("                        <li><a href=\"ViewCustomer.jsp\">View Customers</a></li>\n");
      out.write("                         <li><a href=\"../ALoginIn.jsp\">logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a class=\"mobile-nav-icon js--nav-icon\"><i class=\"ion-navicon-round\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>");
      out.write("\n");
      out.write("      <!-- Header-->\n");
      out.write("      ");

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

      out.write("\n");
      out.write(" <div class=\"limiter\" style=\"height: 225%\">\n");
      out.write("      <div  class=\"container-login\"  >\n");
      out.write("          <div class=\"wrap-login logwrap\" style=\"margin-top: 20%;width:80%\">\n");
      out.write("          <div class=\"text-center\">\n");
      out.write("           <div class=\"container\">\n");
      out.write("                <h2 style=\"margin-top: -1%;\">view user request</h2>\n");
      out.write("          </div>\n");
      out.write("              <button onclick=\"window.scrollTo(0, 0); \" id=\"myBtn\" title=\"Go to top\" ><i class=\"ion-arrow-up-c\"></i></button>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <table class=\"table table-bordered\" id=\"myTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Contact-No.</th>\n");
      out.write("                    <th>Email-Id</th>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tfoot>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Contact-No.</th>\n");
      out.write("                    <th>Email-Id</th>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </tfoot>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                try{
                    PreparedStatement ps=con.prepareStatement("select * from user where request_status=0");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("contact_no") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("email_id") );
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                     <td><div class=\"text-center w-full b1\">\n");
      out.write("                     <a href=\"AppCPerform.jsp?res=");
      out.print("accept");
      out.write("&cont=");
      out.print(rs.getString("contact_no"));
      out.write("\" class=\"bt1\" >Accept</a></div></td>\n");
      out.write("                    <td><div class=\"text-center w-full b1\">\n");
      out.write("                     <a href=\"AppCPerform.jsp?res=");
      out.print("reject");
      out.write("&cont=");
      out.print(rs.getString("contact_no"));
      out.write("\" class=\"bt2\">Reject</a></div></td> \n");
      out.write("                </tr>\n");
      out.write("                  ");

                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    
      out.write("\n");
      out.write("               \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div></div></div></div></div>\n");
      out.write("                    ");

                        }
                    
      out.write('\n');
      out.write("     <footer>\n");
      out.write("            <div class=\"row\" style=\"margin-left: 5%\">\n");
      out.write("                <div class=\"col span-1-of-2\">\n");
      out.write("                    <ul class=\"footer-nav\">\n");
      out.write("                        <li><a href=\"index.jsp#contact\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"index.jsp#features\">About us</a></li>\n");
      out.write("                        <li><a href=\"index.jsp#blog\">Blog</a></li>\n");
      out.write("                        <li><a href=\"index.jsp#pic\">Images</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col span-1-of-2\">\n");
      out.write("                    <ul class=\"social-links\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-googleplus\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-instagram\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("              <div class=\"col span-1-of-2 cont\" style=\"margin-left: 5%\">\n");
      out.write("                    \n");
      out.write("                  <h5 class=\"text-uppercase font-weight-bold\">&nbsp;&nbspContact</h5>\n");
      out.write("                        <ul class=\"contUL\">\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fas fa-home mr-3\"></i> New York, NY 10012, US</li><br>\n");
      out.write("                            <li>\n");
      out.write("                              <i class=\"fas fa-envelope mr-3\"></i> info@example.com</li><br>\n");
      out.write("                            <li>\n");
      out.write("                              <i class=\"fas fa-phone mr-3\"></i> + 01 234 567 88</li><br>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         <div class=\"row\" style=\"margin-left: 35%\">\n");
      out.write("                <p>\n");
      out.write("                    Copyright &copy; 2019 by food factory. All rights reserved.\n");
      out.write("                </p>\n");
      out.write("             </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("    <script src=\"//cdn.jsdelivr.net/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/selectivizr/1.0.3b/selectivizr.min.js\"></script>\n");
      out.write("    <script src=\"../vendors/js/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"../resources/js/script.js\"></script>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("      (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("      })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n");
      out.write("\n");
      out.write("      ga('create', 'UA-61026110-2', 'auto');\n");
      out.write("      ga('send', 'pageview');\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    </body>  \n");
      out.write("    \n");
      out.write("</html>");
      out.write('\n');
      out.write(' ');
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
