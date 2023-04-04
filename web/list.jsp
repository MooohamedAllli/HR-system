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

        <div ><a href="hr.jsp"><button class="back">back</button></a></div><br>
        <div ><a href="list.jsp"><button class="back">Refresh</button></a></div>

        <h1>All Applicants Waiting</h1>
        <%
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate`  where status='wait'");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>first name</th>
                    <th>second name</th>
                    <th>mail</th>
                    <th>CV</th>
                    <th>Action</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("fname") %></td>
                    <td><%=rs.getString("sname") %></td>
                    <td><%=rs.getString("email") %></td>
                    <td><a href="img/CV.pdf"><button  class="napp">View CV</button></a></td>
                    <td>
                        <a href="apr?id=<%=rs.getString("cid")%>"><button  class="napp">Aprove</button></a>
                        <a href="dis?id=<%=rs.getString("cid")%>"><button  class="app">disaprove</button></a>
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
        <br><br>
        <div class="line"></div>

        <h1>All Applicants Approved and examed</h1>
        <%
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate` where status='examed'");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>first name</th>
                    <th>second name</th>
                    <th>mail</th>
                    <th>View</th>
                    <th>CV</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <%String id = rs.getString("cid");%>
                    <td><%=rs.getString("fname") %></td>
                    <td><%=rs.getString("sname") %></td>
                    <td><%=rs.getString("email") %></td>
                    <td><a href="answers.jsp?id=<%=id%>"><button class="app">Answers</button></a></td>
                    <td><a href="img/CV.pdf"><button  class="napp">View CV</button></a></td>
                </tr>
                <%}%>
            </table>
        </div>
        <%
            }catch(Exception e){
                out.println(e);
            }
        %>

        <br><br>
        <div class="line"></div>

        <h1>All Applicants non Approved</h1>
        <%
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate` where status='not'");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>first name</th>
                    <th>second name</th>
                    <th>mail</th>
                </tr>
                <% while (rs.next()){
                    String id = rs.getString("cid") ;
                %>
                <tr>
                    <td><%=rs.getString("fname") %></td>
                    <td><%=rs.getString("sname") %></td>
                    <td><%=rs.getString("email") %></td>
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
