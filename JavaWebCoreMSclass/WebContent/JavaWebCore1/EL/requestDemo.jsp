<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试request接收变量</title>
</head>
  <%pageContext.setAttribute("color", "red"); %> 
  <%request.setAttribute("color", "green"); %>  
  <%session.setAttribute("color", "pink"); %> 
 <%application.setAttribute("color", "blue"); %> 


<%-- <body bgcolor="${Y}"> --%>
<%-- <body bgcolor="${applicationScope.color}"> --%>
<body>
<%
request.setAttribute("info", "Hello World!!!");
%>

<h3>${requestScope.info}</h3>
</body>
</html>