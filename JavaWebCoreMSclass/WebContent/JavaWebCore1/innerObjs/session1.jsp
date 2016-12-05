<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session原页面</title>
</head>
<body>
  <%
      session.setAttribute("name","老张");
      session.setAttribute("tel","123451");
  
  %>
    <br/> <a href="session2.jsp">跳转</a> 
   <%--   <jsp:forward page="session2.jsp" />  --%>
  
  
</body>
</html>