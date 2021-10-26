<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Employee Form</h1>
		<form action="saveEmployee">
			<table>
				<tr>
					<td>Employee ID:</td>
					<td><input type="text" path="id"></td>

				</tr>
				<tr>
					<td>Employee Name:</td>
					<td><input type="text" path="name"></td>
				</tr>
				<tr>
					<td>Employee Salary:</td>
					<td><input type="text" path="salary"></td>
				</tr>
				<tr>
					<td>Employee Location:</td>
					<td><input type="text" path="location"></td>
				</tr>
				<tr>
					<td><input type="submit"></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>