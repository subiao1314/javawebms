<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接收登录信息界面</title>
</head>
<body>
	<%
       String userName=request.getParameter("username");
       String passWord=request.getParameter("password");
       if(userName.equals("HelloWorld") && passWord.equals("123321"))
       {     
     %>
	<jsp:forward page="LoginSuccess.html" />
	<% 
       }else{
     %>
	<jsp:forward page="LoginFalsed.html" />
	<%} %>

</body>
</html>