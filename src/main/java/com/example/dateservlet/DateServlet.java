package com.example.dateservlet;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "dateServlet", value = "/time")
public class DateServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String currentTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Current time: " + currentTime + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}