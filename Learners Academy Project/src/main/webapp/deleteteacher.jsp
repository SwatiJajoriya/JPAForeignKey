<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="Home.jsp">Home</a>&nbsp
<a href="Logout.jsp">Logout</a>
<br>
<br>
<h1><i>Delete the Teacher</i></h1>
<form action="deleteteacherController.jsp" method="post">
<input type="hidden" name="tId" value=<%=request.getParameter("tId") %>>
<input type="submit" value="Delete">
</form></body></html>