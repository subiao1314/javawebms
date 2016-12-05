<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请登录账号和密码</title>
</head>
<body>
<form name="myForm"  method="post" action="loginReceive.jsp" >
   <span><b>用户名：</b></span>
   <input name="userName" type="text" size="32" title="请输入用户名" />
   <br/>
   <span><b>密&nbsp;码：</b></span>
   <input name="userPassed" type="password" size="32" title="请输入密码" />
   <br/>
   <input name="submit"  type="submit" value="登录"/>&nbsp;&nbsp;&nbsp;
   <input name="reset"  type="reset" value="登录"/>


</form>
</body>
</html>