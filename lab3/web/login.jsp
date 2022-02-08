<%-- 
    Document   : login
    Created on : Feb 5, 2022, 4:35:46 PM
    Author     : yubaraj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="login" method="post">
            Username: <input type="text" name="username"/><br/><br/>
            Password: <input type="password" name="password"/><br/><br/>
            <input type ="submit" value="Login"/>
        </form>
    </body>
</html>
