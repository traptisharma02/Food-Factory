package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("                    function validate(){\r\n");
      out.write("                    var pass=document.f1.new_password.value;\r\n");
      out.write("                    var pass1=document.f1.confirm_new_password.value;\r\n");
      out.write("                    var status=false;\r\n");
      out.write("                    setTimeout(function()\r\n");
      out.write("                    {\r\n");
      out.write("                    if (pass.length<6) \r\n");
      out.write("                    {\r\n");
      out.write("                            alert(\"please enter 6 digit password\");\r\n");
      out.write("                            status= false;\r\n");
      out.write("                    }\r\n");
      out.write("                    else{\r\n");
      out.write("                        status=true;\r\n");
      out.write("                    }\r\n");
      out.write("                    if(pass1!=pass)\r\n");
      out.write("                    {\r\n");
      out.write("                            alert(\"please enter same password\");\r\n");
      out.write("                            status= false;\r\n");
      out.write("                    }\r\n");
      out.write("                    else{\r\n");
      out.write("                        status=true;\r\n");
      out.write("                    }\r\n");
      out.write("                  \r\n");
      out.write("                    return status;\r\n");
      out.write("                    },1);\r\n");
      out.write("                    \r\n");
      out.write("                 \r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("        ");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"Omnifood is a premium food delivery service with the mission to bring affordable and healty meals to as many people as possible.\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendors/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/queries.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,300italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <title>Omnifood</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"/resources/favicons/apple-touch-icon-57x57.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"/resources/favicons/apple-touch-icon-60x60.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"/resources/favicons/apple-touch-icon-72x72.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"/resources/favicons/apple-touch-icon-76x76.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"/resources/favicons/apple-touch-icon-114x114.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"/resources/favicons/apple-touch-icon-120x120.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"/resources/favicons/apple-touch-icon-144x144.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"/resources/favicons/apple-touch-icon-152x152.png\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"/resources/favicons/apple-touch-icon-180x180.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/resources/favicons/favicon-32x32.png\" sizes=\"32x32\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/resources/favicons/favicon-194x194.png\" sizes=\"194x194\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/resources/favicons/favicon-96x96.png\" sizes=\"96x96\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/resources/favicons/android-chrome-192x192.png\" sizes=\"192x192\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/resources/favicons/favicon-16x16.png\" sizes=\"16x16\">\n");
      out.write("        <link rel=\"manifest\" href=\"/resources/favicons/manifest.json\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"/resources/favicons/favicon.ico\">\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#da532c\">\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"/resources/favicons/mstile-144x144.png\">\n");
      out.write("        <meta name=\"msapplication-config\" content=\"/resources/favicons/browserconfig.xml\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("        <script>\n");
      out.write("                    function validate(){\n");
      out.write("                    var pass=document.f1.password.value;\n");
      out.write("                    var pass1=document.f1.confirmPassword.value;\n");
      out.write("                    var num=document.f1.contact.value;\n");
      out.write("                    var first=num.charAt(0);\n");
      out.write("                    var status=false;\n");
      out.write("                    setTimeout(function()\n");
      out.write("                    {\n");
      out.write("                    if (pass.length<6) \n");
      out.write("                    {\n");
      out.write("                            alert(\"please enter 6 digit password\");\n");
      out.write("                            status= false;\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                        status=true;\n");
      out.write("                    }\n");
      out.write("                    if(pass1!=pass)\n");
      out.write("                    {\n");
      out.write("                            alert(\"please enter same password\");\n");
      out.write("                            status= false;\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                        status=true;\n");
      out.write("                    }\n");
      out.write("                    if(isNaN(num) || num.length<10 && num.length>=0) \n");
      out.write("                    {\n");
      out.write("                            alert(\"please enter valid number\");\n");
      out.write("                            status= false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    else if(!(first==\"7\" || first==\"8\" || first==\"9\"))\n");
      out.write("                    {\n");
      out.write("                            alert(\"please enter valid number\");\n");
      out.write("                            status= false;\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                        status=true;\n");
      out.write("                    }\n");
      out.write("                    return status;\n");
      out.write("                    },1);\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a href=\"index.jsp\"> <img src=\"resources/img/logo-white.png\" alt=\"Omnifood logo\" class=\"logo\">\n");
      out.write("                    <img src=\"resources/img/logo.png\" alt=\"Omnifood logo\" class=\"logo-black\"></a>\n");
      out.write("                    <ul class=\"main-nav js--main-nav\">\n");
      out.write("                        <li><a href=\"index.jsp#features\">Food delivery</a></li>\n");
      out.write("                        <li><a href=\"index.jsp#works\">How it works</a></li>\n");
      out.write("                        <li><a href=\"index.jsp#cities\">Our cities</a></li>\n");
      out.write("                        <li><a href=\"index.jsp#plans\">Select Plan</a></li>\n");
      out.write("                        <li><a href=\"signup.jsp\">Sign Up</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    <a class=\"mobile-nav-icon js--nav-icon\"><i class=\"ion-navicon-round\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"limiter\" style=\"height: 125%\">\r\n");
      out.write("            <div class=\"container-login\">\r\n");
      out.write("                <div class=\"wrap-login\" style=\"margin-top: -7%;\">\r\n");
      out.write("                    <div class=\"text-center\"> \r\n");
      out.write("                         <div class=\"container\">\r\n");
      out.write("                              ");

    String st="";
    try{
    st=request.getParameter("st");
    if(st.equals("1")){

      out.write("\r\n");
      out.write("                <h2 style=\"margin-top: -1%;\">Change password</h2>\r\n");
      out.write("          </div>\r\n");
      out.write("             ");

                 String m=request.getParameter("email");
             
      out.write("   \r\n");
      out.write("             <form action=\"chngpassServlet?email=");
      out.print( m);
      out.write("\" class=\"login-form\" method=\"post\" name=\"f1\" onsubmit=\"return validate();\">\r\n");
      out.write("                           \r\n");
      out.write("                            <div class=\"my-2 ml-2\"><span>New Password</span></div>\r\n");
      out.write("                            <div class=\"wrap-input\">\r\n");
      out.write("                                <input type=\"password\" name=\"new_password\" id=\"new_password\" class=\"inputcustom\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"my-2 ml-2\"><span>Confirm New Password</span></div>\r\n");
      out.write("                            <div class=\"wrap-input\">\r\n");
      out.write("                                <input type=\"password\" name=\"confirm_new_password\" class=\"inputcustom\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"text-center w-full b1\"><br><center>\r\n");
      out.write("                     <input type=\"submit\" value=\"Change password\" class=\"btn btn-ghost\"></center></div>\r\n");
      out.write("                            \r\n");
      out.write("                        </form>               \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        ");
      out.write("     <footer>\n");
      out.write("            <div class=\"row\">\n");
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
      out.write("                    Copyright &copy; 2019 by food factory. All rights reserved.\n");
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
      out.write("\r\n");
      out.write("         ");

            }
  else{
                 out.println("<script type=\"text/javascript\">");
                out.println("alert('Not allowed');");
                out.println("</script>");        
            }
}
catch(Exception e){
out.print("not allowed");
}
          
        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
