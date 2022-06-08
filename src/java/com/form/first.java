
package com.form;

import jakarta.servlet.ServletException;
import java.io.IOException;
import jakarta.servlet.http.*;
import java.io.PrintWriter;
public class first extends HttpServlet{
    public void doPost(HttpServletRequest Request,HttpServletResponse Response)throws ServletException,IOException{
        Response.setContentType("text/html");
        PrintWriter pw = Response.getWriter(); 
        pw.println("<h2>form data</h2>");
        pw.println("<a href='http://localhost:9494/WebApplication1/'>back</a>");   
        pw.println("<br>");
        
        String a=Request.getParameter("user-name");
        pw.println("name:"+a);
         pw.println("<br>");
        pw.println("email:");
        pw.println(Request.getParameter("user-email"));
         pw.println("<br>");
        pw.println("password:");
        pw.println(Request.getParameter("user-password"));
         pw.println("<br>");
        pw.println("phone no.:");
        pw.println(Request.getParameter("user-phone"));
    }
}
