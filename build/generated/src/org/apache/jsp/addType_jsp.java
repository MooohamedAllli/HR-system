package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.DB;
import java.sql.*;

public final class addType_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("        <form action=\"addType.jsp\" method=\"post\" align=\"center\">\n");
      out.write("            <input type=\"text\" name=\"tid\" placeholder=\"Enter Type ID\">\n");
      out.write("            <input type=\"text\" name=\"type\" placeholder=\"Enter Type ID\">\n");
      out.write("            <input type=\"text\" name=\"ref\" placeholder=\"Enter Type ID\">\n");
      out.write("            <button  class=\"napp\">Add Category</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            String n = request.getParameter("tid");
            String n1 = request.getParameter("type");
            String n2 = request.getParameter("ref");
            
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
                
                stmt.executeUpdate("INSERT INTO `qtype`(`tid`, `ref`, `type`) VALUES ( '"+n+"' , '"+n1+"' , '"+n2+"' )");
                response.sendRedirect("exam_cms.jsp");
            }catch(Exception e){}
        
      out.write("     \n");
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
