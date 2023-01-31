 <%@page import="com.simplilearn.dao.Classesdao" %>
<%@page import="java.util.*" %>
<%@page import="com.simplilearn.pojo.Classes"%>
 
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
<h1><i>Add a Student</i></h1>
<form action="addstudentController.jsp">
<table>
<tr><td>StudentId</td><td><input type="text" name="studentid"></td></tr>
<tr><td>StudentName</td><td><input type="text" name="studentName"></td></tr>
<tr><td>StudentDOB</td><td><input type="text" name="studentDOB"></td></tr>
<tr><td>StudentEmail</td><td><input type="email" name="studentEmail"></td></tr>
<tr><td>StudentAddress</td><td><input type="text" name="studentAddress"></td></tr>
<tr><td>StudentPhono</td><td><input type="text" name="studentPhono"></td></tr>
<tr><td>Student Class 
<%Classesdao dao=new Classesdao();
List<Classes> list=dao.display();%>
<select name="Class">
<option>Select an option</option>
<%
for(Classes	c:list){
	%>
	<option value="<%=c.getClassId()+","+c.getClassName()%>"><%=c.getClassName()%></option>	
		<% }%>
</select></td></tr>
<tr><td><input type="submit" value="Save"></td></tr>
</table></form></body></html>