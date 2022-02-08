<%-- 
    Document   : userView
    Created on : Feb 5, 2022, 5:18:55 PM
    Author     : yubaraj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="aadim" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View User!</h1>

        <table border="1">
            <tr>
                <th>Name</th>
                <th>Address</th>
                <th>Action</th>
            </tr>
            <aadim:forEach items="${users}" var="user">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.address}</td>
                    <td>
                        <a href="/editUser">Edit</a>
                        <a href="/deleteUser">Delete</a>
                    </td>
                </tr>
            </aadim:forEach>
        </table>



    </body>
</html>
