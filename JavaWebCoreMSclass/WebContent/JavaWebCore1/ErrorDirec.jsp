<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorNet.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>运算页面</title>
</head>
<body>
//这个页面一定会出错
<%  out.println("运算页面的内容 a/b");
     int a=0;
     int b=5;
     out.println(a+"/"+b+"="+b/a);
     

%>
  <p></p>

</body>
</html>