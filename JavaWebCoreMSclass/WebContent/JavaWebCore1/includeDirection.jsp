<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<center> <h3>通过include方法导入输出当前时间为：</h3>
 <hr/>
    <%@include file="html/systemtime.html" %>
    <hr/>
 <%=(new Date()).toLocaleString()%>

 </center>

</body>
</html>