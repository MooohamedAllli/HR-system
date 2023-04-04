package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import common.DB;
import java.sql.*;

public final class update_005fcateg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update Category Page</title>\n");
      out.write("        <style>\n");
      out.write("            .napp{\n");
      out.write("                background: #fdd835;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .napp:hover {\n");
      out.write("                color: seagreen;\n");
      out.write("                transition: 0.4s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("        <form action=\"UpdateCateg\" method=\"post\" align=\"center\">\n");
      out.write("            <input type=\"text\" name=\"tid\" placeholder=\"Enter New Type ID...\">\n");
      out.write("        <br><br>\n");
      out.write("            <input type=\"text\" name=\"type\" placeholder=\"Enter New Type Name...\">\n");
      out.write("        <br><br>\n");
      out.write("            <input type=\"text\" name=\"ref\" placeholder=\"Enter Type Nem ref..\">\n");
      out.write("        <br><br>\n");
      out.write("            <button  class=\"napp\">Update Category</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            String fixed_n = (request.getParameter("ftid"));

            HttpSession scn = request.getSession();
            scn.setAttribute("old_id", fixed_n);
            
            String n =  request.getParameter("tid");
            String n1 = request.getParameter("type");
            String n2 = request.getParameter("ref");

            scn.setAttribute("old_id1", n);
            scn.setAttribute("new1", n1);
            scn.setAttribute("new2", n2);


            /*
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("UPDATE `qtype` SET `tid`= "+n+" , `ref`='"+n1+"' ,`type`= '"+n2+"' WHERE `tid`= "+fixed_n+" ");
                response.sendRedirect("exam_cms.jsp");
            }catch(Exception e){}
            */
        
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
