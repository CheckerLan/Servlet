<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/27
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session Test</title>
</head>
<body>

<iframe name="target"></iframe>

<ul>
    <li>
        <a href="sessionTest?action=createAndGetSession" target="target">createAndGetSession</a>
    </li>

    <li>
        setAttribute
        <form action="sessionTest" method="get" target="target">
            <input type="hidden" name="action" value="setAttribute">
            key: <input type="text" name="key" value="key">
            value: <input type="text" name="value" value="value">
            <input type="submit">
        </form>
    </li>

    <li>
        getAttribute
        <form action="sessionTest" method="get" target="target">
            <input type="hidden" name="action" value="getAttribute">
            key: <input type="text" name="key" value="key">
            <input type="submit">
        </form>
    </li>


    <li>
        sessionLife
        <ul>
            <li>
                <a href="sessionTest?action=getSessionLife" target="target">getSessionLife</a>
            </li>

            <li>
                <form action="sessionTest" method="get" target="target">
                    <input type="hidden" name="action" value="setSessionLife">
                    time: <input type="number" name="time" value="1800">
                    <input type="submit">
                </form>
            </li>

            <li>
                <a href="sessionTest?action=deleteSession" target="target">deleteSession</a>
            </li>
        </ul>
    </li>



</ul>

</body>
</html>
