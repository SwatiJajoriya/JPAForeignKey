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
c.setClassName(request.getParameter("className"));

String s=dao.update(c);

if(s!=null){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("failure.jsp");
}
%>

</body>
</html>