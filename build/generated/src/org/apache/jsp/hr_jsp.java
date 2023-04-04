package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Applicants about</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            .hh{\n");
      out.write("                margin-left: 28%; \n");
      out.write("                text-align: center;\n");
      out.write("                width: 500px;\n");
      out.write("                height: 80px;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                border-radius: 50px;\n");
      out.write("            }\n");
      out.write("            .hh h1{\n");
      out.write("                margin-left:-30px; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"title\">\n");
      out.write("                <img src=\"img/glogo.png\" width=\"30px\" height=\"20px\" >\n");
      out.write("                <p> knowledge based </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"header-body\">\n");
      out.write("                <br><div class=\"hh\" align=\"center\"><h1>Welcome HR</h1></div><br>\n");
      out.write("                <a href=\"index.html\"><button class=\"btn3\">Log out</button></a>\n");
      out.write("                <br><br>\n");
      out.write("                <div class=\"search\">\n");
      out.write("                    <form action=\"search.jsp\" method=\"POST\" >\n");
      out.write("                        <input type=\"text\" name=\"search\" placeholder=\" search by email, name, exam type..\"><br><br>\n");
      out.write("                        <button class=\"btn3\" >search</button>                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"content1\">\n");
      out.write("                <div class=\"head1\"><h3>Applicants Results</h3></div>\n");
      out.write("                <div class=\"opt1\">\n");
      out.write("                <br>\n");
      out.write("                    <a href=\"list.jsp\">1 - List all applicants</a>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                    <a href=\"sumarize.jsp\">2 - show summarized report all Examed users</a>                    \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"content3\">\n");
      out.write("                <div class=\"head3\"><h3>Exam menu</h3></div>\n");
      out.write("                <div class=\"opt2\">\n");
      out.write("                <br>\n");
      out.write("                    <a href=\"exam_cms.jsp\">1 - Edit exam types</a>\n");
      out.write("                <br>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
