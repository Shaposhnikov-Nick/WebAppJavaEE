<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<a href="hello-first-servlet">Hello from my first servlet</a>
<br/>
<a href="hello-second-servlet">Hello from my second servlet (redirect to Google, if get-parameter id = null)</a>
<br/>
<a href="hello-third-servlet">Hello from my third servlet (forward to MyJSP)</a>
<br/>
<a href="postindex.html">Hello from my fourth servlet (html with post)</a>
<br/>
<a href="session-servlet">Hello from session servlet</a>
<br/>
<a href="shop-servlet">Hello from shop servlet</a>
<br/>
<a href="hello-my-jsp">Hello from my MyJSP</a>
</body>
</html>