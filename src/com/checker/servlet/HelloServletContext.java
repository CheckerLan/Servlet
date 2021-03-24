package com.checker.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===HelloServletContext===");

        ServletContext context = getServletConfig().getServletContext();

        //-  获取web.xml中配置的上下文参数context-param
        String contextParam = context.getInitParameter("contextParam");
        System.out.println("获取context-param：" + contextParam);

        //- 获取工程路径：/工程路径
        System.out.println("获取当前工程路径：" + context.getContextPath());

        //- 获取部署的绝对路径
        System.out.println("获取部署的路径：" + context.getRealPath("/"));

        //- 存取数据
        context.setAttribute("key","value");
        System.out.println("存取的数据为：" + context.getAttribute("key"));


        System.out.println("=========");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
