<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%List<Employee> e=(List<Employee>)request.getAttribute("list"); %>

<table border="1">
<tr><th>Empid</th><th>Empname</th><th>Empphono</th></tr>

<%for(Employee es:e){%>
<tr><td><%=es.getEmpno() %></td><td><%=es.getEmpname() %></td><td><%=es.getPhono()%></td></tr>
<%}%>
</table>
</body>
</html>
