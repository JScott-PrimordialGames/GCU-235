<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Response</title>
</head>
<body>
<p>First Name: <%= request.getParameter("firstname") %></p>
<p>Last Name: <%= request.getParameter("lastname") %></p>
</body>
</html>