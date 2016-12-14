<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基础运算</title>
</head>
<body>
<p>基础运算</p>
<span> ${'${'}7 + 5 }: </span>$ {7+5}<br/>
<span> ${'${'}7 - 5 }: </span>${7-5}<br/>
<span> ${'${'}7 * 5 }: </span>${7*5}<br/>
<span> ${'${'}7 / 5 }: </span>${7/5}<br/>
<%-- <span> ${'${'}7 div 5 }: </span>${7 div 5}<br/> --%>
<span> ${'${'}7 + 5 }: </span>${7%5}<br/>
<span> ${'${'}7 mod 5 }: </span>${7 mod 5}<br/>
<hr/>
<p>逻辑运算</p>
<span> ${'${'}true and false }: </span>${true and false}<br/>
<span> ${'${'}true && false }: </span>${true && false}<br/>
<span> ${'${'}true or false }: </span>${true or false}<br/>
<span> ${'${'}true || false }: </span>${true || false}<br/>
<span> ${'${'}not false }: </span>${not false}<br/>
<span> ${'${'}! false }: </span>${! false}<br/>
<hr/>
<p>关系运算</p>
<span> ${'${'}7 > 5 }: </span>${7 > 5}<br/>
<span> ${'${'}7 gt 5 }: </span>${7 gt 5}<br/>
<span> ${'${'}7 &gt; 5 }: </span>${7 gt 5}<br/>
<span> ${'${'}7 < 5 }: </span>${7 < 5}<br/>
<span> ${'${'}7 &lt; 5 }: </span>${7 lt 5}<br/>
<span> ${'${'}7 == 5 }: </span>${7 == 5}<br/>
<span> ${'${'}7 &eq; 5 }: </span>${7 eq 5}<br/>
<span> ${'${'}7 != 5 }: </span>${7 != 5}<br/>
<%-- <span> ${'${'}7 &ne; 5 }: </span>${7 ne 5}<br/> --%>
<span> ${'${'}7 >= 5 }: </span>${7 >= 5}<br/>
<span> ${'${'}7 &ge; 5 }: </span>${7 ge 5}<br/>
<span> ${'${'}7 <= 5 }: </span>${7 <= 5}<br/>
<span> ${'${'}7 &le; 5 }: </span>${7 le 5}<br/>
<hr/>
<p>三目运算：</p>
<span>${'${'}5>3?true:false } :</span>${5>3?true:false }<br/>
<span>${'${'}5==3?true:false } :</span>${5==3?true:false }<br/>
<span>${'${'}5<3?true:false } :</span>${5<3?true:false }<br/>



</body>
</html>