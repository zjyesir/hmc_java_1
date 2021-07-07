/*
 * URLRewrite2.java
 *
 * Created on 2007骞?10鏈?16鏃?, 涓嬪崍7:55
 */

package com.servlet.urlRedirect;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author hyl
 * @version
 */
@WebServlet(name = "URLRewrite2", urlPatterns = {"/url2"})
public class URLRewrite2 extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        //  PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
       // response.setContentType("text/html;charset=gb2312");
        java.io.PrintWriter out = response.getWriter( );
        String contextPath = request.getContextPath( );
        out.println("<html>");
        out.println("<head>");
        out.println("<title>URL Rewriter</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(
                "<h1>URL重写演示：接收参数</h2>");
        out.println("下面是接收的参数<br>");
        out.println("name="+request.getParameter("name"));
        out.println("age="+request.getParameter("age"));
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
