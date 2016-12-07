<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>其他操作</title>
</head>
<body>
<span>${'${'}10.5 } : </span>${10.5 }<br/>
<span>${'${'}"hello" } : </span>${"hello"}<br/>
<span>${'${'}null} : </span>${null}<br/>
<span>${'${'}""} : </span>${""}<br/>
<hr/>
<%-- <%pageContext.setAttribute("username", "zhangsan") ;%> --%>
<%application.setAttribute("username", "lisi") ;%>
<span>${'${'} pageScope.username } : </span>${pageScope.username}<br/>
<span>${'${'} username } : </span>${username}<br/>
<span>${'${'} 'username' } : </span>${'username'}<br/>
<span>${'${'} applicationScope.username } : </span>${applicationScope.username}<br/>
<hr/>
<span>${'${'} param.count+20} : </span>${param.count+20}<br/>
<span>${'${'} param.str+1} : </span>${param.str+1}<br/>
<span>${'${'}empty param.count} : </span>${empty param.count}<br/>
<span>${'${'}empty ''} : </span>${empty ''}<br/>
<%--在地址栏给变量count str分别传参数（？count=10&atr=100）便可改变变量值，从而完成表达式语言的计算 --%>
<hr/>
<span>${'${'} param.month==7 and param.day==14} : </span>${param.month==7 and param.day==14}<br/>
<hr/>
<p>与输入有关的隐含对象：</p>
<span>${'${'}""} : </span>${""}<br/>
<span>${'${'} param.name} : </span>${param.name}<br/>
<span>${'${'} paramValues.name} : </span>${paramValues.name}<br/>
<hr/>
<%
Cookie c1=new Cookie("username","老王");
Cookie c2 =new Cookie("userphone","123456");
%>
${c1.username}
${Cookie.username }
${header['User-Agent']}
<br/><hr/>
<span>${'${'}""} : </span>${""}<br/>
<span>${'${'} pageContext.request.queryString} : </span>${ pageContext.request.queryString }<br/>
<span>${'${'} pageContext.request.requestURI} : </span>${ pageContext.request.requestURI }<br/>
<span>${'${'} pageContext.request.contextPath} : </span>${ pageContext.request.contextPath }<br/>
<span>${'${'} pageContext.request.method} : </span>${ pageContext.request.method }<br/>
<span>${'${'} pageContext.request.protocol} : </span>${ pageContext.request.protocol }<br/>
<span>${'${'} pageContext.request.remoteUser} : </span>${ pageContext.request.remoteUser }<br/>
<span>${'${'} pageContext.request.remoteAddr} : </span>${ pageContext.request.remoteAddr }<br/>
<span>${'${'} pageContext.session.id} : </span>${ pageContext.session.id }<br/>
<span>${'${'} pageContext.servletContext.serverInfo} : </span>${ pageContext.servletContext.serverInfo }<br/>
















</body>
</html>