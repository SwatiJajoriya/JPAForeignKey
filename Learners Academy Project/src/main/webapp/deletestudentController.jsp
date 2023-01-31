<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.simplilearn.dao.Studentdao" %>
    <%@page import="com.simplilearn.pojo.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Studentdao dao=new Studentdao();
Student student=new Student();
student.setStudentId(Integer.parseInt(request.getParameter("sid")));
String s=dao.delete(student);
if(s.equals("deleted"))
{response.sendRedirect("success.jsp");
}else{response.sendRedirect("failure.jsp");
}%>
</body></html>