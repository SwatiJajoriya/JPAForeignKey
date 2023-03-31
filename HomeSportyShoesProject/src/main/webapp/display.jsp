<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.*" %>
    <%@page import="com.ecommerce.demo.*" %>
    <%@page import="java.nio.file.Files" %>
    <%@page import="java.io.File" %>
      <%@page import="java.util.Base64.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Shoedata> list=(List<Shoedata>)request.getAttribute("list"); %>
<table border="1">
<tr><th>ShoeId</th><th>Name</th><th>Price</th><th>Image</th></tr>
<%for(Shoedata sd:list){ %>
<tr><td><%=sd.getId() %></td>
<td><%=sd.getName() %></td>
<td><%=sd.getPrice() %></td>
<td><%String path=sd.getFilePath();
byte[] images=Files.readAllBytes(new File(path).toPath());
byte[] encodeBase64 = Base64.getEncoder().encode(images);
String base64Encoded = new String(encodeBase64, "UTF-8");
%>
<img alt="img" src="data:image/png;base64,<%=base64Encoded%>"/></td></tr>
<%} %>
</table>
</body>
</html>