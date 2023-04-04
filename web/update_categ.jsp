<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="common.DB"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Category Page</title>
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
        <form action="UpdateCateg" method="post" align="center">
            <input type="text" name="tid" placeholder="Enter New Type ID...">
        <br><br>
            <input type="text" name="type" placeholder="Enter New Type Name...">
        <br><br>
            <input type="text" name="ref" placeholder="Enter Type Nem ref..">
        <br><br>
            <button  class="napp">Update Category</button>

        </form>

        <%
            String fixed_n = (request.getParameter("ftid"));

            HttpSession scn = request.getSession();
            scn.setAttribute("old_id", fixed_n);
            
            String n =  request.getParameter("tid");
            String n1 = request.getParameter("type");
            String n2 = request.getParameter("ref");

            scn.setAttribute("old_id1", n);
            scn.setAttribute("new1", n1);
            scn.setAttribute("new2", n2);


            /*
            try{
                DB conn2 = new DB();
                Connection conn = conn2.connector(); 
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("UPDATE `qtype` SET `tid`= "+n+" , `ref`='"+n1+"' ,`type`= '"+n2+"' WHERE `tid`= "+fixed_n+" ");
                response.sendRedirect("exam_cms.jsp");
            }catch(Exception e){}
            */
        %>     
    </body>
</html>
