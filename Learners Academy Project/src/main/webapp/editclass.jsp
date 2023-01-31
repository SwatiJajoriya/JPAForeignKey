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
<h1><i>Edit the Class</i></h1>
<form action="editclassController.jsp" method="post">
<input type="hidden" name="cId" value=<%=request.getParameter("cId") %>>
Class Name <input type="text" name="className">
<input type="submit" value="Edit">
</form>
</body>
</html>