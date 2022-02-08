<%-- 
    Document   : includeDemo
    Created on : Feb 5, 2022, 5:11:47 PM
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
        <h1>Include Demo</h1>
        <table border="1">
            <tr>
                <td><jsp:include page="index.jsp"/></td>
                <td><jsp:include page="lab9.jsp"/></td>
                <td><jsp:include page="login.jsp"/></td>
            </tr>
            
        </table>
    </body>
</html>
