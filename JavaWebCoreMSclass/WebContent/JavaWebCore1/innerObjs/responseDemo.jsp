<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>responseDemo </title>
</head>
<body>
   <%!  //定义全局变量
       int count=0;
   %>
   <%
     response.setHeader("refresh", "2,http://www.hao123.com");
   %>   
   <p><b>统计刷新次数：<%=count++ %></b></p>



</body>
</html>