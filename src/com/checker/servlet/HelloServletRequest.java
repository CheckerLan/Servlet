package com.checker.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class HelloServletRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===ServletRequest===");

        //- setCharacterEncoding("UTF-8");
        //  设置编码，解决中文乱码问题，但需在获取前设置
        req.setCharacterEncoding("UTF-8");

        //---

        //- getParameter(String name)
        //  根据name获取请求参数
        System.out.println("通过key获取参数: " + req.getParameter("key"));

        //- getParameterValues(String name)
        //  根据name获取请求参数列表
        System.out.println("通过keys获取参数列表: " + Arrays.toString(req.getParameterValues("keys")));

        //---

        //- setAttribute(String name,Object o)
        //  将数据作为request对象的一个属性存放到request对象
        req.setAttribute("attrKey","attrValue");

        //- getAttribute(String name)
        //  获取request对象的name属性的属性值
        System.out.println("获取存储的Attribute的值: " + req.getAttribute("attrKey"));


        //---

        //- getHeader(String s)
        //  获取请求头的数据
        System.out.println("Head(User-Agent): " + req.getHeader("User-Agent"));

        //- getMethod()
        //  获取请求的方法
        System.out.println("Method: " + req.getMethod());

        //- getRequestURL()
        //  返回客户端发出请求时的完整URL。
        System.out.println("URL: " + req.getRequestURL());

        //- getRequestURI()
        //  返回请求行中的参数部分。
        System.out.println("URI: " + req.getRequestURI());

        //- getRemoteHost()
        //  返回发出请求的客户机的完整主机名。
        System.out.println("Host IP: " + req.getRemoteHost());

        System.out.println("=========");
    }
}
