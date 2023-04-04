<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Applicants about</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <style>
            .hh{
                margin-left: 28%; 
                text-align: center;
                width: 500px;
                height: 80px;
                border: 1px solid white;
                border-radius: 50px;
            }
            .hh h1{
                margin-left:-30px; 
            }
        </style>
    </head>
    <body>
        <%--HEADER--%>
        <div class="header">
            <div class="title">
                <img src="img/glogo.png" width="30px" height="20px" >
                <p> knowledge based </p>
            </div>

            <div class="header-body">
                <br><div class="hh" align="center"><h1>Welcome HR</h1></div><br>
                <a href="index.html"><button class="btn3">Log out</button></a>
                <br><br>
                <div class="search">
                    <form action="search.jsp" method="POST" >
                        <input type="text" name="search" placeholder=" search by email, name, exam type.."><br><br>
                        <button class="btn3" >search</button>                        
                    </form>
                </div>

            </div>
        </div>
        
        <%--CONTENT--%>
        <div class="content">
            <div class="content1">
                <div class="head1"><h3>Applicants Results</h3></div>
                <div class="opt1">
                <br>
                    <a href="list.jsp">1 - List all applicants</a>
                <br>
                <br>
                    <a href="sumarize.jsp">2 - show summarized report all Examed users</a>                    
                </div>
                    
            </div>

            <div class="content3">
                <div class="head3"><h3>Exam menu</h3></div>
                <div class="opt2">
                <br>
                    <a href="exam_cms.jsp">1 - Edit exam types</a>
                <br>
                </div>
                
            </div>            
        </div>
      
    </body>
</html>
