<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页</title>
</head>
<body>
<h2>用户登录程序</h2>
<form action="login.jsp" method="post">
用户名：<input type="text" name="userid"/>
<input type="submit" value="登录" />
</form>
 <%
    String userid=request.getParameter("userid");
    if(!(userid==null||"".endsWith(userid))){
    	session.setAttribute("userid", userid);
    	response.sendRedirect("list.jsp");
    }
 %>


</body>
</html>