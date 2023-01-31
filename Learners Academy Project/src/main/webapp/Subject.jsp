<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.simplilearn.dao.Subjectdao" %>
    <%@page import="com.simplilearn.pojo.Subject"%>
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
<br>
<br>
<form action="addsubject.jsp">
<input type="submit" value="Add Subject">
</form>
<h1><i>List of Subjects</i></h1>
<table border="1">
<tr><th>Subject ID</th><th>Subject Name</th><th>Edit Action</th><th>Delete Action</th></tr></tr>
<%
Subjectdao dao=new Subjectdao();
List<Subject> list=dao.display();
for(Subject sub:list){
%>
<tr><td><%=sub.getSubId()%></td><td><%=sub.getSubName()%></td></td><td><a href="editsubject.jsp?subId=<%=sub.getSubId()%>">Edit</a></td><td><a href="deletesubject.jsp?subId=<%=sub.getSubId()%>">Delete</a></td></tr>
<%} %>
</table></body></html>