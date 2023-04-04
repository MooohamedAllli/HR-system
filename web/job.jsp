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

        <%
            String id =request.getSession().getAttribute("cid").toString();
            try {
            DB conn2 = new DB();
            Connection conn = conn2.connector(); 
            Statement stmt = conn.createStatement();
                String q = "SELECT * FROM candidate where cid = '" + id + "' ";
                ResultSet rs = stmt.executeQuery(q);
                if(rs.next()){
                %><h4><%out.print("Welcome" + " " +rs.getString("fname"));%><h4><%
                }

            }catch(Exception e){
           }
        %>

        
        
        
        <h1>All jobs</h1>
        <%
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM job");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>job id</th>
                    <th>job title</th>
                    <th>job needs</th>
                    <th>Action</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("jid") %></td>
                    <td><%=rs.getString("title") %></td>
                    <td><%=rs.getString("desc") %></td>
                    <td>
                        <a href="ajob?id=<%=rs.getString("jid")%>"><button  class="app">Add job</button></a>
                        <a href="djob?id=<%=rs.getString("jid")%>"><button  class="app">Delete job</button></a>
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

    </body>
</html>
