
package com.servlets;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class useof_genric extends GenericServlet{
     @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        System.out.println("sevicing by generic servlet...");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter(); 
        pw.println("<h2>Hello from life cycle by generic servlet</h2>");
          pw.println("<a href='/WebApplication1/index.html'>back</a>");
    
    }
}
