package com.checker.servlet;

import javax.servlet.*;
import java.io.IOException;

public class HelloServletConfig implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("===HelloServletConfig===");

        //- 获取初始化参数 init-param
        System.out.println("初始化参数：" + servletConfig.getInitParameter("initValue"));

        //- 获取ServletContext对象
        System.out.println("context对象：" + servletConfig.getServletContext());

        //- 获取Servlet别名servlet-name
        System.out.println("Servlet别名：" + servletConfig.getServletName());

        System.out.println("=========");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
