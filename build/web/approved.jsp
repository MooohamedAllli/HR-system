<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="common.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <style>
            h4{
                margin-left: 42%;
            }
            table , th , td{
                width: 30%;
                border: 1px solid;
                cell-padding: 0;
                height: auto;
            }
            button{
                width: 60px;
                background-color: yellowgreen;
                border-radius:10px;
                border: none;
            }
            button:hover{
                width: 70px;
                background-color: red;
                transition: 0.7s;
            }
        </style>
    </head>
    <body>
        <%
            String ccid =request.getSession().getAttribute("cid").toString();
            try {
            DB conn2 = new DB();
            Connection conn = conn2.connector(); 
            Statement stmt = conn.createStatement();
                String q = "SELECT * FROM candidate where cid = '" + ccid + "' ";
                ResultSet rs = stmt.executeQuery(q);
                if(rs.next()){
                    %>
        
        <div class="header">
            <div class="header-body">
                <br><br>                
                <a href="start.html"><button class="btn3">Log out</button></a>
                
            </div>
            <h4><%out.print("Welcome" + " " +rs.getString("fname"));%><h4><%
                }

            }catch(Exception e){
           }
        %>
        <br><br>
        <br><br>
        </div>
        <table align="center">
            <tr>
                <td>Type</td>
                <td>deadline</td>
                <td>Action</td>
            </tr>
            <tr>
                <td>Programming</td>
                <td>29/12/2019</td>
                <td><a href="exampro.jsp?id=<%=ccid%>"><button>start</button></a></td>
            </tr>
            <tr>
                <td>IQ test</td>
                <td>30/12/2019</td>
                <td><a href="examiq.jsp?id=<%=ccid%>"><button>start</button></a></td>
            </tr>
        </table>
    </body>
</html>
