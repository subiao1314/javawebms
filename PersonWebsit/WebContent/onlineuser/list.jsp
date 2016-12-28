<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list页面</title>
</head>
<body>
 <h2>显示登录列表</h2>
 <%
    String online= (String)application.getAttribute("online");  
  
 %>
   <%="当前在线人数为"+online %>
   
</body>
</html>