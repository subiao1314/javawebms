<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录失败页面</title>
</head>
<body>
<h2>登录失败</h2>
<%
String userName=request.getParameter("username"); //获取实例化请求参数
String passWord=request.getParameter("password"); //获取实例化请求参数
%>
<h3>用户名：<%=userName %></h3>
<h3>密&nbsp;码：<%=passWord %></h3>
</body>
</html>