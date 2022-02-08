/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.aadimcollege.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yubaraj
 */
public class LoginSuccessServlet extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter pwriter = response.getWriter();


        String un = request.getParameter("username");
        
//        <h1>Login Success!</h1>
//        <h1>Welcome, admin</h1>

       pwriter.print("<h1>");
       pwriter.print("Welcome, "+un);
       pwriter.print("</h1>");
       
    }

}
