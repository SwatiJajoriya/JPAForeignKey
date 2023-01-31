<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.simplilearn.dao.Teacherdao" %>
    <%@page import="com.simplilearn.pojo.Teacher"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Teacherdao dao=new Teacherdao();
Teacher t=new Teacher();
t.settId(Integer.parseInt(request.getParameter("tId")));
String s=dao.delete(t);
if(s.equals("deleted"))
{
response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("failure.jsp");
}%>
</body></html>