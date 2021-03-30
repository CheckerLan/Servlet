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
    <title>JavaWeb Test</title>
</head>
<body>
<ul>
    <li>
        <a href="ServletTest.jsp">Servlet Test</a>
    </li>

    <li>
        <a href="cookie.jsp">Cookie Test</a>
    </li>


    <li>
        <a href="Session.jsp">Session Test</a>
    </li>

    <li>
        <a href="${pageContext.request.contextPath}/admin/adminTest.html">FilterTest</a>
    </li>

    <li>
        <a href="${pageContext.request.contextPath}/admin/filterChainServlet">FilterChainTest</a>
    </li>


    <li>
        <a href="${pageContext.request.contextPath}/login.jsp">login</a>
    </li>

</ul>



</body>
</html>
