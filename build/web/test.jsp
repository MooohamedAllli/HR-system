<%-- 
    Document   : test
    Created on : Dec 24, 2019, 11:41:07 PM
    Author     : eman
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>test Page</title>
        <script>
        function getval()
        {   var checkedValue=null;
            var inputElements=document.getElementsByClassName("checkbox");
            for (var i=0;inputElements[i];i++)
            {
                if(inputElements[i].checked)
                {
                    checkedValue=inputElements[i].value;
                    break;
                }
            }
        }
    
    

            function selectonlyone(current_clicked)                                    
            { 
                var cboxes=document.getElementByName('mail[]');
                var len =cboxes.length;
                for(var i=0;i<len;i++)
                {
                    cboxes[i].checked=(cboxes[i]==currenr);
                }

            }    

        </script>
    </head>
    <body>
        <h1>IQ test !</h1>
        
        <%
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
                
            
        %>
    </body>
</html>
