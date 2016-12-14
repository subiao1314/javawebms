<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>url 演示</title>
</head>
<body>
  <c:url value="http://www.hao123.com" var="hao123" />
  ${hao123};
<br><hr/>
   <c:url value="http://www.baidu.com" var="baidu">
   <c:param name="tt" value="zhangsan"></c:param>
   <c:param name="dd" value="guoji"></c:param>
   </c:url>
    <span>${'${'}baidu}</span> ${baidu}
<%--   <c:redirect url="${baidu}" ></c:redirect> --%>
  

<br/><hr/>
<c:set var="n" value="90"></c:set>
 <span>${'${'} n} :</span> ${n}
 <br/>
<c:choose>
<c:when test="${n>=60 && n<=100}">
${"成绩合格"}

</c:when>
<c:otherwise>
${"成绩不合格！"}
</c:otherwise>
</c:choose>
<c:forTokens items="" delims="">
</c:forTokens>

<br/><hr/>
${ '${'}fn:toLowerCase("ABCD") }: ${fn:toLowerCase("ABCD") }<br/>
${ '${'}fn:toUpperCase("abcd") }: ${fn:toUpperCase("abcd") }<br/>
${ '${'}fn:length("abcd") }: ${fn:length("abcd") }<br/>









  
  
  
  
</body>
</html>