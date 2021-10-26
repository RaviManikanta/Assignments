<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>core tags</h1>
	<c:out value="${'welcome to jstl demos'}"></c:out>
	<c:set var="number" scope="session" value="${50000}"></c:set>
	<c:out value="${number }"></c:out>
	<c:if test="${number>=20000 }">
		<p>
			number is
			<c:out value="${number }"></c:out>
		</p>
	</c:if>
	<br>

	<c:choose>
		<c:when test="${number <= 10000 }"> number is lessthan 10000</c:when>
		<c:when test="${number >= 10000 }">number is greaterthan 10000</c:when>
		<c:otherwise>invalid data</c:otherwise>
	</c:choose>
	<br>
	<br>
	<c:remove var="number" />
	<c:out value="${number }"></c:out>

	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}"></c:out>
	</c:forEach>
	<br>
	<br>


	<c:catch var="Exception">
		<%
		int x = 5 / 0;
		%>
	</c:catch>
	<c:if test="${Exception != null}">
		<p>
			The type of exception is : ${Exception} <br /> There is an exception:
			${Exception.message}
		</p>
	</c:if>
	<br>
	<br>


	<c:url value="/jstlDemo.jsp" var="completeURL">
		<c:param name="trackingId" value="257" />
		<c:param name="user" value="Ravi" />
	</c:url>
	${completeURL}
	<br>
	<br>


	<c:forTokens items="Anvesh,ravi,dharmesh,anuj" delims="," var="name">
		<c:out value="${name}" />
		<p>
	</c:forTokens>
	<br>
	<br>

	<h1>function tags</h1>
	<c:set var="String" value="welcome to jstl demos" />
	${fn:toUpperCase(String)}
	<br> length of the string : ${fn:length(String)}
	<br> Replace tag: ${fn:replace(String,'demos','functions tag')}
	<c:if test="${fn:contains(String, 'welcome')}">
		<p>Found welcome string</p>
	</c:if>
	<c:if test="${fn:containsIgnoreCase(String, 'WELCOME')}">
		<p>Found WELCOME string</p>
	</c:if>
	<c:if test="${fn:endsWith(String, 'demos')}">
		<p>String ends with demos</p>
	</c:if>
	
	<h1>formatting tags</h1>
	<c:set var="date" value="<%=new java.util.Date() %>"></c:set>
	<c:out value="${date }"></c:out>
	<br>
	<fmt:formatDate value="${date}"/><br>
	<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${date}"/>
	<fmt:setTimeZone value="GMT+05:30" />
	<p>
		Date and Time in GMT-10 time Zone: 
		<fmt:formatDate value="${date}" type="both" timeStyle="long" dateStyle="long" />
	</p>



</body>
</html>