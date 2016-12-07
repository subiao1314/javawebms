<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用JSP表达式语言</title>
</head>
  <% pageContext.setAttribute("color", "green"); %>
<body >
<h1>表达式语言</h1>
<b>浏览器类型是：</b>
  <%-- ${header['User-Agent']} --%>
<form action="exception.jsp" method="post"></form>
 <b>${'FirstName:'}<input type="text" value="${'请输入您的名字' }"/>   </b>
 <b>${'LastName:'}<input type="text" value="${'请输入您的姓氏' }"/>   </b>
  <input type="submit" name="Submit" value="${'请提交表单' }"/>
  <input type="reset" value="${'重置表单' }"/> 
</body>
</html>