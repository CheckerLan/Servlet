<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/28
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    This page is for Login;
    <form action="${pageContext.request.contextPath}/loginServlet" method="get">
        <label>username:
            <input type="text" name="username">
        </label><br>
        password: <input type="password" name="password"><br>
        <input type="submit">
    </form>
</body>
</html>
