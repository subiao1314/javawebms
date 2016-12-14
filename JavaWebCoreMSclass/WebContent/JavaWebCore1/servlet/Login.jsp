<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员登录</title>
</head>
<body>
<h3>请输入用户信息：</h3><br/>
<form action="<%=request.getContextPath()%>/servlet/Login" method="post">
<span>用户名：</span><input type="text" name="userName"/><br/>
<span>密&nbsp;码：</span><input type="password" name="passWord"/><br/>
<input type="submit" value="提交" name="submit"/>
<input type="reset" value="重置" name="reset"/>
</form>
</body>
</html>