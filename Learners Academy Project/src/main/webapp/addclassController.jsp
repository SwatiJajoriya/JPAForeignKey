<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.simplilearn.dao.Classesdao" %>
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
<br>
<br>
<%
Classesdao dao=new Classesdao();
Classes c=new Classes();

c.setClassId(Integer.parseInt(request.getParameter("classId")));
c.setClassName(request.getParameter("className"));

int row=dao.insert(c);

if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("failure.jsp");
}
%>
</body>
</html>