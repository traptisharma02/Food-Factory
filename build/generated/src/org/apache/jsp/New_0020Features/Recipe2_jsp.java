package org.apache.jsp.New_0020Features;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Recipe2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>Food factory</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS CDN -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Our Custom CSS -->\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"assets/css/style.css\"/>\n");
      out.write("    <!-- Scrollbar Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome JS -->\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\" integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- firebase -->\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/5.2.0/firebase.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("     <!-- Firebase -->\n");
      out.write("    <script src=\"https://www.gstatic.com/firebasejs/5.2.0/firebase.js\"></script>\n");
      out.write("  \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write(" <nav>\n");
      out.write("     <span> <a onclick=\"openNav()\" class='openBtn nav12'>&#9776;</a></span>\n");
      out.write("     <span><a href=\"../index.jsp\" class=\"nav12\">Home</a></span>\n");
      out.write("     <span><a href=\"index.jsp\" class=\"nav12\">Restaurents</a></span>\n");
      out.write("  </nav>    <!-- Sidebar  -->\n");
      out.write("        <nav id=\"sidebar\">\n");
      out.write("             <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a><br><br>\n");
      out.write("            <div class=\"sidebar-header\">\n");
      out.write("                <h2>Ingredients</h2>\n");
      out.write("                  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled components\">\n");
      out.write("                <p>Choose Ingredients</p>\n");
      out.write("                <li class=\"active\">                   \n");
      out.write("                    <img src=\"assets/images/milk-eggs.png\" alt=\"Dairy\" height=\"50\" width=\"50\" class=\"Ing_Icon\">\n");
      out.write("                    <a href=\"#dairySubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Dairy</a>                  \n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"dairySubmenu\">\n");
      out.write("\n");
      out.write("                         <!--Dairy ingredients will be displayed here-->\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>               \n");
      out.write("                <li>\n");
      out.write("                    <img src=\"assets/images//Vegetables.jpg\" alt=\"Dairy\" height=\"50\" width=\"50\" class=\"Ing_Icon\">\n");
      out.write("                    <a href=\"#veggieSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Vegetables</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"veggieSubmenu\">\n");
      out.write("\n");
      out.write("                            <!--Vegetables ingredients will be displayed here-->\n");
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"assets/images//fruits.jpg\" alt=\"Dairy\" height=\"50\" width=\"50\" class=\"Ing_Icon\">\n");
      out.write("                    <a href=\"#fruitsSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Fruits</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"fruitsSubmenu\">\n");
      out.write("\n");
      out.write("                            <!--Fruits ingredients will be displayed here-->\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img src=\"assets/images//BakingAndGrains.jpg\" alt=\"Dairy\" height=\"50\" width=\"50\" class=\"Ing_Icon\">\n");
      out.write("                    <a href=\"#BGSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Baking & Grains</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"BGSubmenu\">\n");
      out.write("\n");
      out.write("                            <!--bakery and grains ingredients will be displayed here-->\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>              \n");
      out.write("            </ul>\n");
      out.write("            <button id=\"searchButton\" type=\"submit\" class=\"btn btn-primary\">Search</button>\n");
      out.write("            <button id=\"favouritesButton\" type=\"submit\" class=\"btn\">Favorites</button>\n");
      out.write("            <button id=\"randomRecipeButton\" type=\"submit\" class=\"btn btn-info\">Random Recipe!</button>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Page Content  -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <img class=\"col-md-12\" class=\"logo\" src = \"assets/images/Logo.jpg\">\n");
      out.write("          \n");
      out.write("            <center>\n");
      out.write("            <div class=\"container\" style=\"width: 95%\">    \n");
      out.write("                             \n");
      out.write("\n");
      out.write("                    <!-- recipe cards will be displayed here -->\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <!-- velocity -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/velocity-animate@2.0/velocity.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/velocity-animate@2.0/velocity.ui.min.js\"></script>\n");
      out.write("    <!-- our javascript -->\n");
      out.write("    <script src=\"assets/javascript/app.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Popper.JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- jQuery Custom Scroller CDN -->\n");
      out.write("\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script> \n");
      out.write("    <!-- Script -->\n");
      out.write("    <script src=\"assets/javascript/app.js\"></script>    \n");
      out.write("\n");
      out.write(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("    \n");
      out.write("\n");
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
