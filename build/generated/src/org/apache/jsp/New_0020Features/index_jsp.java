package org.apache.jsp.New_0020Features;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en-us\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.6-rc.0/css/select2.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"../resources/css/index.css\" rel=\"stylesheet\" />\n");
      out.write("  <title>Food factory</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <!-- <body onload=\"checkSecure();\"> -->\n");
      out.write("  <!-- Top Nav Bar -->\n");
      out.write("  <nav>\n");
      out.write("    <a onclick=\"openNav()\">&#9776;</a>\n");
      out.write("    <span>Where to eat</span>\n");
      out.write("  </nav>\n");
      out.write("  <!-- Top Nav Bar Ends -->\n");
      out.write("\n");
      out.write("  <!-- Settings Side Nav -->\n");
      out.write("  <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("    <!-- Title -->\n");
      out.write("    <h1>Settings</h1>\n");
      out.write("    <!-- Latitude -->\n");
      out.write("    <label for=\"lat\">Latitude: </label>\n");
      out.write("    <input id=\"lat\" type=\"text\" name=\"Latitude\" placeholder=\"\">\n");
      out.write("    <!-- Longitude -->\n");
      out.write("    <label for=\"lng\">Longitude: </label>\n");
      out.write("    <input id=\"lng\" type=\"text\" name=\"Longitude\" placeholder=\"\">\n");
      out.write("    <!-- Travel Mode -->\n");
      out.write("    <label for=\"travel\">Travel mode:</label>\n");
      out.write("    <select id=\"travelMode\">\n");
      out.write("      <option value=\"\" selected disabled hidden>Select travel mode</option>\n");
      out.write("      <option value=\"driving\">Driving</option>\n");
      out.write("      <option value=\"walking\">Walking</option>\n");
      out.write("      <option value=\"bicycling\">Bicycling</option>\n");
      out.write("      <option value=\"transit\">Transit</option>\n");
      out.write("    </select>\n");
      out.write("    <!-- Results Count -->\n");
      out.write("    <label for=\"results\">Results count: (MAX 20)</label>\n");
      out.write("    <br/>\n");
      out.write("    <input id=\"results\" type=\"text\" name=\"Results\" placeholder=\"\">\n");
      out.write("    <!-- Maximum miles -->\n");
      out.write("    <label for=\"miles\">Maximum miles radius: </label>\n");
      out.write("    <br/>\n");
      out.write("    <input id=\"miles\" type=\"text\" name=\"Miles\" placeholder=\"\">\n");
      out.write("    <!-- Sort -->\n");
      out.write("    <label for=\"sort\">Sort by:</label>\n");
      out.write("    <br/>\n");
      out.write("    <select id=\"sort\">\n");
      out.write("      <option value=\"\" selected disabled hidden>Selected sort</option>\n");
      out.write("      <option value=\"cost\">Cost</option>\n");
      out.write("      <option value=\"rating\">Rating</option>\n");
      out.write("      <option value=\"real_distance\">Distance</option>\n");
      out.write("    </select>\n");
      out.write("    <!-- Order -->\n");
      out.write("    <label for=\"results\">Order by:</label>\n");
      out.write("    <select id=\"order\">\n");
      out.write("      <option value=\"\" selected disabled hidden>Select order</option>\n");
      out.write("      <option value=\"asc\">Ascending</option>\n");
      out.write("      <option value=\"desc\">Descending</option>\n");
      out.write("    </select>\n");
      out.write("    <button class=\"btn\" onclick=\"applySettings();\"> Apply Settings</button>\n");
      out.write("  </div>\n");
      out.write("  <!-- Settings Side Nav ends -->\n");
      out.write("<div class=\"container\">\n");
      out.write("  <!-- Queries -->\n");
      out.write("  <div id=\"queries\">\n");
      out.write("    <!-- Select Category -->\n");
      out.write("    <div class=\"boxes\">\n");
      out.write("      <label for=\"categories\">Filter by categories</label>\n");
      out.write("      <select id=\"categories\" name=\"category\">\n");
      out.write("        <option value=\"\" disabled selected hidden>Please choose a category</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("    <!-- Select Cuisines -->\n");
      out.write("    <div class=\"boxes\">\n");
      out.write("      <label for=\"cuisines\">Filter by cuisines</label>\n");
      out.write("      <select id=\"cuisines\" name=\"cuisines\">\n");
      out.write("        <option value=\"\" disabled selected hidden>Please choose a cuisine</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("    <!-- Search Query -->\n");
      out.write("     <button class=\"btn\" onclick=\"applyAll();\">\n");
      out.write("      <span>Apply any!</span>\n");
      out.write("    </button>\n");
      out.write("  </div>\n");
      out.write("  <!-- Queries end -->\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <!-- Map Canvas -->\n");
      out.write("  <div id=\"map-canvas\">\n");
      out.write("    <h3>Loading.... Please wait...</h3>\n");
      out.write("  </div>\n");
      out.write("  <!-- Map Canvas end -->\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Restaurants -->\n");
      out.write("  <div class=\"cardCont\">\n");
      out.write("  <div class=\"card\" id=\"restaurants\">\n");
      out.write("\n");
      out.write("  </div></div>\n");
      out.write("  <!-- Restaurants end -->\n");
      out.write("  <!-- Scripts -->\n");
      out.write("  <script src=\"cordova.js\"></script>\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAN9Dwitb2cjEuouUSW2As_Ot5vrzLmhY0&libraries=geometry\"></script>\n");
      out.write("  <script src=\"../resources/js/index.js\"></script>\n");
      out.write("  <!-- End of body -->\n");
      out.write("</body>\n");
      out.write("\n");
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
