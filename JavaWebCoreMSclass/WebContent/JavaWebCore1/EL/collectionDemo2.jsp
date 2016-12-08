<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证EL进行集合取值</title>
</head>
<body>
  <%
   List all=new ArrayList();
    all.add("aab");
    all.add("aac");
    all.add("aad");
    all.add("aaf");
    
    request.setAttribute("list", all);
    
    %>
 <span> ${'${'} list} </span>${list}  <br/>  
 <span> ${'${'} list[0]} </span>${list[0]} <br/>    
 <span> ${'${'} list[1]} </span>${list[1]} <br/>   
 <span> ${'${'} list(3)} </span>${list.get(3)}  <br/>  
 <p>List集合只能通过索引来获取值 </p>
    
    <%
    Map map1=new HashMap();
    map1.put("info11", "AA11");
    map1.put("info22", "AA22");
    map1.put("info33", "AA33");
    request.setAttribute("map", map1);
    
    %>
 <span> ${'${'} map['info11']} </span>${map['info11']}  <br/>  
 <span> ${'${'} map.info22} </span>${map.info22} <br/>  
 <span> ${'${'} map.get('info33')} </span>${map.get('info33')}  <br/>  
          <p>List集合只能通过索引来获取值 </p>
    
    
    
    
</body>
</html>