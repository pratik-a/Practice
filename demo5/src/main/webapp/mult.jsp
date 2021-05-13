<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	
	<%!
		int k=10;
	%>
	
	<%
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		out.println("mutiplication is "+(i*j*k));
	%>
	<br>
	addition is :<%=(i+j+k) %>
	
</body>
</html>