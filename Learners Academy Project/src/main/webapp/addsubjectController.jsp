<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.simplilearn.dao.Subjectdao" %>
    <%@page import="com.simplilearn.pojo.Subject"%>
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
<%Subjectdao dao=new Subjectdao();
Subject sub=new Subject();
sub.setSubId(Integer.parseInt(request.getParameter("subId")));
sub.setSubName(request.getParameter("subName"));
int row=dao.insert(sub);
if(row>0){	response.sendRedirect("success.jsp");
}
else{response.sendRedirect("failure.jsp");
}%>
</body></html>