<%-- 
    Document   : lab9
    Created on : Feb 5, 2022, 4:40:57 PM
    Author     : yubaraj
--%>

<%@page import="java.util.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 9 Page</title>
    </head>
    <body>
        <h1>Declaration</h1>
        <%!         
        int n1, n2=10;
        
        int doSum(){
            n1 = 5;
            return n1+n2;
        }       


 Connection getConnection() {
        String url;
        String con;
        try {
            url = "jdbc:mysql://localhost:3306/bootcamp_2022";
            con = "com.mysql.jdbc.Driver";
            Class.forName(con);
            Connection cn = DriverManager.getConnection(url, "root", "");
            System.out.println("Connected !");
            return cn;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

        
        %>
        
        <h2>Output from Scriptlets tag</h2>
        
        <%
            
            out.println(doSum());
        %>
        
        <p>This is for Binod</p>
        
        <%
            String name = "Binod";
            out.println("Prining name "+name);
        %>
         <p>This is for Radha Krishnan</p>
        <%
            out.println("Prining name "+name);
        %>
        <p/>
        <%= doSum() %>
        
        <p/>
        <%--    <%= LocalDateTime.now() %>     --%>
        
        <!--    <%= new Date() %>     -->
        
        <h3>Database Connection below</h3>
        <%

        Connection cn = getConnection();
        if(cn != null)
        {
            %>
        Database Connected
        <%
            }
else{
            %>
        Database Connection Failed    
        <%
            }
            %>
    </body>
</html>
