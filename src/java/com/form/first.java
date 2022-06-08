package com.form;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.io.IOException;
import jakarta.servlet.http.*;
import java.io.PrintWriter;

public class first extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String con = request.getParameter("condition");
        String a = request.getParameter("user-name");
        String email = request.getParameter("user-email");
        String pass = request.getParameter("user-password");
        String phone = request.getParameter("user-phone");
        pw.println("<a href='http://localhost:9494/WebApplication1/'>back</a>");
        if (con != null) {
            if (con.equals("check")) {
                pw.println("<h2>form data</h2>");

                pw.println("<br>");
                pw.println("name:" + a);
                pw.println("<br>");
                pw.println("email:" + email);
                pw.println("<br>");
                pw.println("password:" + pass);
                pw.println("<br>");
                pw.println("phone no.:" + phone);
                RequestDispatcher rd = request.getRequestDispatcher("success");
                rd.forward(request, response);
            }
        } else {
            pw.println("<h3>term and condition not accepted</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);

        }
    }
}
