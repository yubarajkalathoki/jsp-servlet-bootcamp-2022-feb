
package com.aadimcollege.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author yubaraj
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter pwriter = response.getWriter();
        
        String un = request.getParameter("username");
        String pw = request.getParameter("password");
        
        System.out.println("UN: "+ un);
        System.out.println("PW: "+ pw);
        
        if(un.equals("admin") && pw.equals("admin")){
            // Send to loginSuccessServlet
//            response.sendRedirect("success");
            pwriter.print("Login Success!<br/>");

            RequestDispatcher rd = request.getRequestDispatcher("success");
//            rd.forward(request, response);
                rd.include(request, response);
            
            
            System.out.println("True");}
        else{
            // send to loginFailedServlet
            response.sendRedirect("failed");
            System.out.println("false");
        }
    }

}
