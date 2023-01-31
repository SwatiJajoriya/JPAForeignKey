<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student data</h2>
<form action="update">
<input type="hidden" name="sid" value=<%=request.getParameter("sid") %>>
semail<input type="text" name="email">
sphono<input type="text" name="phono">
<input type="submit" value="Edit">
</form>
</body>
</html>