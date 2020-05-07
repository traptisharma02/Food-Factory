package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header2.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" ");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a href=\"index.jsp\"> <img src=\"resources/img/logo-white.png\" alt=\"Omnifood logo\" class=\"logo\">\n");
      out.write("                    <img src=\"resources/img/logo.png\" alt=\"Omnifood logo\" class=\"logo-black\"></a>\n");
      out.write("                    <ul class=\"main-nav js--main-nav\">\n");
      out.write("                        <li><a href=\"welcome.jsp#plans\">Select new plan</a></li>\n");
      out.write("                        <li><a href=\"#uPlan\">Plans you selected</a></li>\n");
      out.write("                         <li><a href=\"index.jsp\">logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a class=\"mobile-nav-icon js--nav-icon\"><i class=\"ion-navicon-round\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>");
      out.write("\n");
      out.write("            <div class=\"hero-text-box\">\n");
      out.write("                <h1>WELCOME<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Trapti</h1>\n");
      out.write("                <a class=\"btn btn-full js--scroll-to-plans\" href=\"#\">I'm hungry</a>\n");
      out.write("                <a class=\"btn btn-ghost js--scroll-to-start\" href=\"#\">Show me more</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("</header>\n");
      out.write("        <button onclick=\"topFunction()\" id=\"myBtn\" title=\"Go to top\">Top</button>\n");
      out.write("        <section class=\"section-plans js--section-plans\" id=\"plans\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h2>Start eating healthy today</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col span-1-of-3\">\n");
      out.write("                    <div class=\"plan-box js--wp-4\">\n");
      out.write("                        <div>\n");
      out.write("                            <h3>Premium</h3>\n");
      out.write("                            <p class=\"plan-price\">$399 <span>/ month</span></p>\n");
      out.write("                            <p class=\"plan-price-meal\">That's only 13.30$ per meal</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>1 meal every day</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Order 24/7</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Access to newest creations</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Free delivery</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"signup.jsp\" class=\"btn btn-full\">Select</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col span-1-of-3\">\n");
      out.write("                    <div class=\"plan-box\">\n");
      out.write("                        <div>\n");
      out.write("                            <h3>Pro</h3>\n");
      out.write("                            <p class=\"plan-price\">$149 <span>/ month</span></p>\n");
      out.write("                            <p class=\"plan-price-meal\">That's only 14.90$ per meal</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>1 meal 10 days/month</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Order 24/7</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Access to newest creations</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Free delivery</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"signup.jsp\" class=\"btn btn-ghost\">Select</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col span-1-of-3\">\n");
      out.write("                    <div class=\"plan-box\">\n");
      out.write("                        <div>\n");
      out.write("                            <h3>Starter</h3>\n");
      out.write("                            <p class=\"plan-price\">19$ <span>/ meal</span></p>\n");
      out.write("                            <p class=\"plan-price-meal\">&nbsp;</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>1 meal</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Order from 8 am to 12 pm</li>\n");
      out.write("                                <li><i class=\"ion-ios-close-empty icon-small\"></i></li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Free delivery</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"signup.jsp\" class=\"btn btn-ghost\">Select</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section class=\"section-form\" id=\"Uplan\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h2>Here are your existing plans </h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <form method=\"post\" action=\"#\" class=\"contact-form\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"category\">Category</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <input type=\"text\" name=\"category\" id=\"category\" value=\"Pro\" readonly>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"price\">Price</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <input type=\"text\" name=\"price\" id=\"price\" value=\"$149 \" readonly>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"selectedD\">Plan selected at</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <input type=\"text\" name=\"selectedD\" id=\"selectedD\" value=\"Price\" readonly>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"due\">Plan due date</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <input type=\"text\" name=\"due\" id=\"due\" value=\"due\" readonly>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"exFeatures\">Other features</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <textarea name=\"exFeatures\" id=\"exFeatures\" rows\"2\" readonly >1 meal 10 days/month.  Order 24/7.  \n");
      out.write("                            Free delivery</textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("          <!-- Footer Links -->\n");
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
