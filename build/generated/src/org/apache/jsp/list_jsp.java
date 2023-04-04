package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.DB;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View list</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: lightgray ; \n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div ><a href=\"hr.jsp\"><button class=\"back\">back</button></a></div><br>\n");
      out.write("        <div ><a href=\"list.jsp\"><button class=\"back\">Refresh</button></a></div>\n");
      out.write("\n");
      out.write("        <h1>All Applicants Waiting</h1>\n");
      out.write("        ");

            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate` ");
        
      out.write("     \n");
      out.write("\n");
      out.write("        <div class=\"table-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>first name</th>\n");
      out.write("                    <th>second name</th>\n");
      out.write("                    <th>mail</th>\n");
      out.write("                    <th>CV</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
 while (rs.next()){
                String id = rs.getString("id") ;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString("fname") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("sname") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("mail") );
      out.write("</td>\n");
      out.write("                    <td><a href=\"img/CV.pdf\"><button  class=\"napp\">View CV</button></a></td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"apr?id=");
      out.print(rs.getString("id"));
      out.write("\"><button  class=\"napp\">Aprove</button></a>\n");
      out.write("                        <a href=\"dis?id=");
      out.print(rs.getString("id"));
      out.write("\"><button  class=\"app\">disaprove</button></a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        ");

            }catch(Exception e){
                out.println(e);
            }
        
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"line\"></div>\n");
      out.write("\n");
      out.write("        <h1>All Applicants Approved and examed</h1>\n");
      out.write("        ");

            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate` ");
        
      out.write("     \n");
      out.write("\n");
      out.write("        <div class=\"table-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>first name</th>\n");
      out.write("                    <th>second name</th>\n");
      out.write("                    <th>mail</th>\n");
      out.write("                    <th>View</th>\n");
      out.write("                    <th>CV</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
 while (rs.next()){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");
String id = rs.getString("id");
      out.write("\n");
      out.write("                    <td>");
      out.print(rs.getString("fname") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("sname") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("mail") );
      out.write("</td>\n");
      out.write("                    <td><a href=\"answers.jsp?id=");
      out.print(id);
      out.write("\"><button class=\"app\">Answers</button></a></td>\n");
      out.write("                    <td><a href=\"img/CV.pdf\"><button  class=\"napp\">View CV</button></a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        ");

            }catch(Exception e){
                out.println(e);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"line\"></div>\n");
      out.write("\n");
      out.write("        <h1>All Applicants non Approved</h1>\n");
      out.write("        ");

            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate` ");
        
      out.write("     \n");
      out.write("\n");
      out.write("        <div class=\"table-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>first name</th>\n");
      out.write("                    <th>second name</th>\n");
      out.write("                    <th>mail</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
 while (rs.next()){
                    String id = rs.getString("id") ;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getString("fname") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("sname") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("mail") );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        ");

            }catch(Exception e){
                out.println(e);
            }
        
      out.write("\n");
      out.write("\n");
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
