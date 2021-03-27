package com.checker.cookie_session;

import com.checker.Utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CookieTest extends HttpServlet {

    public void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===createCookie===");

        String key = req.getParameter("key");
        String value = req.getParameter("value");
        Cookie cookie = new Cookie(key, value);
        resp.addCookie(cookie);

        System.out.println("=========");
    }

    public void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===getCookie===");

        Cookie[] cookies = req.getCookies();

        for (Cookie cookie : cookies) {
            resp.getWriter().write(cookie.getName() + ": " + cookie.getValue() + "\n");
        }

        System.out.println("=========");
    }

    public void getCookieByKey(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===getCookieByKey===");

        Cookie[] cookies = req.getCookies();
        String key = req.getParameter("key");

        // 用utils找到对应的cookie
        Cookie cookie = CookieUtils.findCookie(key, cookies);

        resp.getWriter().write(cookie.getName() + ": " + cookie.getValue());

        System.out.println(cookie.getName() + ": " + cookie.getValue());

        System.out.println("=========");
    }

    public void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===updateCookie===");

        String key = req.getParameter("key");
        String value = req.getParameter("value");

        ///- 直接重新设置Cookie，并发送给客户端

//        Cookie cookie = new Cookie(key, value);
//        resp.addCookie(cookie);


        ///- 找到Cookie对象并用setValue()改变值

        Cookie[] cookies = req.getCookies();
        Cookie cookie = CookieUtils.findCookie(key, cookies);
        if (cookie != null){
            cookie.setValue(value);
            //通知服务器
            resp.addCookie(cookie);
        }

        System.out.println("=========");
    }

    public void cookieLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===cookieLife===");

        String key = req.getParameter("key");
        int age = Integer.parseInt(req.getParameter("age"));

        Cookie[] cookies = req.getCookies();
        Cookie cookie = CookieUtils.findCookie(key, cookies);
        if (cookie != null){
            cookie.setMaxAge(age);
            //通知服务器
            resp.addCookie(cookie);
        }


        System.out.println("=========");
    }

    public void cookiePath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("===cookiePath===");

        String key = req.getParameter("key");
        String path = req.getParameter("path");

        Cookie[] cookies = req.getCookies();
        Cookie cookie = CookieUtils.findCookie(key, cookies);
        if (cookie != null){
            cookie.setPath(path);
            //通知服务器
            resp.addCookie(cookie);
        }


        System.out.println("=========");
    }

    //通过反射调用对应方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        Method method = null;
        try {
            method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, req, resp);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
