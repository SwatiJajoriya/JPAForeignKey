<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 >Welcome to Learner's Academy</h1><br><br>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
if(username.isEmpty() || password.isEmpty()||!(username.equals(password)))
{
	response.sendRedirect("Fail.jsp");
}
else
{
	response.sendRedirect("Home.jsp");
}
 %>
</body>
</html>