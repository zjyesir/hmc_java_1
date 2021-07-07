/*
 * AdminTemperatureServlet.java
 *
 * Created on 2007骞�10鏈�16鏃�, 涓嬪崍9:01
 */

package servletContext;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author hyl
 * @version
 */
@WebServlet(name = "AdminTemperatureServlet", urlPatterns = {"/adminTemperature"},initParams ={
    @WebInitParam(name = "Temperature", value ="8")})
public class AdminTemperatureServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        String Temperature=(String)getServletContext().getAttribute("Temperature");
        if(Temperature==null){
       //获取初始化参数
            Temperature=(String)getInitParameter("Temperature");
        //放入应用上下文
            getServletContext().setAttribute("Temperature",Temperature);        }
        out.println("<HTML><HEAD><TITLE>气温更新"
                + "</TITLE></HEAD>");
        out.println("<BODY><TABLE border=\"0\" width=\"100%\"><tr>");
        out.println("<td align=\"left\" valign=\"bottom\">");
        out.println("<H1>当前气温</H1></td></tr></TABLE>");
        out.print("<FORM ACTION=\"");
        out.println(response.encodeURL("adminTemperature"));
        out.println("\" METHOD=\"POST\">");
        out.println("当前气温(摄氏度)");
        out.println("<INPUT TYPE=\"text\" NAME=\"temperature\" "
                + "VALUE="+Temperature+">");
        out.println("<INPUT TYPE=\"Submit\" NAME=\"btn_submit\" "
                + "VALUE=\"更新\">");
        out.println("</FORM></BODY></HTML>");
        
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        String Temperature=request.getParameter("temperature");
        //将更新后的气温信息放入上下文
        getServletContext().setAttribute("Temperature",Temperature);
        out.println("<HTML><HEAD><TITLE>气温更新"
                + "</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("当前气温"+Temperature+"摄氏度");
        out.println("</BODY></HTML>");
        
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
