<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
not found
<%
if("Yes".equals(request.getParameter("other"))){
	pageContext.forward("other");
}
%>
</body>
</html>