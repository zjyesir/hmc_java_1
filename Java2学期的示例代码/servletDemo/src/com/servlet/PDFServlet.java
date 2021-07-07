/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hyl
 */
@WebServlet(name = "PDFServlet", urlPatterns = {"/pdfshow"})
public class PDFServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        ServletOutputStream out = response.getOutputStream();
//        pdf不会被浏览器直接打开，而是被单独保存，给用户提供保存下载的选项
        response.setHeader("Content-disposition","attachment;filename=Example.pdf");
        File pdf = null;
        // BufferedInputStream buf = null;
        byte[] buffer = new byte[1024 * 1024];
        FileInputStream input = null;
        try {
            pdf = new File("/Users/ianye/eclipse-workspace/testFordownload/pdfTest.pdf");//为演示文件发送而保存的一个文件
//            pdf = new File("c:\\sample.pdf");//为演示文件发送而保存的一个文件
            response.setContentLength((int) pdf.length());
            input = new FileInputStream(pdf);
            int readBytes = -1;
            while ((readBytes = input.read(buffer, 0, 1024 * 1024)) != -1) {
                out.write(buffer, 0, 1024 * 1024);
            }
        } catch (IOException e) {
            System.out.println("file not found!");
        } finally {
            if (out != null) {
                out.close();
            }
            if (input != null) {
                input.close();
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
//        重定向，转向First 这个serlet处理
//        response.sendRedirect("First");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
