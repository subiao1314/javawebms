<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>redirect 演示</title>
</head>
<body>
  <c:redirect url="redirect2.jsp">
     <c:param name="userName" value="zhangsan"></c:param>
     <c:param name="passWorld" value="123456"></c:param>
  </c:redirect>



</body>
</html>