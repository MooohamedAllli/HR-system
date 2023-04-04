<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="common.DB"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add question</title>
        <style>
                .napp{
                background: #fdd835;
                border-radius: 5px;
                border: none;
                color: white;
            }
            .napp:hover {
                color: seagreen;
                transition: 0.4s;
            }

        </style>
    </head>
    <body>
        
        <br><br>
        <form action="addqstn.jsp" method="post" align="center">
            <input type="text" name="qid" placeholder="Enter Question ID...">
        <br><br>
            <input type="text" name="type" placeholder="Enter Type...">
        <br><br>
            <input type="text" name="text" placeholder="Enter Type Text..">
        <br><br>
            <button  class="napp">Add question</button>
        </form>
        <br><br>

        <a href="exam_cms.jsp"><button  class="napp">Back</button></a>            

        <%
            String n = request.getParameter("qid");
            String n1 = request.getParameter("type");
            String n2 = request.getParameter("text");
            
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
                
                stmt.executeUpdate("INSERT INTO `question`(`qid`, `type`, `qtext`) VALUES ( '"+n+"' , '"+n1+"' , '"+n2+"' )");
                response.sendRedirect("exam_cms.jsp");
            }catch(Exception e){}
        %>     
    </body>
</html>
