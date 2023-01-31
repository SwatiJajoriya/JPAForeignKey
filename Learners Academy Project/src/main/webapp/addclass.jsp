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
<h1><i>Add a Class</i></h1>
<form action="addclassController.jsp">
<table>
<tr><td>ClassId</td><td><input type="text" name="classId"></td></tr>
<tr><td>ClassName</td><td><input type="text" name="className"></td></tr>

<tr><td><input type="submit" value="Save"></td></tr>

</table>
</form>
</body>
</html>