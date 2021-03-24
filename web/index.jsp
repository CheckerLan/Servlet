<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/23
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Servlet Test</title>
  </head>
  <body>

    <form action="helloServlet" method="get">
      <input type="submit" value="servlet get">
    </form>
    <form action="helloServlet" method="post">
      <input type="submit" value="servlet post">
    </form>

    <hr>
    <form action="helloHttpServlet" method="get">
      <input type="submit" value="httpServlet get">
    </form>
    <br>
    <form action="helloHttpServlet" method="post">
      <input type="submit" value="httpServlet post">
    </form>

    <hr>
    <form action="helloServletConfig" method="get">
      <input type="submit" value="ServletConfig test">
    </form>

    <hr>
    <form action="helloServletContext" method="get">
      <input type="submit" value="ServletContext test">
    </form>

    <hr>
    <form action="httpTest" method="post">
      <input type="text" name="key" value="value">
      <input type="submit">
    </form>

  </body>
</html>
