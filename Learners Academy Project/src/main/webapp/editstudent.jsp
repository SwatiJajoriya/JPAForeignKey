<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.simplilearn.dao.Classesdao" %>
<%@page import="java.util.*" %>
<%@page import="com.simplilearn.pojo.Classes"%>
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
<h1><i>Edit the Student</i></h1>
<form action="editstudentController.jsp" method="post">
<input type="hidden" name="sid" value=<%=request.getParameter("sid") %>>
Student Name <input type="text" name="studentName">
<br><br>
Student DOB <input type="text" name="studentDOB">
<br><br>
Student Email <input type="email" name="studentEmail">
<br><br>
Student Address <input type="text" name="studentAddress">
<br><br>
Student Phono <input type="text" name="studentPhono">
<br><br>
<tr><td>Student Class 
<%
Classesdao dao=new Classesdao();
List<Classes> list=dao.display();%>
<select name="Class">
<option>Select an option</option>
<%
for(Classes	c:list){
	%>
	<option value="<%=c.getClassId()+","+c.getClassName()%>"><%=c.getClassName()%></option>	
		<% }%>
</select></td></tr>
<input type="submit" value="Edit">
</body></html>