<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>for TokensDemo</title>
</head>
<body>
 <%
   String address="beijing,shanghai;nanjing!hefei,jinan";
		request.setAttribute("address", address);
 %>
  <c:forTokens var="address" items="${address}"
  varStatus="status"  delims=",;!">
  ${status.count}.${address}<br/>
  </c:forTokens>


</body>
</html>