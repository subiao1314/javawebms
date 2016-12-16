<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接收页面</title>
</head>
<body>
<h3>request的属性： <%=request.getAttribute("location") %> </h3>
<h3>session的属性： <%=session.getAttribute("name") %> </h3>
<h3>application的属性： <%=application.getAttribute("age") %> </h3>
</body>
</html>