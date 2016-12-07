<%@page import="org.eclipse.jdt.internal.compiler.ast.ThisReference"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>取得用户操作时间</title>
</head>
<body>
 <%
 long start=session.getCreationTime();
 long end=session.getLastAccessedTime();
 long time=(end-start)/1000;
 
 %>
 <h2>您已经停留了<%=time %>秒</h2>

<%
  Enumeration enu=this.getServletContext().getAttributeNames();
  if(enu.hasMoreElements()){
    String name=(String)enu.nextElement();
%>
<h4><%=name %>--><%=this.getServletContext().getAttribute(name) %></h4>

<%} %>
</body>
</html>