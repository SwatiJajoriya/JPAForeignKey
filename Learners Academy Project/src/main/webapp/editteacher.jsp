<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<a href="Home.jsp">Home</a>&nbsp
<a href="Logout.jsp">Logout</a>
<br>
<br>
<h1><i>Edit the Teacher</i></h1>
<form action="editteacherController.jsp" method="post">
<input type="hidden" name="tId" value=<%=request.getParameter("tId") %>>

Teacher Name <input type="text" name="tName">
<br>
<br>
Teacher DOB <input type="text" name="tDOB">
<br>
<br>
Teacher Email <input type="email" name="tEmail">
<br>
<br>
Teacher Address <input type="text" name="tAddress">
<br>
<br>
Teacher Phono <input type="text" name="tPhono">
<br>
<br>
Designation <input type="text" name="tDesignation">

<input type="submit" value="Edit">
</form>
</body>
</html>