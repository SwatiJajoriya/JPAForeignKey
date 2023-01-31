<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="com.simplilearn.dao.AssignDao"%>
<%@page import="com.simplilearn.pojo.ReportSubjectNTeacher"%>
<%@page import="com.simplilearn.pojo.Teacher"%>
<%@page import="com.simplilearn.dao.Teacherdao"%>
<%@page import="com.simplilearn.pojo.Subject"%>
<%@page import="com.simplilearn.dao.Subjectdao"%>
<%@page import="com.simplilearn.pojo.Classes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.simplilearn.dao.Classesdao"%>
 
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
<%int sc=Integer.parseInt(request.getParameter("cid"));
		
		Classesdao vf=new Classesdao();
		Classes cc= vf.getClasse(sc);
		String name=cc.getClassName();				
		%>
<h2>Assign Teacher and Subject for <b><%=name%></b></h2>

<form action="AssinController" method="post">
<table border="1">
<tr><td><input type="hidden" name="cid" value=<%=request.getParameter("cid") %>>
Select Teacher
<%
Teacherdao dao1=new Teacherdao();
List<Teacher> list1=dao1.display();%>
<select name="teacher">
<option>Select an option</option>
<%
for(Teacher	t:list1){
	%>
	<option value="<%=t.gettId()+","+t.gettName()%>"><%=t.gettName()%></option>	
	
	<% }%>	
</select></td></tr>

<tr><td>Select Subject
<%
Subjectdao dao=new Subjectdao();
List<Subject> list=dao.display();%>
<select name="subject">
	<option>Select an option</option>
<%
for(Subject	sub:list){
	%>

	<option value="<%=sub.getSubId()+","+sub.getSubName()%>"><%=sub.getSubName()%></option>	
	
	<% }%>
</select>
<br>
<br>
<input type="submit" value="Assign"></td></tr>
</table>

</form>
	<%
	AssignDao Dao = new AssignDao();
	ArrayList<ReportSubjectNTeacher> arr1 = (ArrayList<ReportSubjectNTeacher>) Dao.getAllData(sc);
	%>
	<br>
<br>
	<table border="1">
			<tr>
				<th>ID</th>
				<th>Class Name</th>
				<th>Subject Name</th>
				<th>Teacher Name</th>
				
			</tr>
			<%
			for (ReportSubjectNTeacher cc1 : arr1) {
			%>

			<tr>
				<td><%=cc1.getId()%></td>
				<td><%=cc1.getClassName()%>
				<td><%=cc1.getSuBName()%></td>
				<td><%=cc1.gettName()%></td>
				
			</tr>
			<%
			}
			%>
		</table>
	
</body>
</html>