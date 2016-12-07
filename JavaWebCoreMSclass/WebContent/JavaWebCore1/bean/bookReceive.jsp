<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.ddb.javaweb.bean.*" %>
    <jsp:useBean id="book" class="com.ddb.javaweb.bean.BookBean">
     <jsp:setProperty name="book" property="name"  value="BBBB"/>  
     <jsp:setProperty name="book" property="num" value="7777" />  
    </jsp:useBean>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bookReceve.jsp页面</title>
</head>
<body>
   <h1>订购图书清单</h1>
    <hr/>
    <h3><b>书名：</b></h3>
    <%=book.getName() %><br/>
    <h3><b>数量：</b></h3>
    <%=book.getNum() %>
</body>
</html>