<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/26
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie Test</title>
</head>
<body>
<ul>
    <li>
        createCookie
        <form action="cookieTest" method="get">
            <input type="hidden" name="action" value="createCookie">
            key: <input type="text" name="key" value="key">
            value: <input type="text" name="value" value="value">
            <input type="submit">
        </form>
    </li>

    <li><a href="cookieTest?action=getCookie">getCookie</a></li>

    <li>
        getCookieByKey
        <form action="cookieTest" method="get">
            <input type="hidden" name="action" value="getCookieByKey">
            key: <input type="text" name="key" value="key">
            <input type="submit">
        </form>
    </li>

    <li>
        updateCookie
        <form action="cookieTest" method="get">
            <input type="hidden" name="action" value="updateCookie">
            key: <input type="text" name="key" value="key">
            value: <input type="text" name="value" value="value">
            <input type="submit">
        </form>
    </li>

    <li>
        cookieLife
        <form action="cookieTest" method="get">
            <input type="hidden" name="action" value="cookieLife">
            key: <input type="text" name="key" value="key">
            age: <input type="number" name="age" value="-1">
            <input type="submit">
        </form>
    </li>

    <li>
        cookiePath
        <form action="cookieTest" method="get">
            <input type="hidden" name="action" value="cookiePath">
            key: <input type="text" name="key" value="key">
            path: <input type="text" name="path" value="/">
            <input type="submit">
        </form>
    </li>

</ul>

</body>
</html>
