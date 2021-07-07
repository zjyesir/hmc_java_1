/*
 * CookieTrackServlet.java
 *
 * Created on 2007骞�10鏈�16鏃�, 涓婂崍11:12
 */

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="CookieTrackServlet", urlPatterns={"/cookietrack"})
public class CookieTrackServlet extends HttpServlet {
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie cookie=null;
        
        //鑾峰彇璇锋眰鐩稿叧鐨凜ookie
        Cookie[] cookies=request.getCookies();
        
        //鍒ゆ柇Cookie VisitTimes鏄惁瀛樺湪,濡傛灉瀛樺湪锛屽叾鍊煎姞1
        if(cookies!=null){
            boolean flag=false;
            for(int i=0; (i<cookies.length)&&(!flag); i++){
                if(cookies[i].getName().equals("VisitTimes")){
                    String v=cookies[i].getValue();
                    int value=Integer.parseInt(v)+1;
                    cookies[i].setValue(Integer.toString(value));
                    response.addCookie(cookies[i]);
                    flag=true;
                    cookie=cookies[i];
                }//end if
            }//end for
        }//end if
        
        //涓嶅瓨鍦紝鍒涘缓cookie
        if(cookie==null){
            int maxAge=-1;
            //create the cookie object
            cookie=new Cookie("VisitTimes","1");
            cookie.setPath(request.getContextPath());
            cookie.setMaxAge(maxAge);
            response.addCookie(cookie);
        }//end if
        
        //鏄剧ず淇℃伅
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out= response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cookie跟踪对话</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>您好</h2>");
        out.println("欢迎您第"+cookie.getValue()+"次访问本页面<br>");
        out.println("</body>");
        out.println("</html>");
        
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
