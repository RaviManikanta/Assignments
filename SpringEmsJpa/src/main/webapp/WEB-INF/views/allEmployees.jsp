<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Users</title>
</head>
<body>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/addEmployee">Add Employee</a>
	<br>
	<h3>List of all Employee</h3>
	${message}
	<br>
	<br>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
			     <th>ID</th>
				<th>Name</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Address</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="employee" items="${empList}">
				<tr>
					<td>${employee.id}</td>
					<td>${employee.name}</td>
					<td>${employee.salary}</td>
					<td>${employee.designation}</td>
					<td>${employee.address}</td>
					<td><a
						href="${pageContext.request.contextPath}/editEmployee/${employee.id}">Edit</a></td>
					<td><a
						href="${pageContext.request.contextPath}/deleteEmployee/${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>


	</table>
</body>
</html>