<%@page import="common.DB"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Questions</title>
            <style>                    
                table ,td ,th{
                    width: 80%;
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
                    width: 80px;;
                    background: greenyellow;
                    border-radius: 5px;
                    border: none;
                    color: white;
                }
                .app:hover , .napp:hover , .back:hover{
                    color: #f44336;
                    transition: 0.4s;
                }
            </style>
    </head>
    <body>
        <%
            String type = request.getParameter("id");
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
 
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `question` where type ='"+type+"' ");
        %>     

        <br><br>    
        <div class="add-btn" align="center">
            <a href="addqstn.jsp"><button  class="app"  >Add qusetion</button></a>
            <a href="exam_cms.jsp"><button  class="app">Back to Exam</button></a>            
        </div>
        <br><br>    
        <div class="table-data">
            <table>
                <tr>
                    <th>question id</th>
                    <th>question type</th>
                    <th>question text</th>
                    <th>Action</th>
                </tr>
                <% while (rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("qid") %></td>
                    <td><%=rs.getString("type") %></td>
                    <td><%=rs.getString("qtext") %></td>
                    <td>
                        <a href="manageQus.jsp?id=<%=rs.getString("qid")%>"><button  class="app">Edit qusetion</button></a>
                        <a href="Deletequsn?id=<%=rs.getString("qid")%>"><button  class="app">Delete qusetion</button></a>
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
        
    </body>
</html>
