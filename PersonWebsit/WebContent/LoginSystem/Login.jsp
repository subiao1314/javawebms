<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到登录界面</title>
</head>
<body>
	<form name="form1" action="<%=request.getContextPath()%>/LoginReceive"  method="post"
			style="height: 437px;">
			<table style="width: 326px; height: 204px; border: 1px solid;">
				<tr>
					<td>用户名：&nbsp;</td>
					<td><input name="username" type="text" size="18" value="请输入账号" /></td>
				</tr>
				<tr>
					<td>密&nbsp;码：&nbsp;</td>
					<td><input name="password" type="password" size="18"
						value="请输入密码" /></td>
				</tr>
				<tr>
					<td colspan="2"><input name="submit" type="submit" value="登录" />
						<input name="reset" type="reset" value="重置" /></td>
				</tr>
			</table>
		</form>


</body>
</html>