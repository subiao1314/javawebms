<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cookie演示</title>
</head>
<body>
   <%
    Cookie c1=new Cookie("class1","Java");
       c1.setMaxAge(60);
       response.addCookie(c1);
   %>
        <span> ${'${'}cookie.class1.name} : </span>${cookie.class1.name}<br/>
      <span> ${'${'}cookie.class1.value} : </span>${cookie.class1.value}<br/> 
      <span> ${'${'}cookie['class1'].name} : </span>${cookie['class1'].name}<br/>
      <span> ${'${'}cookie['class1'].value} : </span>${cookie['class1'].value}<br/>
      

</body>
</html>