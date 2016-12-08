<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="com.ddb.javaweb.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>标准标签</title>
</head>
<body>
  <%
    BookBean bookBean=new BookBean();
    pageContext.setAttribute("book", bookBean);
  %>
    <c:set target="${book}" property="name">Java实战经典</c:set>
    <span>删除前：${book.name} </span><br/>
     <c:remove var="name" /> 
    <span>删除后：${book.name} </span><br/>
    <hr/>
    <c:out value="aa" default="这是默认值"></c:out><br/>
    <c:out value="${aa}" default="这是默认值"></c:out><br/>
    <c:out value="${aa}" >这是默认值</c:out><br/>
    <c:out value="${param.aa}" >这是默认值</c:out><br/>
          <!-- 当变量值为空时，显示default中的默认值  上面的可以通过地址栏简单传参数值测试 -->
    <c:out value="<China>" escapeXml="true"></c:out><br/>
    <c:out value="<China>" escapeXml="false"></c:out><br/>
    <c:out value="<b><i>China</i></b>" escapeXml="true"></c:out><br/>
    <c:out value="<b><i>China</i></b>" escapeXml="false"></c:out><br/>
    <hr/>
    <c:set var="time" property="1998年"></c:set>
    <span>删除前  ${'${'}time} ： ${pageScope.time} </span><br/>
          
          
    
</body>
</html>