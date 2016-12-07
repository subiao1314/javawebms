<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在静态文本中通过EL进行计算</title>
</head>
<% pageContext.setAttribute("color", "red"); %>

<body bgcolor=%{pageScope['color']}>
  <ul>
  <li>10+5=${10+5}</li>  
  <li>10-5=${10-5}</li>  
  <li>10*5=${10*5}</li>  
  <li>10/5=${10/5}</li>  
  <li>10%5=${10%5}</li>  
  <li> true add false=${true &&false}</li> 
  <li> true ||false=${true||false}   </li> 
  <li> 5>6=${5>6}  </li> 
  <li>  5==6=${5==6} </li> 
  </ul>
   <br/><hr/>
   <h2>EL Logic</h2>
  <table  border="1px" style="border-collapse:collapse;">
  <tr>
  <td>逻辑运算</td>
  <td>EL 表达式</td>
  <td>Result</td>
  </tr>
  <tr>
  <td>与</td>
  <td>${'${'}true and false}</td>
  <td>${true and false}</td>
  </tr>
  <tr>
  <td>与</td>
  <td>${'${'}true && false}</td>
  <td>${true && false}</td>
  </tr>
  <tr>
  <td>或</td>
  <td>${'${'}true or false}</td>
  <td>${true or false}</td>
  </tr>
  <tr>
  <td>或</td>
  <td>${'${'}true || false}</td>
  <td>${true || false}</td>
  </tr>
  <tr>
  <td>非</td>
  <td>${'${'} not false}</td>
  <td>${ not false}</td>
  </tr>
    <tr>
  <td>非</td>
  <td>${'${'} ! true}</td>
  <td>${! true}</td>
  </tr>
  </table>
<br/><hr/>
     
  
  
  

</body>
</html>