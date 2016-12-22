<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员登陆失败页面</title>
</head>
<body>
<h4>Sorry,Your Userid no pass</h4>
<%-- <h4>Will return to the login page in 4 seconds</h4>
request.setHeader("refresh","1");
<%  int i = 1; %>
<h1>还有<%=i++%>秒跳转到会员登陆页面</h1>
 <%  if(i == 4) { %>
<jsp:forward page="../servlet/MemberLogin.jsp"/>

<% }%>  --%>

</body>
</html>