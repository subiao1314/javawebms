<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request原页面</title>
</head>
<body>
  <%
      request.setAttribute("name","老wang");
      request.setAttribute("tel","123455");
  
  %>
   <!--  <br/> <a href="request2.jsp">跳转</a>  -->
      <jsp:forward page="request2.jsp" />  
  
  
</body>
</html>