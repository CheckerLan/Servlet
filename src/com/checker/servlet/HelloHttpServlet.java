package com.checker.servlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloHttpServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===HelloHttpServlet===");

        System.out.println("Method:doGet");

        ServletConfig servletConfig = getServletConfig();

        System.out.println("初始化参数：" + servletConfig.getInitParameter("initValue"));

        System.out.println("context对象：" + servletConfig.getServletContext());

        System.out.println("Servlet别名：" + servletConfig.getServletName());

        System.out.println("=========");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===HelloHttpServlet===");

        System.out.println("Method:doPost");

        System.out.println("=========");
    }
}
