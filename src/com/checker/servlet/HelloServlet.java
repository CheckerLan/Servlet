package com.checker.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 进入Service
        System.out.println("===Hello Servlet!===");

        // 通过将servletRequest转为HttpServletRequest得到方法类型
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();

        System.out.println("method:" + httpServletRequest.getMethod());

        // 防止Service方法太臃肿使用doGet和doPost方法分别处理
        if ("GET".equals(method)){
            doGet();
        }else if ("POST".equals(method)){
            doPost();
        }

        System.out.println("=========");
    }

    public void doGet(){
        System.out.println("Method: doGet");
    }

    public void doPost(){
        System.out.println("Method: doPost");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
