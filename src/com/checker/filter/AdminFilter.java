package com.checker.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        //- 获取<filter-name>
        System.out.println("filter-name: " + filterConfig.getFilterName());

        //- 获取<filter>中配置的<init-param>
        System.out.println("init-param(key): " + filterConfig.getInitParameter("key"));

        //- 获取ServletContext对象
        System.out.println("ServletContex对象: " + filterConfig.getServletContext());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("===AdminFilter===");

        HttpServletRequest request = (HttpServletRequest) servletRequest;

        HttpSession session = request.getSession();

        Object user = session.getAttribute("user");

        if (user == null) {
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(servletRequest, servletResponse);
            return;
        } else {
            //放行
            filterChain.doFilter(servletRequest, servletResponse);
        }

        System.out.println("===End AdminFilter===");

    }

    @Override
    public void destroy() {

    }
}
