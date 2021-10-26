<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home page</h1>
<p>
${message}<br/>
<a href="${pageContext.request.contextPath}/employee/add.html">Add new employee Record</a><br/>
<a href="${pageContext.request.contextPath}/employee/list.html">Employee list</a><br/>
	<form action="list-of-employee.jsp">To view Employee list &emsp;&emsp;&nbsp;&emsp;
			<input type="submit" value="click here">
			</form><br>
</p>
</body>
</html>