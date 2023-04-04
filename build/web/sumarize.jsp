
<%@page import="common.DB"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sumarize</title>
    </head>
            <style>                    
                body{
                    background-color: lightgray ; 
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
                    width: 100px;
                    transition: 0.4s;
                }
            </style>
    <body>
        <div ><a href="hr.jsp"><button class="back">back</button></a></div><br>

            <h1>All Applicants Apprved and examed</h1>
        <%
            
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate` where status='examed' ");
        %>     

        <div class="table-data">
            <table>
                <tr>
                    <th>first name</th>
                    <th>second name</th>
                    <th>mail</th>
                    <th>score 1</th>
                    <th>score 2</th>
                    <th>Total score</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <%String id = rs.getString("cid");%>
                    <td><%=rs.getString("fname") %></td>
                    <td><%=rs.getString("sname") %></td>
                    <td><%=rs.getString("email") %></td>
                    <td><%=rs.getString("score") %></td>
                    <td><%=rs.getString("score2")%></td>
                    <%
                    
                        int s1 = Integer.parseInt(rs.getString("score"));
                        int s2 = Integer.parseInt(rs.getString("score2"));
                     
                    %>
                    <td><% out.print(s1 + s2); %></td>
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
