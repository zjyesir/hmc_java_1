/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;

/**
 *
 * @author hyl
 */
public class ReadListenerImpl implements ReadListener {

    private ServletInputStream input;
    private ServletOutputStream output;
    private AsyncContext context;
    private StringBuilder sb = new StringBuilder();

    ReadListenerImpl(ServletInputStream input, ServletOutputStream output, AsyncContext context) {
        this.input = input;
        this.output = output;
        this.context = context;
    }
  

    /*
     * This method illustrates what ReadListener will do when data 
     * is available to be read.
     */
    @Override
    public void onDataAvailable() throws IOException {
        System.out.println("Data is available");
        while (input.isReady() && !input.isFinished()) {
            sb.append((char) input.read());
        }
        sb.append(" ");
       
    }

    /*
     * This method illustrates what ReadListender will do 
     * when all the data has been read. 
     */
    @Override
    public void onAllDataRead() throws IOException {
    System.out.println("Data is all read");
        try {
           output.print("Total Received Bytes: " + sb.length() + "</br>");
            output.print("Received Contents: " + sb.toString() + "</br>");
           output.flush();
       
        }  finally {
         
            context.complete();
        }
        
    }

    /*
     * This method illustrates what ReadListender will do 
     * when error occurs. 
     */
    @Override
    public void onError(Throwable t) {
        context.complete();
        System.out.println("--> onError");
    }
}