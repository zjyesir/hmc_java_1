/*
 * Counter.java
 *
 * Created on 2007骞?10鏈?19鏃?, 涓嬪崍5:05
 */

package listener;

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
@WebServlet(name = "Counter", urlPatterns = {"/counter"})
public class Counter extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String gg=(String)request.getSession().getAttribute("online");
        String history =(String)getServletContext().getAttribute("Counter");
        if( history==null) history="0";
       // int last=Integer.parseInt( history);
        String temp =(String)getServletContext().getAttribute("online");
        if(temp==null)temp="0";
        //int online=Integer.parseInt(temp);
      
        
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>计数器</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>当前访问人数 " + temp + "</h1>");
        out.println("<h1>历史访问人数 " + history + "</h1>");
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
