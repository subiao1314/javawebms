<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@page import="com.ddb.javaweb.bean.*" %>	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL--JSP标准标签库</title>
</head>
<body>
      <%
       BookBean dd=new BookBean();
       pageContext.setAttribute("bb", dd);
     %> 
     <jsp:useBean id="book" class="com.ddb.javaweb.bean.BookBean">
     <%-- <jsp:setProperty name="book" property="name" value="spring" />
     <jsp:setProperty name="book" property="num" value="6" /> 
       //JSP标签的方式设置属性值
     --%>
     </jsp:useBean>
     
	<c:out value="通过这种方式来打印！" />
	<br />
	<c:out value="Hello World"></c:out>
	<br />
    <c:set var="name" value="zhangsan" scope="page"> </c:set>
     <span>${'${'}name} :</span>${name}<br/>
     <c:set var="age" scope="page" >25</c:set>
     <span>${'${'}age} :</span>${age}<br/>
     <span>${'${'}pageScope.age} :</span>${pageScope.age}<br/>
     <span>${'${'}sessionScope.age} :</span>${sessionScope.age}<br/>
      <hr/>
      <%--<c:set target="bb" property="name" value="JavaWeb"  ></c:set> 
                               这种方式无法获取，默认“bb”未定义的字符串，而通过EL传递过来的是变量！！ --%>
<%--       <c:set target="${book}" property="name" value="JavaWeb"  ></c:set>
       <c:set target="${book}" property="num" value="10"></c:set>  --%>
       
      <c:set target="${book}" property="name" >研磨设计</c:set>
       <c:set target="${book}" property="num" >50</c:set> 
       
       
      <span>书名 ： ${'${'} book.name} :</span>${book.name}<br/>
      <span>数量 ： ${'${'} book.num } :</span>${book.num }<br/> 
      


</body>
</html>