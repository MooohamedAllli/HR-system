<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="common.DB"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <form action="addType.jsp" method="post" align="center">
            <input type="text" name="tid" placeholder="Enter Type ID...">
        <br><br>
            <input type="text" name="type" placeholder="Enter Type...">
        <br><br>
            <input type="text" name="ref" placeholder="Enter Type ref..">
        <br><br>
            <button  class="napp">Add Category</button>

        </form>

        <%
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
        %>     
    </body>
</html>
