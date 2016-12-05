<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application跳转后页面</title>
</head>
<body>
   <%
    String username=(String)application.getAttribute("name");
    String userphone=(String)application.getAttribute("tel");
   %>
    <p><b>用户名:<%=username %></b></p>
    <p><b>用户名:<%=userphone %></b></p>
    
    
</body>
</html>