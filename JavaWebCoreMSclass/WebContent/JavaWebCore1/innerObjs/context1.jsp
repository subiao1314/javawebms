<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page context原页面</title>
</head>
<body>
  <%
    pageContext.setAttribute("name","老张",PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("tel","123451");
  
  %>
   <!-- <br/> <a href="context2.jsp">跳转</a> -->
     <jsp:forward page="context2.jsp" /> 
  
  
</body>
</html>