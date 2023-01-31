<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.simplilearn.dao.Studentdao" %>
    <%@page import="com.simplilearn.pojo.Student"%>
       <%@page import="com.simplilearn.pojo.Classes"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><% 
Studentdao dao=new Studentdao();
Student student=new Student();
student.setStudentId(Integer.parseInt(request.getParameter("sid")));
student.setStudentName(request.getParameter("studentName"));
student.setStudentDOB(request.getParameter("studentDOB"));
student.setStudentEmail(request.getParameter("studentEmail"));
student.setStudentAddress(request.getParameter("studentAddress"));
student.setStudentPhono(Long.parseLong(request.getParameter("studentPhono")));
String ss=request.getParameter("Class");
String[]a=ss.split(",");
Classes c=new Classes();
c.setClassId(Integer.parseInt(a[0]));
c.setClassName(a[1]);
student.setClasses(c);
String s=dao.update(student);
if(s!=null){response.sendRedirect("success.jsp");
}else{response.sendRedirect("failure.jsp");
}%>
</body></html>