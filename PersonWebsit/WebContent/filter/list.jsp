<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线用户列表</title>
</head>
<body>
<h2>在线用户列表</h2>
<%
  //从application 中取出所有用户的保存列表
  Set all=(Set) this.getServletContext().getAttribute("online");
  Iterator iter =all.iterator();   //实例化Iterator输出
     while (iter.hasNext()){    //迭代输出
%>
  <%=iter.hasNext() %>
  
  <%} %>

</body>
</html>