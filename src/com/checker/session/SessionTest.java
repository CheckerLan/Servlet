package com.checker.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SessionTest extends HttpServlet {


    public void createAndGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        boolean isNew = session.isNew();

        String id = session.getId();

        resp.getWriter().write("id: " + id + ",\nisNew: " + isNew);
    }

    public void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String key = req.getParameter("key");
        String value = req.getParameter("value");

        session.setAttribute(key, value);

        resp.getWriter().write("setAttribute done;");
    }

    public void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String key = req.getParameter("key");

        Object attribute = session.getAttribute(key);

        resp.getWriter().write(key + ": " + attribute);
    }

    public void getSessionLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        int maxInactiveInterval = session.getMaxInactiveInterval();

        resp.getWriter().write("之前的超时时长（第一次为默认）：" + maxInactiveInterval + "\n");

    }

    public void setSessionLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        int time = Integer.parseInt(req.getParameter("time"));

        session.setMaxInactiveInterval(time);

        int maxInactiveInterval = session.getMaxInactiveInterval();

        resp.getWriter().write("单独设置后的超时时长：" + maxInactiveInterval);


    }

    public void deleteSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        session.invalidate();

        resp.getWriter().write("session被设置立马超时");
    }


    // 利用反射按方法名调用方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        String action = req.getParameter("action");
        try {
            Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, req, resp);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
