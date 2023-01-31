<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page import="com.simplilearn.dao.Classesdao" %>
    <%@page import="com.simplilearn.pojo.Classes"%>
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
<form action="addclass.jsp">
<input type="submit" value="Add Class">
</form>

<h1><i>List of Classes</i></h1>
<table border="1">
<tr><th>Class ID</th><th>Class Name</th><th>Add</th><th>Edit Action</th><th>Delete Action</th><th>Class Report</th></tr>

<%
Classesdao dao=new Classesdao();
List<Classes> list=dao.display();
for(Classes c:list){
%>
<tr><td><%=c.getClassId()%></td><td><%=c.getClassName()%></td><td><a href="addsubjectTeacher.jsp?cid=<%=c.getClassId()%>">Subjects and Teachers</a></td><td><a href="editclass.jsp?cId=<%=c.getClassId()%>">Edit</a></td><td><a href="deleteclass.jsp?cId=<%=c.getClassId()%>">Delete</a></td><td><a href="classreport.jsp?cid=<%=c.getClassId()%>">View Reports</a></td></tr>
<%} %>
</table>
</body>
</html>