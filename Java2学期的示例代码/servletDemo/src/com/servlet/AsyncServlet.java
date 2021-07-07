/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "AsyncServlet", urlPatterns = {"/AsyncServlet"}, asyncSupported = true)
public class AsyncServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("进入Servlet的时间" + new Date() + ".");
        out.flush();
//        在子线程中执行业务调用，并由其负责输出响应，主线程退出
        AsyncContext ctx = request.startAsync();
        new Thread(new Executor(ctx)).start();
        out.println("<br>");
        out.println("结束Servlet的时间" + new Date() + ".");
        out.flush();
        }
    public class Executor implements Runnable {
        private AsyncContext ctx = null;
        public Executor(AsyncContext ctx) {
            this.ctx = ctx;
        }
        public void run() {
            try {
//            	等待30秒，以模拟业务方法的执行
                Thread.sleep(3000);
                PrintWriter out = ctx.getResponse().getWriter();
                out.println("<br>");
                out.println("业务处理完毕的时间" + new Date() + ".");
                out.flush();
                ctx.complete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}

