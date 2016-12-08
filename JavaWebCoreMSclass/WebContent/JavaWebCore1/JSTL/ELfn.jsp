<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL表达式演示</title>
</head>
<body>
 <%
   String[] arr={"步行","自行车","摩托车","汽车","火车"};
   request.setAttribute("arr", arr);
 %>
  <span>大写转小写：I LOVE CHINA  </span>${fn:toLowerCase("I LOVE CHINA")} <br/>
  <span> fn:contains("I LOVE CHINA","LOVE")  </span>${fn:contains("I LOVE CHINA","LOVE")} <br/>
  <span>fn:endsWhth("ABCDEF","A") </span>${fn:endsWith("ABCDEF","A")} <br/>
  <span>fn:indexOf("ABBBDEF","B") </span>${fn:indexOf("ABBBDEF","B")} <br/>
  <span> </span> <br/>
  <span> fn:join(arr,"，")  </span> ${fn:join(arr,",")} <br/>
  ${fn:length("I LOVE CHINA")}<br/>
  ${fn:split("I LOVE CHINA","-")}<br/>
  ${fn:substring(arr,0,4)}<br/>






</body>
</html>