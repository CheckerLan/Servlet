package com.checker.servlet.helloRequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloRequestDispatcher2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===RequestDispatcher2===");

        System.out.println("...RequestDispatcher2相应事务");

        System.out.println("===End RequestDispatcher2===");
    }
}
