<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Дарья
  Date: 14.06.2021
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP</title>
</head>
<body>
<t1>Testing JSP</t1>
<p>
    <%@ page import="java.util.Date, logic.TestClass" %>

    <%
        String name = request.getParameter("name");
    %>
    <%=
        "<p>" + "Hello " + name + "</p>"
    %>

    <%
        TestClass testClass = new TestClass();
    %>
    <%=
    "<p>" + testClass.getInfo() + "</p>"
    %>

    <%
        Date now = new Date();
        String str = "Текущая дата " + now;
    %>
    <%=
        str
    %>

    <%
        for (int i = 0; i < 10; i++) {
            out.println("<p>" + "Hello " + i + "</p>");
        }
    %>


</p>
</body>
</html>
