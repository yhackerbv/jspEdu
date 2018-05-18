<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Java Bean</title>
</head>
<body>
	<jsp:useBean class="com.edu.beans.HelloBean" id="hello" scope="application" />
	
	<jsp:getProperty property="name" name="hello" /><br>
	<jsp:getProperty property="number" name="hello" /><br>
	
	<jsp:setProperty property="name" name="hello" value="Amy" />
	<jsp:setProperty property="number" name="hello" value="12345" />
	<hr>
	
	<jsp:getProperty property="name" name="hello"/><br>
	<jsp:getProperty property="number" name="hello"/><br>
	
	<%
		String name = hello.getName();
		hello.setName("³ëÇöÁ¾");
		out.print(name);
		
	%>
</body>
</html>