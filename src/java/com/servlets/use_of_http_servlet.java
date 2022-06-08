
package com.servlets;
//import jakarta.servlet.*;
import jakarta.servlet.ServletException;
import java.io.IOException;
import jakarta.servlet.http.*;
import java.io.PrintWriter;
public class use_of_http_servlet extends HttpServlet{
    public void doGet(HttpServletRequest Request,HttpServletResponse Response)throws ServletException,IOException{
        System.out.println("htpp servlet");
        Response.setContentType("text/html");
        PrintWriter pw = Response.getWriter(); 
        pw.println("<h2>Hello from life cycle by Http servlet</h2>");
         pw.println("<a href='/WebApplication1/index.html'>back</a>");
            
    }
}
