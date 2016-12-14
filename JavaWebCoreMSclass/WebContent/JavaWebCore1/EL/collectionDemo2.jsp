<%@page import="org.apache.taglibs.standard.lang.jstl.Literal"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.Set"%>
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
    all.add("aaf");
    
    request.setAttribute("list", all);
    
    %>
 <p>List集合只能通过索引来获取值 ，list允许重复值，</p>
 <span> ${'${'} list} </span>${list}  <br/>  
 <span> ${'${'} list[0]} </span>${list[0]} <br/>    
 <span> ${'${'} list[1]} </span>${list[1]} <br/>   
 <span> ${'${'} list(3)} </span>${list.get(3)}  <br/>  
    
    <%
    Map map1=new HashMap();
    map1.put("info11", "AA11");
    map1.put("info22", "AA22");
    map1.put("info33", "AA33");
    request.setAttribute("map", map1);
    
    %>
          <p>map集合只能通过键值对来获取值 </p>
 <span> ${'${'} map['info11']} </span>${map['info11']}  <br/>  
 <span> ${'${'} map.info22} </span>${map.info22} <br/>  
 <span> ${'${'} map.get('info33')} </span>${map.get('info33')}  <br/>  
    <hr/>
    <%
      Set set=new TreeSet();
      set.add("zhang");
      set.add("wang");
      set.add("li");
      set.add("zhao");
      set.add("zhao");
    pageContext.setAttribute("set", set);
    %>
          <p>set只能直接调用数组来取的数组值 ，set无序，不予许重复值 </p>
      <span>${'${'}set} : </span>${set};<br/><hr/>
    
    <%
       List list=new ArrayList();
       list.add("1");
       list.add("1");
       list.add("2");
       list.add("3");
    application.setAttribute("list1", list);
    %>
      <span>${'${'}list1} : </span>${list1};<br/>
      <span>${'${'}list1[1]} : </span>${list1[1]};<br/>
      <span>${'${'}list1[2]} : </span>${list1[2]};<br/>
      <span>${'${'}list.get1(3)} : </span>${list1.get(3)};<br/><hr/>
    <%
      Map map=new HashMap();
      map.put("A", "111");
      map.put("B", "222");
      map.put("C", "333");
      map.put("D", "444");
      
      session.setAttribute("mapp", map);
      %> 
      <span>${'${'}mapp} : </span>${mapp};<br/>
      <span>${'${'}mapp['A']} : </span>${mapp['A']};<br/>
      <span>${'${'}mapp.B} : </span>${mapp.B};<br/>
      <span>${'${'}mapp.get(C)} : </span>${mapp.get('C')};<br/>
       
    
    
    
</body>
</html>