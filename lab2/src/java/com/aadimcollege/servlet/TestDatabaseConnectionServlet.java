/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.aadimcollege.servlet;

import com.aadimcollege.db.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yubaraj
 */
public class TestDatabaseConnectionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter pwriter = response.getWriter();

        Connection cn = DatabaseConnection.getConnection();

        if (cn != null) {
            pwriter.print("<h1>");
            pwriter.print("Connected");
            pwriter.print("</h1>");
        } else {
            pwriter.print("<h1>");
            pwriter.print("Failed");
            pwriter.print("</h1>");
        }
    }
}
