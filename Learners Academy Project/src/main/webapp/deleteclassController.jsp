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
<% 
Classesdao dao=new Classesdao();
Classes c=new Classes();


c.setClassId(Integer.parseInt(request.getParameter("cId")));

String s=dao.delete(c);

if(s.equals("deleted"))
{
	
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("failure.jsp");
}
%>
</body>
</html>