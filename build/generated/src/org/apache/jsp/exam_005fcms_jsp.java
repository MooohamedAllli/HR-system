package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.DB;
import java.sql.*;

public final class exam_005fcms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Exam Edit</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            table ,td ,th{\n");
      out.write("                width: 70%;\n");
      out.write("                margin: auto;\n");
      out.write("                border: 1px solid #546e7a ;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 15px;\n");
      out.write("                background-color: white;\n");
      out.write("                color: #546e7a;\n");
      out.write("                table-layout: fixed;\n");
      out.write("            }\n");
      out.write("            .app{\n");
      out.write("                background: #f44336;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .napp{\n");
      out.write("                background: #fdd835;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .back{\n");
      out.write("                width: 80px;\n");
      out.write("                height: 30px;\n");
      out.write("                color: white;\n");
      out.write("                background: #546e7a;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            .app:hover , .napp:hover , .back:hover{\n");
      out.write("                color: seagreen;\n");
      out.write("                transition: 0.4s;\n");
      out.write("            }\n");
      out.write("            .line{\n");
      out.write("                width: 0auto;\n");
      out.write("                border-bottom: 1px solid;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br>\n");
      out.write("        <div ><a href=\"hr.jsp\"><button class=\"back\">back</button></a></div><br>\n");
      out.write("        <div ><a href=\"exam_cms.jsp\"><button class=\"back\">Refresh</button></a></div>\n");
      out.write("        <br><br><br>\n");
      out.write("        ");

            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `qtype`");
        
      out.write("     \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"table-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Type ID</th>\n");
      out.write("                    <th>Question type</th>\n");
      out.write("                    <th>Question ref</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
 while (rs.next()){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString("tid") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("type") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("ref") );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"manageQus.jsp?id=");
      out.print(rs.getString("type"));
      out.write("\"><button  class=\"app\">View qusetion</button></a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

            }catch(Exception e){
                out.println(e);
            }
        
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("        <form action=\"addType.jsp\" method=\"post\">\n");
      out.write("            <button  class=\"napp\">Add Category</button>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"update_categ.jsp\" method=\"post\">\n");
      out.write("            <button  class=\"napp\">update Category</button>\n");
      out.write("            <input type=\"text\" name=\"ftid\" placeholder=\"Enter Type ID\">\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"Deletetype\" method=\"post\">\n");
      out.write("            <button  class=\"napp\">Delete Category</button>\n");
      out.write("            <input type=\"text\" name=\"tid\" placeholder=\"Enter Type ID\">\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("        </div>\n");
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
