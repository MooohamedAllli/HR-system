package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>test Page</title>\n");
      out.write("        <script>\n");
      out.write("        function getval()\n");
      out.write("        {   var checkedValue=null;\n");
      out.write("            var inputElements=document.getElementsByClassName(\"checkbox\");\n");
      out.write("            for (var i=0;inputElements[i];i++)\n");
      out.write("            {\n");
      out.write("                if(inputElements[i].checked)\n");
      out.write("                {\n");
      out.write("                    checkedValue=inputElements[i].value;\n");
      out.write("                    break;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("            function selectonlyone(current_clicked)                                    \n");
      out.write("            { \n");
      out.write("                var cboxes=document.getElementByName('mail[]');\n");
      out.write("                var len =cboxes.length;\n");
      out.write("                for(var i=0;i<len;i++)\n");
      out.write("                {\n");
      out.write("                    cboxes[i].checked=(cboxes[i]==currenr);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }    \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>IQ test !</h1>\n");
      out.write("        \n");
      out.write("        ");

                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3300/hrsystem";
                String user_name = "root";
                String password = "0000";
                Connection Con = null;
                Statement stat = null;
                Con = DriverManager.getConnection(url,user_name,password);
                stat = Con.createStatement();
                
                String q = "SELECT * from question where qtype ='IQ' ";
                ResultSet rs = stat.executeQuery(q);
                while(stat.executeQuery(q).next())
                {
                    String qtype = rs.getString("qtype");
                    String qtext = rs.getString("qtext");
                    String qid = rs.getString("qid");
                    out.println(qid);
                    out.println(" ) ");
                    out.println(qtype);
                    out.println(qtext);
                    out.print("</br>");
                    String q2 =  "SELECT * from ans where qid= '5'" ;
                    ResultSet rs2 = stat.executeQuery(q2);
                    while(rs2.next())
                    {
                        String correct =rs2.getString("correct");
                        out.print("<form onsubmit=selectonlyone() onsubmit=getval() >");
                        out.print("<input type='checkbox' name='' id='' checked='' >");
                        String atext = rs2.getString("atext");
                        out.print(atext);
                        out.print("</br>");
                    }


                }
                
            
        
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
