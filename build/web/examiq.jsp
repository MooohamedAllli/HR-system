<%@page import="java.sql.ResultSet"%>
<%@page import="common.DB"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .test{
                margin-left: 25%;
                background-color: #37474f;
                color: white;
                font-size: 20px;
                width: 400px;
                height: 500px;
                text-align: center;
                padding: 10px;
            }
            button{
                width: 70px;
                background-color: #f44336;
                color:white;
                border-style: none;
                border-radius: 10px;
            }
        </style>
    </head>
    <body>
        <div class="test">

        <form action="insert" method="POST">
        <h1>IQ test !</h1>
        
        <%
            String cid = request.getParameter("id");
            session.setAttribute("cid", cid);

            DB conn2 = new DB();
            Connection conn = conn2.connector(); 
            Statement stmt = conn.createStatement();

            String q = "SELECT * from question where type ='IQ' ORDER BY RAND() LIMIT 1";
            ResultSet rs = stmt.executeQuery(q);
            if(rs.next())
            {
                String qtype = rs.getString("type");
                String qtext = rs.getString("qtext");
                String qid = rs.getString("qid");
                out.println(qid);
                out.println(" ) ");
                out.println(qtype);
                out.println(qtext);
                out.print("</br>");
                String q2 =  "SELECT * from ans where qid = '"+qid+"' ORDER BY RAND() LIMIT 4" ;
                ResultSet rs2 = stmt.executeQuery(q2);
                while(rs2.next())
                {
                    %><input type="radio" name= "q1" value="<%
                        out.println(rs2.getString("ansid"));
                        session.setAttribute("a1", rs2.getString("ansid"));
                        
                    %>"><%
                    out.println(rs2.getString("atext"));
                }
            }                

            %><br><br><%
            q = "SELECT * from question where type ='IQ'";
            rs = stmt.executeQuery(q);
            if(rs.next())
            {
                String qtype = rs.getString("type");
                String qtext = rs.getString("qtext");
                String qid = rs.getString("qid");
                out.println(qid);
                out.println(" ) ");
                out.println(qtype);
                out.println(qtext);
                out.print("</br>");
                String q2 =  "SELECT * from ans where qid = '"+qid+"'" ;
                ResultSet rs2 = stmt.executeQuery(q2);
                while(rs2.next())
                {
                    %><input type="radio" name= "q2" value="<%
                        out.println(rs2.getString("ansid"));
                        session.setAttribute("a2", rs2.getString("ansid"));
                        
                    %>"><%
                    out.println(rs2.getString("atext"));
                }
            }                

            %><br><br><%
            q = "SELECT * from question where type ='IQ' ORDER BY RAND() LIMIT 1";
            rs = stmt.executeQuery(q);
            if(rs.next())
            {
                String qtype = rs.getString("type");
                String qtext = rs.getString("qtext");
                String qid = rs.getString("qid");
                out.println(qid);
                out.println(" ) ");
                out.println(qtype);
                out.println(qtext);
                out.print("</br>");
                String q2 =  "SELECT * from ans where qid = '"+qid+"'" ;
                ResultSet rs2 = stmt.executeQuery(q2);
                while(rs2.next())
                {
                    %><input type="radio" name= "q3" value="<%
                        out.println(rs2.getString("ansid"));
                        session.setAttribute("a3", rs2.getString("ansid"));
                        
                    %>"><%
                    out.println(rs2.getString("atext"));
                }
            }                

            %><br><br><%
            q = "SELECT * from question where type ='IQ' ORDER BY RAND() LIMIT 1";
            rs = stmt.executeQuery(q);
            if(rs.next())
            {
                String qtype = rs.getString("type");
                String qtext = rs.getString("qtext");
                String qid = rs.getString("qid");
                out.println(qid);
                out.println(" ) ");
                out.println(qtype);
                out.println(qtext);
                out.print("</br>");
                String q2 =  "SELECT * from ans where qid = '"+qid+"' " ;
                ResultSet rs2 = stmt.executeQuery(q2);
                while(rs2.next())
                {
                    %><input type="radio" name= "q4" value="<%
                        out.println(rs2.getString("ansid"));
                        session.setAttribute("a4", rs2.getString("ansid"));
                        
                    %>"><%
                    out.println(rs2.getString("atext"));
                }
            }                

            %><br><br><%
            q = "SELECT * from question where type ='IQ' ORDER BY RAND() LIMIT 1";
            rs = stmt.executeQuery(q);
            if(rs.next())
            {
                String qtype = rs.getString("type");
                String qtext = rs.getString("qtext");
                String qid = rs.getString("qid");
                out.println(qid);
                out.println(" ) ");
                out.println(qtype);
                out.println(qtext);
                out.print("</br>");
                String q2 =  "SELECT * from ans where qid = '"+qid+"'" ;
                ResultSet rs2 = stmt.executeQuery(q2);
                while(rs2.next())
                {
                    %><input type="radio" name= "q5" value="<%
                        out.println(rs2.getString("ansid"));
                        session.setAttribute("a5", rs2.getString("ansid"));
                        
                    %>"><%
                    out.println(rs2.getString("atext"));
                }
            }                
            
        %>   
        <br><br>
        <button>Submit</button>
        </form>
        </div>
    </body>
</html>
