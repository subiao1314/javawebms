<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.ddb.javaweb.bean.*"  %>
    <jsp:useBean id="book" class="com.ddb.javaweb.bean.BookBean">
    <jsp:setProperty name="book" property="name" value="java实战经典"/>    
    <jsp:setProperty name="book" property="num" value="366"/>
    </jsp:useBean>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>获取bean的属性值</title>
</head>
<body>
  书名:${book.name}<br/>
  数量:${book.num}

</body>
</html>