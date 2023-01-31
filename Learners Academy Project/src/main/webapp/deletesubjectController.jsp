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
<%Subjectdao dao=new Subjectdao();
Subject sub=new Subject();
sub.setSubId(Integer.parseInt(request.getParameter("subId")));
String s=dao.delete(sub);
if(s.equals("deleted"))
{response.sendRedirect("success.jsp");
}
else{response.sendRedirect("failure.jsp");
}%>
</body></html>