<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Employee</title>
</head>
<body>
	<h2>Add New Employee</h2>
	<hr>
	<form action="AddNewEmployeeServlet" method="post">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="txtEmployeeId"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="txtName"></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text" name="txtSalary"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Employee"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>