<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>

<%! Integer num = 0; %>
<%  num = Integer.parseInt(request.getParameter("txtNumber")); %>
<h3>Multiplication Table of : <%=num %> </h3>

<table border="1">
<% 	
	for (int i = 1; i <= 10; i++) {	
%>

<tr>
	<td> <%=num%> </td>
	<td> <%=i%> </td>	
	<td>&nbsp; <%=i*num%> </td>
</tr>

<%} %>
</table>
</body>
</html>