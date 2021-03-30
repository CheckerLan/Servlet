package com.checker.Utils;

import javax.servlet.http.Cookie;

public class CookieUtils {
    public static Cookie findCookie(String name,Cookie[] cookies){
        // 数据不合法，返回空
        if (name == null || cookies == null || cookies.length== 0 ){
            return null;
        }

        // 遍历循环找
        for (Cookie cookie : cookies) {
            if (name.equals(cookie.getName())){
                return cookie;
            }
        }

        // 没有找到
        return null;
    }
}
