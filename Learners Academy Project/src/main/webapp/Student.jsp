<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.simplilearn.dao.Studentdao" %>
<%@page import="com.simplilearn.pojo.Student"%>
<%@page import="java.util.*" %>
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
<form action="addstudent.jsp">
<input type="submit" value="Add Student">
</form>
<h1><i>List of Student</i></h1>
<table border="1">
<tr><th>Student ID</th><th>Student Name</th><th>Student DOB</th><th>Student Email</th><th>Student Address</th><th>Student Phono</th><th>Classes</th><th>Edit Action</th><th>Delete Action</th></tr>
<%
Studentdao dao=new Studentdao();
List<Student> list=dao.display();
for(Student s:list){
%>
<tr><td><%=s.getStudentId()%></td><td><%=s.getStudentName()%></td><td><%=s.getStudentDOB()%></td><td><%=s.getStudentEmail()%></td><td><%=s.getStudentAddress()%></td><td><%=s.getStudentPhono()%></td><td><%=s.getClasses().getClassName()%></td><td><a href="editstudent.jsp?sid=<%=s.getStudentId()%>">Edit</a></td><td><a href="deletestudent.jsp?sid=<%=s.getStudentId()%>">Delete</a></td></tr>
<%} %>
</table></body></html>