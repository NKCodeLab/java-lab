<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
	<%!String message = "Java is best programming language";%>
	<%!Date today = new Date(); %>
	<%
	for (int i = 0; i < 10; i++) {
	%>
	<h3>JSP is simple</h3>
	<br>
	<%=message%>
	<br>
	<%
	out.println(message);
	out.println(today);
	%>
	<%
	}
	%>
</body>
</html>