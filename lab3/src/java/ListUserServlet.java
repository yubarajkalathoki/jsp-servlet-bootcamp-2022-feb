/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yubaraj
 */
public class ListUserServlet extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();      

       List<UserBean> userList = Arrays.asList(
               new UserBean("Sajan KC", "Kathmandu"),
               new UserBean("Binod", "KKDBTTA"),
               new UserBean("Milan", "JHAPA"),
               new UserBean("Deepak KC", "POK")
               
       );
       
       request.setAttribute("users", userList);
       RequestDispatcher rd = request.getRequestDispatcher("userView.jsp");
        rd.forward(request, response);
    }
   
}
