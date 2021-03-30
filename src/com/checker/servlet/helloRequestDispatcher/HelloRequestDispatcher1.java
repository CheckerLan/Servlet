package com.checker.servlet.helloRequestDispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloRequestDispatcher1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===RequestDispatcher1===");

        System.out.println("...RequestDispatcher1相应事务");

        //转发
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/helloRequestDispatcher2");
        requestDispatcher.forward(req, resp);

        System.out.println("===End RequestDispatcher1===");
    }
}
