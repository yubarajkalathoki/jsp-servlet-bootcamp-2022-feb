
package com.aadimcollege.servlet;

import com.aadimcollege.db.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yubaraj
 */
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();      

        String firstName = request.getParameter("fn");
        String lastName = request.getParameter("last_name");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String mobileNumber = request.getParameter("mobile_number");
        
        String insertQuery = "insert into user (first_name, last_name, gender, address, mobile_number) values ('"+firstName+"','"+lastName+"','"+gender+"','"+address+"','"+mobileNumber+"' )";
        System.out.println("QUERY: "+ insertQuery);
        
        try {
            Connection cn = DatabaseConnection.getConnection();
            Statement stat = cn.createStatement();
            stat.executeUpdate(insertQuery);
            out.print("User Created Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            out.print("User Creation Failed!");
        }
        
    }
}
