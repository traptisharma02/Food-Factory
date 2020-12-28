package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                     <ul class=\"contUL\">\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fas fa-home mr-3\"></i> sectorA-1 scheme no. 136, indore</li><br>\n");
      out.write("                            <li>\n");
      out.write("                              <i class=\"fas fa-envelope mr-3\"></i>foodfactory@gmail.com</li><br>\n");
      out.write("                            <li>\n");
      out.write("                              <i class=\"fas fa-phone mr-3\"></i> 9993387574</li><br>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         <div class=\"row\" style=\"margin-left: 35%\">\n");
      out.write("                <p>\n");
      out.write("                    Copyright &copy; 2021 by food factory. All rights reserved.\n");
      out.write("                </p>\n");
      out.write("             </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("   \n");
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
      out.write("     <script src=\"//cdn.jsdelivr.net/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/selectivizr/1.0.3b/selectivizr.min.js\"></script>\n");
      out.write("    <script src=\"../vendors/js/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"../resources/js/script.js\"></script>\n");
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
