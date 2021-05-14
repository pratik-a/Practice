<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*,java.io.*,java.lang.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<%
	try
	{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter num1");
			int num1=sc.nextInt();
			System.out.println("enter num2");
			int num2=sc.nextInt();
			
			int k=num1/num2;
			
			System.out.println("answer"+k);
	}
	catch(Exception e)
	{
		out.print("error"+e.getMessage());
	}
	%>
</body>
</html>