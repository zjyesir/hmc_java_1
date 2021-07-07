/*
 * LoginFail.java
 *
 * Created on 2007Âπ?10Êú?17Êó?, ‰∏ãÂçà8:47
 */

package com.servlet.collaboration;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name="LoginFail", urlPatterns={"/LoginFail"})
public class LoginFail extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
       
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("dl.html");
       dispatcher.include(request, response);
    
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
