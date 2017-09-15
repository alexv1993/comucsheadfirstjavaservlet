package com.ucs.headfirstjava;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


/**
 * Created by vendin on 15.09.2017.
 */
public class MyServletA extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String message = "If you read this message, server is work!";

        out.println("<HTML><BODY>");
        out.println("<H1>" + message + "</H1>");
        out.println("</BODY></HTML>");
        out.close();
    }
}
