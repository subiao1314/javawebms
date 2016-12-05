<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session跳转页面</title>
</head>
<body>
   <%
     String username=(String)session.getAttribute("name");  
     String userphone=(String)session.getAttribute("tel");  
   
   %>
   <P><b>用户名:<%=username %></b></P>
   <P><b>电&nbsp;话:<%=userphone %></b></P>
        
</body>
</html>