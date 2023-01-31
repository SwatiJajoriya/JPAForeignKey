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
t.settName(request.getParameter("tName"));
t.settDOB(request.getParameter("tDOB"));
t.settEmail(request.getParameter("tEmail"));
t.settAddress(request.getParameter("tAddress"));
t.settPhono(Long.parseLong(request.getParameter("tPhono")));
t.settDesignation(request.getParameter("tDesignation"));
int row=dao.insert(t);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("failure.jsp");
}%>
</body>
</html>