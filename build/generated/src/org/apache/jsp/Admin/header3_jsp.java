package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"Omnifood is a premium food delivery service with the mission to bring affordable and healty meals to as many people as possible.\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../vendors/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/css/queries.css\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,300italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <title>Omnifood</title>\n");
      out.write("        \n");
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
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("                        <nav>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a href=\"admin.jsp\"> <img src=\"../resources/img/logo-white.png\" alt=\"Omnifood logo\" class=\"logo\">\n");
      out.write("                    <img src=\"../resources/img/logo.png\" alt=\"Omnifood logo\" class=\"logo-black\"></a>\n");
      out.write("                    <ul class=\"main-nav js--main-nav\">\n");
      out.write("                        <li><a href=\"TodayDel.jsp\">Today's Deliveries</a></li>\n");
      out.write("                        <li><a href=\"ApproveC.jsp\">Approve user</a></li>\n");
      out.write("                        <li><a href=\"ApprovePay.jsp\">Approve payment</a></li>\n");
      out.write("                        <li><a href=\"ViewCustomer.jsp\">View Customers</a></li>\n");
      out.write("                         <li><a href=\"../ALoginIn.jsp\">logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a class=\"mobile-nav-icon js--nav-icon\"><i class=\"ion-navicon-round\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("               ");
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
