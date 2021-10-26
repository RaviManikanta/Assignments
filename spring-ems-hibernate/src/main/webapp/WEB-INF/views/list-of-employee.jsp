<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of employee</title>
</head>
<body>

<p>list of employee</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">id</th>
<th width="15%">name</th>
<th width="15%">department</th>
<th width="15%">designation</th>
<th width="15%">address</th>
<th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="employee" items="${employee}">
<tr>
	<td>${employee.id}</td>
	<td>${employee.name}</td>
	<td>${employee.department}</td>
	<td>${employee.designation}</td>
	<td>${employee.address}</td>
	<td>
	<a href="${pageContext.request.contextPath}/team/edit/${employee.id}.html">Edit</a><br/>
	<a href="${pageContext.request.contextPath}/team/delete/${employee.id}.html">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/home.jsp">Home page</a></p>

</body>
</html>