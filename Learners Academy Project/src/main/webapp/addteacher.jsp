<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1><i>Add a Teacher</i></h1>
<form action="addteacherController.jsp" method="post">
<table>
<tr><td>TeacherId</td><td><input type="text" name="tId"></td></tr>
<tr><td>TeacherName</td><td><input type="text" name="tName"></td></tr>
<tr><td>TeacherDOB</td><td><input type="text" name="tDOB"></td></tr>
<tr><td>TeacherEmail</td><td><input type="email" name="tEmail"></td></tr>
<tr><td>TeacherAddress</td><td><input type="text" name="tAddress"></td></tr>
<tr><td>TeacherPhono</td><td><input type="text" name="tPhono"></td></tr>
<tr><td>TeacherDesignation</td><td><input type="text" name="tDesignation"></td></tr>

<tr><td><input type="submit" value="Save"></td></tr>
</table>
</form>
</body>
</html>
