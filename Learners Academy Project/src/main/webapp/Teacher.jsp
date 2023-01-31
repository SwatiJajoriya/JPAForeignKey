<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.simplilearn.dao.Teacherdao" %>
    <%@page import="com.simplilearn.pojo.Teacher"%>
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
<form action="addteacher.jsp" method="post">
<input type="submit" value="Add Teacher">
</form>
<h1><i>List of Teacher</i></h1>
<table border="1">
<tr><th>Teacher ID</th><th>Teacher Name</th><th>Teacher DOB</th><th>Teacher Email</th><th>Teacher Address</th><th>Teacher Phono</th><th>Designation</th><th>Edit Action</th><th>Delete Action</th></tr>
<%
Teacherdao dao=new Teacherdao();
List<Teacher> list=dao.display();
for(Teacher t:list){
%>
<tr><td><%=t.gettId()%></td><td><%=t.gettName()%></td><td><%=t.gettDOB()%></td><td><%=t.gettEmail()%></td><td><%=t.gettAddress()%></td><td><%=t.gettPhono()%></td><td><%=t.gettDesignation()%></td><td><a href="editteacher.jsp?tId=<%=t.gettId()%>">Edit</a></td><td><a href="deleteteacher.jsp?tId=<%=t.gettId()%>">Delete</a></td></tr>
<%} %>
</table>
</body>
</html>