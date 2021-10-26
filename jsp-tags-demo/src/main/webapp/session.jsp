<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
 
            String name = request.getParameter("uname");
            String email=request.getParameter("email");
            out.print("Welcome " + name+ " Email :"+email);
       
            session.setAttribute("user", name);      //set attribute in session
            session.setAttribute("email", email);
        %>
	<%   
           String name1=(String)session.getAttribute("user");    //Getting Session Attribute
            String email1=(String)session.getAttribute("email");
             out.print("<br>Welcome to Session Page:<br> Name"+name1+ " <br>Email"+email1);  
             session.invalidate();
             
%>

</body>
</html>