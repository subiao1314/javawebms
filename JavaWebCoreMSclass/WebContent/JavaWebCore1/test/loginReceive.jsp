<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login Receive</title>
</head>
<body>
  <%
  String uName=request.getParameter("userName");
  String upWorld=request.getParameter("userPassed");
    if(uName.equals("subiao")&&upWorld.equals("123456")){
  %>
     <jsp:forward page="loginSuccess.html"></jsp:forward>
 <%
 }
    else{
 %>
     <jsp:forward page="loginField.html"></jsp:forward>
<%} %> 
  
  
</body>
</html>