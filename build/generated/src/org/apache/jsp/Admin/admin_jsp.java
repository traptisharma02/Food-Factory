package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import DB.DBConnection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/header3.jsp");
    _jspx_dependants.add("/Admin/../footer.jsp");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

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
      out.write("\n");
      out.write(" ");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"Omnifood is a premium food delivery service with the mission to bring affordable and healty meals to as many people as possible.\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/approve.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/queries.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,300italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <title>Omnifood</title>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a href=\"admin.jsp\"> <img src=\"../resources/img/logo-white.png\" alt=\"Omnifood logo\" class=\"logo\">\n");
      out.write("                    <img src=\"../resources/img/logo.png\" alt=\"Omnifood logo\" class=\"logo-black\"></a>\n");
      out.write("                    <ul class=\"main-nav js--main-nav\">\n");
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
      out.write("            <div class=\"hero-text-box\">\n");
      out.write("                <h1>WELCOME<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Admin</h1>\n");
      out.write("                <a class=\"btn btn-full js--scroll-to-plans\" href=\"#planChg\">Change plan</a>\n");
      out.write("                <a class=\"btn btn-ghost js--scroll-to-start\" href=\"#todayM\">Add Today's Meal</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("</header>\n");
      out.write("        \n");
      out.write("        <button onclick=\"window.scrollTo(0, 0); \" id=\"myBtn\" title=\"Go to top\" ><i class=\"ion-arrow-up-c\"></i></button>\n");
      out.write("        \n");
      out.write("        <section class=\"section-form js--section-plans\" id=\"planChg\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h2>Change plans </h2>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

             
             try{
                    PreparedStatement ps=con.prepareStatement("select * from meal");
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                
      out.write("\n");
      out.write("                <div class=\"col span-1-of-3\">\n");
      out.write("                    <div class=\"plan-box js--wp-4\">\n");
      out.write("                        <div>\n");
      out.write("                            <h3>");
      out.print(rs.getString("category") );
      out.write("</h3>\n");
      out.write("                            <p class=\"plan-price\">$");
      out.print(rs.getString("price") );
      out.write("<span>");
      out.print(rs.getString("validity") );
      out.write("</span></p>\n");
      out.write("                            ");

                                int oneP=0;
                                if(rs.getString("inter").equals("1"))
                                    oneP=(Integer.parseInt(rs.getString("price")));
                                else if(rs.getString("inter").equals("3"))
                                    oneP=(Integer.parseInt(rs.getString("price")))/3;
                                else
                                    oneP=(Integer.parseInt(rs.getString("price")))/30;
                            
      out.write("\n");
      out.write("                            <p class=\"plan-price-meal\">That's only ");
      out.print( oneP);
      out.write(" per meal</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>Total&nbsp;");
      out.print(rs.getString("inter") );
      out.write(" meal</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>");
      out.print(rs.getString("orderTiming") );
      out.write("</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>");
      out.print(rs.getString("accessNew") );
      out.write("</li>\n");
      out.write("                                <li><i class=\"ion-ios-checkmark-empty icon-small\"></i>");
      out.print(rs.getString("freeDelivery") );
      out.write("</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"ChngPlan.jsp?category=");
      out.print(rs.getString("category") );
      out.write("\" class=\"btn btn-ghost\">Update Plan</a>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                     </div>\n");
      out.write("               \n");
      out.write("                            </div>\n");
      out.write("                    ");

                        }
                       
                        }catch(Exception e){e.printStackTrace();}
                    
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("             \n");
      out.write("         <section class=\"section-steps\" id=\"todayM\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h2>Add Today's Meal</h2>\n");
      out.write("            </div>\n");
      out.write("             <form method=\"post\" action=\"../TodayMealServlet\" class=\"contact-form\" id=\"todayMe\" enctype=\"multipart/form-data\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <center> \n");
      out.write("                       <div class=\"col span-3-of-3\" >\n");
      out.write("                                             <script>\n");
      out.write("                                     var loadFile = function(event) {\n");
      out.write("                                             var image = document.getElementById('output');\n");
      out.write("                                             image.src = URL.createObjectURL(event.target.files[0]);\n");
      out.write("                                     };\n");
      out.write("                                     </script>\n");
      out.write("                                     <div class=\"container\">\n");
      out.write("                             <p><img id=\"output\" width=\"200\" src=\"../resources/img/upload.png\" /></p>\n");
      out.write("                              <input type=\"file\" class=\"inputcustom \" accept=\"image/*\"  onchange=\"loadFile(event)\" oninput=\"this.className = ''\" name=\"ImageFile\" id=\"ImageFile\" style=\"width: 35%\">\n");
      out.write("\n");
      out.write("                                             \n");
      out.write("                                            <script>\n");
      out.write("                                                                   var loadFile = function(event) {\n");
      out.write("                                                                       var image = document.getElementById('output');\n");
      out.write("                                                                       image.src = URL.createObjectURL(event.target.files[0]);\n");
      out.write("                                                                   };\n");
      out.write("                                            </script>\n");
      out.write("                                     </div></div>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"i1\">Item 1</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <input type=\"text\" name=\"i1\" id=\"i1\" placeholder=\"Enter Item 1 name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                         <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"i2\">Item 2</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <input type=\"text\" name=\"i2\" id=\"i2\" placeholder=\"Enter Item 2 name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <div class=\"col span-1-of-3\">\n");
      out.write("                            <label for=\"i3\">Item 3</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col span-2-of-3\">\n");
      out.write("                            <input type=\"text\" name=\"i3\" id=\"i3\" placeholder=\"Enter Item 3 name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                         <div class=\"text-center w-full \"><br><center>\n");
      out.write("                      <input type=\"submit\" value=\"Add Meal\" class=\"btn btn-ghost\"></center></div>\n");
      out.write("                </form>\n");
      out.write("        </section>\n");
      out.write("   ");

       }
   
      out.write("\n");
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
