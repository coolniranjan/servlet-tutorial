package com.servlets;
//import javax.servlet.*;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
public class use_of_servlet implements Servlet {

    ServletConfig conf;

    @Override
    public void init(ServletConfig conf) {
        this.conf = conf;
        System.out.println("creating obj ..");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        System.out.println("sevicing...");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter(); 
        pw.println("<h2>Hello from first servlet</h2>");
        pw.println("<a href='/WebApplication1/index.html'>back</a>");
        System.out.println("in service");
    }

    @Override
    public void destroy() {
        System.out.println("in destroy");
    }

    @Override
    public String getServletInfo() {
        return "created by niranjan";
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.conf; // getServletConfig
    }
}
