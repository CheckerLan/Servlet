package com.checker.servlet.helloRedirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloRedirect1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===Redirect1===");

        System.out.println("...HelloRedirect1事务");

        ///- 设置相应码与相应头Location字段

        ///  - setStatus(302)
        ///    设置响应码，302代表重定向
//        resp.setStatus(302);


        ///  - setHeader("Location","http://localhost:8080/JavaWeb/helloRedirect2")
        ///    设置Location字段，告知浏览器下一跳地址
//        resp.setHeader("Location","http://localhost:8080/JavaWeb/helloRedirect2");

        ///  ---

        ///- 直接通过setRedirect重定向
        ///  - resp.sendRedirect("http://localhost:8080/JavaWeb/helloRedirect2")
        ///    封装到一步完成
        resp.sendRedirect("http://localhost:8080/JavaWeb/helloRedirect2");

        System.out.println("===End Redirect1===");

    }
}
