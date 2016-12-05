<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>flush direction</title>
</head>
<body>
  <center><h3>这是JSP：include flush演示</h3></center>
  <table border="1px" align="center">
   <jsp:include page="html/newPage1.html" flush="true"/>
   <jsp:include page="html/newPage2.html" flush="true"/>
   <jsp:include page="html/newPage3.html" flush="true"/>
   <jsp:include page="html/newPage4.html" flush="true"/>
  </table>
</body>
</html>