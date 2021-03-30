package com.checker.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServletResponse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===ServletResponse===");

        ///- 分别设置服务器和客户端

        ///  - setCharacterEncoding("UTF-8");
        ///    设置服务器响应的编码
//        resp.setCharacterEncoding("UTF-8");

        ///  - setHeader("Content-type","text/html;charset=utf-8");
        ///    设置客户端使用的编码
//        resp.setHeader("Content-type","text/html;charset=utf-8");

        /// ---

        ///- 同步设置
        ///  - setContentType("text/html;charset=utf-8");
        ///    同时设置服务器与客户端的编码
        resp.setContentType("text/html;charset=utf-8");

        String type = req.getParameter("type");
        if ("outputStream".equals(type)) {
            System.out.println("outputStream return");

            ServletOutputStream outputStream = resp.getOutputStream();
            outputStream.print(200);


        } else if ("writer".equals(type)) {
            System.out.println("writer return");

            PrintWriter writer = resp.getWriter();
            writer.write("writer return");
        }

        System.out.println("=========");

    }
}
