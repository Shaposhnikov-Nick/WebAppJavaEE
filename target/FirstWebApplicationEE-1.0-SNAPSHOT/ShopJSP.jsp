<%@ page import="logic.Shop" %><%--
  Created by IntelliJ IDEA.
  User: Дарья
  Date: 19.06.2021
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show shop</title>
</head>
<body>
<% Shop shop = (Shop) session.getAttribute("shop"); %>
<p> Name: <%= shop.getName()%> </p>
<p> Quantity: <%= shop.getQuantity()%> </p>
</body>
</html>
