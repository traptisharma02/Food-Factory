package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.DBConnection;
import java.sql.Connection;

public final class ChangeProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/customer/header2.jsp");
    _jspx_dependants.add("/customer/footer.jsp");
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/queries.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,300italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <title>Omnifood</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"../resources/favicons/apple-touch-icon-57x57.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"../resources/favicons/apple-touch-icon-60x60.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"../resources/favicons/apple-touch-icon-72x72.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../resources/favicons/apple-touch-icon-76x76.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"../resources/favicons/apple-touch-icon-114x114.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"../resources/favicons/apple-touch-icon-120x120.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"../resources/favicons/apple-touch-icon-144x144.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"../resources/favicons/apple-touch-icon-152x152.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"../resources/favicons/apple-touch-icon-180x180.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../resources/favicons/favicon-32x32.png\" sizes=\"32x32\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../resources/favicons/favicon-194x194.png\" sizes=\"194x194\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../resources/favicons/favicon-96x96.png\" sizes=\"96x96\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../resources/favicons/android-chrome-192x192.png\" sizes=\"192x192\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../resources/favicons/favicon-16x16.png\" sizes=\"16x16\">\n");
      out.write("        <link rel=\"manifest\" href=\"../resources/favicons/manifest.json\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../resources/favicons/favicon.ico\">\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#da532c\">\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"../resources/favicons/mstile-144x144.png\">\n");
      out.write("        <meta name=\"msapplication-config\" content=\"../resources/favicons/browserconfig.xml\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a href=\"welcome.jsp\"> <img src=\"../resources/img/logo-white.png\" alt=\"Omnifood logo\" class=\"logo\">\n");
      out.write("                    <img src=\"../resources/img/logo.png\" alt=\"Omnifood logo\" class=\"logo-black\"></a>\n");
      out.write("                    <ul class=\"main-nav js--main-nav\">\n");
      out.write("                        <li><a href=\"welcome.jsp#plans\">Select new plan</a></li>\n");
      out.write("                        <li><a href=\"welcome.jsp#todayM\">View your details</a></li>\n");
      out.write("                         <li><a href=\"welcome.jsp#ViewDetail\">Plans you selected</a></li>\n");
      out.write("                          <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                         <li><a href=\"../LogoutServlet\">logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a class=\"mobile-nav-icon js--nav-icon\"><i class=\"ion-navicon-round\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>");
      out.write("\n");
      out.write("      <!-- Header-->\n");
      out.write("       <script> \n");
      out.write("\t\tfunction getlocation(){ \n");
      out.write("\t\t\t\tnavigator.geolocation.getCurrentPosition(showLoc); \n");
      out.write("\t\t} \n");
      out.write("\t\tfunction showLoc(pos){ \n");
      out.write("\t\t\t\tdocument.getElementById(\"address1\").value=pos.coords.latitude;\n");
      out.write("\t\t\t\tdocument.getElementById(\"address2\").value= pos.coords.longitude;         \n");
      out.write("\t\t\t} \n");
      out.write("\t\t</script>\n");
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
     String contact= request.getParameter("cont");

      out.write('\n');
      out.write(' ');

             try{
                  
                    PreparedStatement ps=con.prepareStatement("select * from user where user.contact_no='"+contact+"'");
                    
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        
      out.write("\n");
      out.write(" <div class=\"limiter\" >\n");
      out.write("     <div  class=\"container-login\"  >\n");
      out.write("          <div class=\"wrap-login logwrap\" >\n");
      out.write("          <div class=\"text-center\">\n");
      out.write("               <div class=\"container\">\n");
      out.write("                <h2>Update ");
      out.print(rs.getString("name"));
      out.write("'s details</h2>\n");
      out.write("                \n");
      out.write("                 </div>\n");
      out.write("              <button onclick=\"window.scrollTo(0, 0); \" id=\"myBtn\" title=\"Go to top\" ><i class=\"ion-arrow-up-c\"></i></button>\n");
      out.write("    <div class=\"container\">\n");
      out.write("          <form action=\"../ChangeProfileServlet\" class=\"login-form\" method=\"post\" name=\"f1\" onsubmit=\"return validate();\">\n");
      out.write("\n");
      out.write("            <div class=\"my-2 ml-2\"><span>Name</span></div>\n");
      out.write("            <div class=\"wrap-input\">\n");
      out.write("                <input type=\"text\" name=\"username\" class=\"inputcustom\" id=\"username\" value=\"");
      out.print(rs.getString("name"));
      out.write("\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"my-2 ml-2\">\n");
      out.write("              <span>Contact-No.</span>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrap-input\">\n");
      out.write("              <input type=\"text\" name=\"contact\" id=\"contact\" class=\"inputcustom\" value=\"");
      out.print(rs.getString("contact_no"));
      out.write(" \" required=\"\" />\n");
      out.write("            </div>\n");
      out.write("             <div class=\"my-2 ml-2\">\n");
      out.write("              <span>Email-Id</span>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrap-input\">\n");
      out.write("              <input type=\"email\" name=\"email\" class=\"inputcustom\" value=\"");
      out.print(rs.getString("email_id"));
      out.write("\" required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"my-2 ml-2\"><span>Password</span></div>\n");
      out.write("            <div class=\"wrap-input\">\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" class=\"inputcustom\" value=\"");
      out.print(rs.getString("password"));
      out.write("\"  required=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              <div class=\"my-2 ml-2\"><span>Address</span></div>\n");
      out.write("            <div class=\"wrap-input\">\n");
      out.write("                <input type=\"text\" name=\"address1\" id=\"address1\" class=\"inputcustom\" value=\"");
      out.print(rs.getString("latitude"));
      out.write("\"  style=\"width:48%\" />\n");
      out.write("                <input type=\"text\" name=\"address2\" id=\"address2\" class=\"inputcustom\" value=\"");
      out.print(rs.getString("longtitude"));
      out.write("\"  style=\"width:48%;margin-top: -40px;margin-left: 50%\"  />\n");
      out.write("             </div>  \n");
      out.write("                 <div class=\"text-center w-full b1\">\n");
      out.write("                         <input type=\"button\" onclick=\"getlocation()\" value=\"Select current location\"  class=\"btn btn-ghost\"></div>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("              <button onclick=\"window.scrollTo(0, 0); \" id=\"myBtn\" title=\"Go to top\" ><i class=\"ion-arrow-up-c\"></i></button>\n");
      out.write("               <div class=\"text-center w-full b1\"><br><center>\n");
      out.write("                     <input type=\"submit\" value=\"Update\" class=\"btn btn-ghost\"></div>\n");
      out.write("                  \n");
      out.write("          </form>\n");
      out.write("                </div></div></div></div>\n");
      out.write("          ");

                        }
                        con.close();
                        }catch(Exception e){e.printStackTrace();}
                    
      out.write(" \n");
      out.write("                    ");

                        }
                    
      out.write('\n');
      out.write("     <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col span-1-of-2\">\n");
      out.write("                    <ul class=\"footer-nav\">\n");
      out.write("                        <li><a href=\"../index.jsp#contact\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"../index.jsp#features\">About us</a></li>\n");
      out.write("                        <li><a href=\"../index.jsp#blog\">Blog</a></li>\n");
      out.write("                        <li><a href=\"../index.jsp#pic\">Images</a></li>\n");
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
      out.write("                <div class=\"col span-1-of-2 cont\">\n");
      out.write("                    \n");
      out.write("                        <h3 class=\"text-uppercase font-weight-bold\">Contact</h3>\n");
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
      out.write("            <div class=\"row\">\n");
      out.write("                <p>\n");
      out.write("                    Copyright &copy; 2021 by food factory. All rights reserved.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/selectivizr/1.0.3b/selectivizr.min.js\"></script>\n");
      out.write("    <script src=\"vendors/js/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"resources/js/script.js\"></script>\n");
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
