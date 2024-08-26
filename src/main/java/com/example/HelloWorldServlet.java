package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HelloWorldServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><body><h1>Hello, World!</h1></body></html>");
    }

    @Override
    public void destroy () {
        super.destroy();
    }
}
