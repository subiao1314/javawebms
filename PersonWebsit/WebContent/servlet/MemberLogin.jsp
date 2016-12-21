<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员登录界面</title>
</head>
<body>
<%String now=new Date().toLocaleString(); %>
<form action="<%request.getContextPath();%>../MemberLoginServlet" method="post">
<h2>会员通道  <%=now%></h2>
<h3>会员号:<input type="text" name="userName"/></h3>
<h3>密&nbsp;码:<input type="password" name="passWord"/></h3>
<span>
  <input type="submit" value="进入" />
  <input type="Reset" value="重来" />
</span>
</form>
</body>
</html>