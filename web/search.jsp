<%@page import="common.DB"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View list</title>
        
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
        <div class="line"></div>

        <h3>results for mail</h3>
        <%
            try{
                String mail = request.getParameter("search");
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM candidate where email='"+mail+"' ");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>Applicant name</th>
                    <th>status</th>
                    <th>CV</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("fname") +" "+ rs.getString("sname") %></td>
                    <td><%=rs.getString("status") %></td>
                    <td><a href=""><button  class="napp">Apply</button></a></td>
                </tr>
                <%}%>
            </table>
        </div>
        <%
            }catch(Exception e){
                out.println(e);
            }
        %>

        <br>
        <h3>Results for name</h3>
        <br>
        <%
            try{
                String mail = request.getParameter("search");
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM candidate where fname ='"+mail+"' ");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>Applicant name</th>
                    <th>status</th>
                    <th>CV</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("fname") +" "+ rs.getString("sname") %></td>
                    <td><%=rs.getString("status") %></td>
                    <td><a href=""><button  class="napp">Apply</button></a></td>
                </tr>
                <%}%>
            </table>
        </div>
        <%
            }catch(Exception e){
                out.println(e);
            }
        %>

        <h3>Question type</h3>
        <br>
        <%
            try{
                String mail = request.getParameter("search");
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM qtype where ref ='"+mail+"' ");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>qid</th>
                    <th>type</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("tid") %></td>
                    <td><%=rs.getString("type") %></td>
                </tr>
                <%}%>
            </table>
        </div>
        <%
            }catch(Exception e){
                out.println(e);
            }
        %>

    </body>
</html>
