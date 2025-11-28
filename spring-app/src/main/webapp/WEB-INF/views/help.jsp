<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
    <h2>Hello World from JSP!</h2>
    <%
        String name = (String) request.getAttribute("name");
    %>
    <p><%= name %></p>
</body>
</html>
