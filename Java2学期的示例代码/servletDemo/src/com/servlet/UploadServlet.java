/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author hyl
 */
@WebServlet(name = "UploadServlet", urlPatterns = {"/UpLoad"})
//@MultipartConfig(location = "c:\\td")
@MultipartConfig(location = "/Users/ianye/eclipse-workspace/testFordownload")
public class UploadServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            response.setContentType("text/html;charset=UTF-8");
            System.out.println("size = "+request.getParts().size());
            for (Part p : request.getParts()) {
                if (p!= null &&p.getContentType()!=null&& p.getContentType().contains("image")) {
              
                    String fname = getFileName(p);

                    p.write(fname);
                    
                    System.out.println(fname);
                    System.out.println(p.getContentType());
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("wrong 111");
        } finally {
            out.close();
        }
    }

    private String getFileName(Part part) {

        String header = part.getHeader("Content-Disposition");
//        xxxx filename=/pathLevel1/pathLevel2/hello.jpeg;$%^&&&^
        String fileName = header.substring(header.indexOf("filename=\"") + 10, header.lastIndexOf("\""));
        fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

        return fileName;
    }
    
//    private String getFileName(Part part) {
//
//        String header = part.getHeader("Content-Disposition");
//        String fileName = header.substring(header.indexOf("filename=\"") + 10, header.lastIndexOf("\""));
//        fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
//
//        return fileName;
//    }
//    
    

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
