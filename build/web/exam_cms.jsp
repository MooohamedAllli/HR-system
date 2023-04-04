<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="common.DB"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam Edit</title>
        <style>
            body{
                text-align: center;
            }
            table ,td ,th{
                width: 70%;
                margin: auto;
                border: 1px solid #546e7a ;
                border-collapse: collapse;
                text-align: center;
                font-size: 15px;
                background-color: white;
                color: #546e7a;
                table-layout: fixed;
            }
            .app{
                background: #f44336;
                border-radius: 5px;
                border: none;
                color: white;
            }
            .napp{
                background: #fdd835;
                border-radius: 5px;
                border: none;
                color: white;
            }
            .back{
                width: 80px;
                height: 30px;
                color: white;
                background: #546e7a;
                border: none;
                border-radius: 5px;
            }
            .app:hover , .napp:hover , .back:hover{
                color: seagreen;
                transition: 0.4s;
            }
            .line{
                width: 0auto;
                border-bottom: 1px solid;
            }
        </style>
    </head>
    <body>
        <br><br>
        <div ><a href="hr.jsp"><button class="back">back</button></a></div><br>
        <div ><a href="exam_cms.jsp"><button class="back">Refresh</button></a></div>
        <br><br><br>
        <%
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `qtype`");
        %>     

        
        <div class="table-data">
            <table>
                <tr>
                    <th>Type ID</th>
                    <th>Question type</th>
                    <th>Question ref</th>
                    <th>Action</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("tid") %></td>
                    <td><%=rs.getString("type") %></td>
                    <td><%=rs.getString("ref") %></td>
                    <td>
                        <a href="manageQus.jsp?id=<%=rs.getString("ref")%>"><button  class="app">View qusetion</button></a>
                    </td>
                </tr>
                <%}%>
            </table>

        </div>
        <%
            }catch(Exception e){
                out.println(e);
            }
        %>
        <br><br><br>
        <form action="addType.jsp" method="post">
            <button  class="napp">Add Category</button>
        </form>
        <br>
        <form action="update_categ.jsp" method="post">
            <button  class="napp">update Category</button>
            <input type="text" name="ftid" placeholder="Enter Type ID">
        </form>
        <br>
        <form action="Deletetype" method="post">
            <button  class="napp">Delete Category</button>
            <input type="text" name="tid" placeholder="Enter Type ID">
        </form>
        <br>
        <div>
        </div>
    </body>
</html>
