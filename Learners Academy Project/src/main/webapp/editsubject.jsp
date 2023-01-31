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
<br><br>
<h1><i>Edit the Subject</i></h1>
<form action="editsubjectController.jsp" method="post">
<input type="hidden" name="subId" value=<%=request.getParameter("subId") %>>
Subject Name <input type="text" name="subjectName">
<input type="submit" value="Edit"></form></body></html>