package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import common.DB;

public final class approved_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link href=\"newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            h4{\n");
      out.write("                margin-left: 42%;\n");
      out.write("            }\n");
      out.write("            table , th , td{\n");
      out.write("                width: 30%;\n");
      out.write("                border: 1px solid;\n");
      out.write("                cell-padding: 0;\n");
      out.write("                height: auto;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                width: 60px;\n");
      out.write("                background-color: yellowgreen;\n");
      out.write("                border-radius:10px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            button:hover{\n");
      out.write("                width: 70px;\n");
      out.write("                background-color: red;\n");
      out.write("                transition: 0.7s;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id =request.getSession().getAttribute("cid").toString();
            try {
            DB conn2 = new DB();
            Connection conn = conn2.connector(); 
            Statement stmt = conn.createStatement();
                String q = "SELECT * FROM candidate where cid = '" + id + "' ";
                ResultSet rs = stmt.executeQuery(q);
                if(rs.next()){
                    
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-body\">\n");
      out.write("                <br><br>                \n");
      out.write("                <a href=\"start.html\"><button class=\"btn3\">Log out</button></a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <h4>");
out.print("Welcome" + " " +rs.getString("fname"));
      out.write("<h4>");

                }

            }catch(Exception e){
           }
        
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <br><br>\n");
      out.write("        </div>\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Type</td>\n");
      out.write("                <td>deadline</td>\n");
      out.write("                <td>Action</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Programming</td>\n");
      out.write("                <td>29/12/2019</td>\n");
      out.write("                <td><a href=\"exampro.jsp?id=");
      out.print(id);
      out.write("\"><button>start</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>IQ test</td>\n");
      out.write("                <td>30/12/2019</td>\n");
      out.write("                <td><a href=\"examiq.jsp?id=");
      out.print(id);
      out.write("\"><button>start</button></a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
