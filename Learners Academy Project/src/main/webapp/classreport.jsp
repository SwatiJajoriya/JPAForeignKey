<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.simplilearn.pojo.ReportSubjectNTeacher"%>
    <%@page import="java.util.ArrayList"%>
    <%@page import="com.simplilearn.dao.AssignDao"%>
    <%@page import="com.simplilearn.pojo.Classes"%>
    <%@page import="com.simplilearn.dao.Classesdao"%>
     <%@page import="com.simplilearn.dao.Studentdao" %>
    <%@page import="com.simplilearn.pojo.Student"%>
        <%@page import="java.util.*" %>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int sc=Integer.parseInt(request.getParameter("cid"));
		
		Classesdao vf=new Classesdao();
		Classes cc= vf.getClasse(sc);
		String name=cc.getClassName();				
		%>
<h2>Class Report for <b><%=name%></b></h2>

<%
	AssignDao Dao = new AssignDao();
	ArrayList<ReportSubjectNTeacher> arr1 =(ArrayList<ReportSubjectNTeacher>) Dao.getAllData(sc);
	%>
	<br>
<br>
	<table border="1">
<tr><th>ID</th><th>Class Name</th><th>Subject Name</th><th>Teacher Name</th></tr>
				
			<%
			for (ReportSubjectNTeacher cc1 : arr1) {
			%>

<tr><td><%=cc1.getId()%></td><td><%=cc1.getClassName()%><td><%=cc1.getSuBName()%></td><td><%=cc1.gettName()%></td></tr>

			<%
			}
			%>
		</table>
<h1>Student List</h1>		
<table border="1">			
				
<tr><th>Class ID</th><th>Class Name</th><th>Student ID</th><th>Student Name</th><th>Student DOB</th><th>Student Email</th><th>Student Address</th><th>Student Phono</th>				
<%
Studentdao dao=new Studentdao();
List<Student> list=dao.getAllData(sc);
for(Student s:list){
%>				
<tr><td><%=sc%></td><td><%=s.getClasses().getClassName()%></td><td><%=s.getStudentId()%></td><td><%=s.getStudentName()%></td><td><%=s.getStudentDOB()%></td><td><%=s.getStudentEmail()%></td><td><%=s.getStudentAddress()%></td><td><%=s.getStudentPhono()%></td></tr>	
<%} %>
</table>
</body>
</html>