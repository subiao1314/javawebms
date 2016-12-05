<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
	<center>
		<h2>用户登录界面</h2>
	</center>
	<hr />
	<form name="form1" method="post" action="loginReceive.jsp">
		姓名 <input type="text" name="userName" size="12"> <br /> 密码 <input
			type="password" name="passWord" size="12"> <br /> <input
			type="submit" name="Submit" value="提交"> <input type="reset"
			name="Submit2" value="重置">

	</form>
</body>
</html>