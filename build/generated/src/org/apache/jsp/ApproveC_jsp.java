package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ApproveC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("       <link href=\"vendors/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link href=\"vendors/css/datatables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendors/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level plugin JavaScript-->\n");
      out.write("    <script src=\"vendors/js/jquery.datatables.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"vendors/js/datatables.bootstrap4.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#dataTable').DataTable();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Position</th>\n");
      out.write("                    <th>Office</th>\n");
      out.write("                    <th>Age</th>\n");
      out.write("                    <th>Salary</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tfoot>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Position</th>\n");
      out.write("                    <th>Office</th>\n");
      out.write("                    <th>Age</th>\n");
      out.write("                    <th>Salary</th>\n");
      out.write("                </tr>\n");
      out.write("            </tfoot>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tiger Nixon</td>\n");
      out.write("                    <td>System Architect</td>\n");
      out.write("                    <td>Edinburgh</td>\n");
      out.write("                    <td>61</td>\n");
      out.write("                    <td>320,800</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Garrett Winters</td>\n");
      out.write("                    <td>Accountant</td>\n");
      out.write("                    <td>Tokyo</td>\n");
      out.write("                    <td>63</td>\n");
      out.write("                    <td>170,750</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ashton Cox</td>\n");
      out.write("                    <td>Junior Technical Author</td>\n");
      out.write("                    <td>San Francisco</td>\n");
      out.write("                    <td>66</td>\n");
      out.write("                    <td>86,000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Cedric Kelly</td>\n");
      out.write("                    <td>Senior Javascript Developer</td>\n");
      out.write("                    <td>Edinburgh</td>\n");
      out.write("                    <td>22</td>\n");
      out.write("                    <td>433,060</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Airi Satou</td>\n");
      out.write("                    <td>Accountant</td>\n");
      out.write("                    <td>Tokyo</td>\n");
      out.write("                    <td>33</td>\n");
      out.write("                    <td>162,700</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Brielle Williamson</td>\n");
      out.write("                    <td>Integration Specialist</td>\n");
      out.write("                    <td>New York</td>\n");
      out.write("                    <td>61</td>\n");
      out.write("                    <td>372,000</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Herrod Chandler</td>\n");
      out.write("                    <td>Sales Assistant</td>\n");
      out.write("                    <td>San Francisco</td>\n");
      out.write("                    <td>59</td>\n");
      out.write("                    <td>137,500</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Rhona Davidson</td>\n");
      out.write("                    <td>Integration Specialist</td>\n");
      out.write("                    <td>Tokyo</td>\n");
      out.write("                    <td>55</td>\n");
      out.write("                    <td>327,900</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Colleen Hurst</td>\n");
      out.write("                    <td>Javascript Developer</td>\n");
      out.write("                    <td>San Francisco</td>\n");
      out.write("                    <td>39</td>\n");
      out.write("                    <td>205,500</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Sonya Frost</td>\n");
      out.write("                    <td>Software Engineer</td>\n");
      out.write("                    <td>Edinburgh</td>\n");
      out.write("                    <td>23</td>\n");
      out.write("                    <td>103,600</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Jena Gaines</td>\n");
      out.write("                    <td>Office Manager</td>\n");
      out.write("                    <td>London</td>\n");
      out.write("                    <td>30</td>\n");
      out.write("                    <td>90,560</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write(" \n");
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
