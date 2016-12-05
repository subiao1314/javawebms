<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page属性设置并输出</title>
</head>
<body>
   <%  
     pageContext.setAttribute("name","zhangsan");
     pageContext.setAttribute("birthday", "1992-1-1"); 
     
   %>
    <%
     String username=(String)pageContext.getAttribute("name");
     String userbirthday=(String)pageContext.getAttribute("birthday");
    %>
     <h2>用户名：<%=username %></h2>
     <h2>生&nbsp;日：<%=userbirthday %></h2>

</body>
</html>