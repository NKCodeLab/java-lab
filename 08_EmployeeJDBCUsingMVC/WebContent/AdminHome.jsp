<%@page import="com.citibank.dao.EmployeeDAO"%>
<%@page import="com.citibank.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
	<h2>List of employees</h2>
	<hr>
	<%
	EmployeeDAO employeeDAO = new EmployeeDAO();
	List<Employee> employees = employeeDAO.getAllEmployees();
	%>
	<form action="NavigationServlet" method="post">
		<table border="1">
			<tr>
				<td>Employee Id</td>
				<td>Name</td>
				<td>Salary</td>
				<td>Select</td>
			</tr>
			<%
			for (Employee employee : employees) {
			%>
			<tr>
				<% int employeeId = employee.getEmployeeId(); %>
				<td><%=employeeId%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getSalary()%></td>
				<td> <input type="radio" name="rdoEmployee" value="<%=employeeId%>"></td>
			</tr>
			<%
			}
			%>
		</table>
		<br>
		<input type="submit" value="Add New Employee" name="action"> &nbsp; &nbsp; &nbsp;
		<input type="submit" value="Update" name="action"> &nbsp; &nbsp; &nbsp; 
		<input type="submit" value="Delete" name="action"> 
	</form>
</body>
</html>