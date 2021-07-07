/*
 * Main.java
 *
 * Created on 2007Âπ?10Êú?17Êó?, ‰∏ãÂçà7:56
 */

package com.servlet.collaboration;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
         System.out.println("I am at Servlet Main");
//         System.out.println("Œ“‘⁄Servlet Main÷–");
        try{
        Thread.sleep(2000);
        }catch (InterruptedException ie){
            System.out.println(ie.toString());
        }
        String userID=request.getParameter("userID");
        if(userID==null)userID="";        
        String password=request.getParameter("password");
        if(password==null)password="";
        if((userID.equals("guest")&&password.equals("guest"))){
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("LoginSuccess");
            dispatcher.forward(request, response);
        } else{
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("LoginFail");
            dispatcher.forward(request, response);
        }
        
    }
    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        processRequest(request, response);
    }
    
    public String getServletInfo() {
        return "Short description";
    }
    
   }
