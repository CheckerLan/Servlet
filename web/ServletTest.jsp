<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/27
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet Test</title>
</head>
<body>

<b>Servlet</b>
<form action="helloServlet" method="get">
    <input type="submit" value="servlet get">
</form>
<form action="helloServlet" method="post">
    <input type="submit" value="servlet post">
</form>

<hr>
<b>HttpServlet</b>
<form action="helloHttpServlet" method="get">
    <input type="submit" value="httpServlet get">
</form>
<br>
<form action="helloHttpServlet" method="post">
    <input type="submit" value="httpServlet post">
</form>

<hr>
<b>ServletConfig</b>
<form action="helloServletConfig" method="get">
    <input type="submit" value="ServletConfig test">
</form>

<hr>
<b>ServletContext</b>
<form action="helloServletContext" method="get">
    <input type="submit" value="ServletContext test">
</form>

<hr>
<b>HTTP</b>
<form action="httpTest" method="post">
    <input type="text" name="key" value="value">
    <input type="submit">
</form>

<hr>
<b>ServletRequest</b>
<form action="helloServletRequest" method="post">
    <input type="text" name="key" value="value">
    <br>
    多选：
    <input type="checkbox" name="keys" value="value1">value1
    <input type="checkbox" name="keys" value="value2">value2
    <input type="checkbox" name="keys" value="value3">value3
    <br>
    <input type="submit">
</form>

<hr>
<b>Forward(转发)</b>
<form action="helloRequestDispatcher1" method="get">
    <input type="submit">
</form>

<hr>
<b>ServletRequest</b>
<form action="helloServletResponse" method="get">
    <input type="radio" name="type" value="outputStream">字节流 outputStream
    <input type="radio" name="type" value="writer" checked="checked">字符流 writer
    <br>
    <input type="submit">
</form>

<hr>
<b>Redirect(重定向)</b>
<form action="helloRedirect1" method="get">
    <input type="submit">
</form>
</body>
</html>
