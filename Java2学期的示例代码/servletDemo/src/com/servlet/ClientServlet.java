/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hyl
 */
@WebServlet(name = "ClientServlet", urlPatterns = {"/ClientServlet"})
public class ClientServlet extends HttpServlet {

    OutputStream output = null;
    InputStream input = null;

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
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>非阻塞IO演示</title>");
        out.println("</head>");
        out.println("<body>");

        String urlPath = "http://"
                + request.getServerName()
                + ":" + request.getLocalPort() //default http port is 8080
                + request.getContextPath()
                + "/ServiceServlet";

        URL url = new URL(urlPath);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setChunkedStreamingMode(2);
        conn.setRequestProperty("Content-Type", "text/plain");
        conn.connect();

        try {
            output = conn.getOutputStream();
            // 发送第一部分信息
            String firstPart = "hello.....";
            out.println("Sending to server: " + firstPart + "</br>");
           // out.flush();
            writeData(output, firstPart);

            Thread.sleep(2000);

            // 发送第二部分信息
            String secondPart = "World......";
            out.println("Sending to server: " + secondPart + "</br></br>");
            //out.flush();
            writeData(output, secondPart);
             Thread.sleep(2000);
           // 发送第三部分信息
            String thirdPart = "The End......";
            out.println("Sending to server: " + thirdPart + "</br></br>");
           // out.flush();
            writeData(output, thirdPart);
            // 从服务器返回信息
         input = conn.getInputStream();
        printEchoData(out, input);

           out.println("Please check server log for detail");
           out.flush();
        } catch (IOException ioException) {
            Logger.getLogger(ReadListenerImpl.class.getName()).log(Level.SEVERE,
                    "Please check the connection or url path", ioException);
        } catch (InterruptedException interruptedException) {
            Logger.getLogger(ReadListenerImpl.class.getName()).log(Level.SEVERE,
                    "Thread sleeping error", interruptedException);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (Exception ex) {
                }
            }
            if (output != null) {
                try {
                    output.close();
                } catch (Exception ex) {
                }
            }
        }

        out.println("</body>");
        out.println("</html>");
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

    protected void writeData(OutputStream output, String data) throws IOException {
        if (data != null && !data.equals("") && output != null) {
            output.write(data.getBytes());
            output.flush();
        }
    }

    protected void printEchoData(PrintWriter out, InputStream input) throws IOException {
        while (input.available() > 0 && input != null && out != null) {
            out.print((char) input.read());
        }
        out.println("</br>");
    }
}
