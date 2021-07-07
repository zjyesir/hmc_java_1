/*
 * LoginSuccess.java
 *
 * Created on 2007骞?10鏈?17鏃?, 涓嬪崍7:57
 */

package com.servlet.collaboration;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name="LoginSuccess", urlPatterns={"/LoginSuccess"})
public class LoginSuccess extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name=request.getParameter("userID");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>登陆成功</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>欢迎！"+name+"您已成功登陆系统......</h1>");
        out.println("</body>");
        out.println("</html>");
       
        out.close();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
