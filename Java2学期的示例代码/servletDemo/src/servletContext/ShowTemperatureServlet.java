/*
 * ShowTemperatureServlet.java
 *
 * Created on 2007骞�10鏈�16鏃�, 涓嬪崍9:05
 */

package servletContext;

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
@WebServlet(name = "ShowTemperatureServlet", urlPatterns = {"/showTemperature"})
public class ShowTemperatureServlet extends HttpServlet {
    
    /** Processes requests for bot
     * 
     * h HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        String Temperature=(String)getServletContext().getAttribute("Temperature");
        if(Temperature==null){Temperature=new String("0");
        }
        String oldTemperature=(String)request.getSession().getAttribute("OldTemperature");
        out.println("<HTML><HEAD><TITLE>气温信息显示 "
                + "</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("当前最新气温"+Temperature+" 摄氏度");
        if(oldTemperature!=null){
            out.println("<BR>");
            out.println("更新当前气温"+oldTemperature+" 摄氏度");
        }
        out.println("</BODY></HTML>");
        //更新会话中的气温信息
        request.getSession().setAttribute("OldTemperature",Temperature);
        
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
