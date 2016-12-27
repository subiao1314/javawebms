<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.sub.javaweb.javabean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩表</title>
<script type="text/javascript" src=jquery.min.js></script>

<script type="text/javascript">
   function jump1() {
	   window.location.href="Add.jsp";
   }
   
 </script>
</head>
<body>

<h2><center>学生成绩表</center></h2>
<input type="submit" value="Add" onclick="jump1()"/>
<input type="submit" value="Update"/>
<input type="submit" value="Delete"/>
<input type="submit" value="Select"/>
<hr/>
<%   
 List<User> list=(List<User>)application.getAttribute("list");
%>
        <table border="1px soild black" style="border-collapse: collapse;" >
        <tr><th><th>姓名</th><th>班级</th><th>课程</th><th>分数</th></tr>
        <%for(int i=0;i<list.size();i++){
            User user=list.get(i);
            %>
            <tr>
            <td>
           <input type="checkbox" /> <!-- //设置复选框，方便后面选择和删除 -->
           </td>
            <td><%=user.getName() %></td>
            <td><%=user.getClas() %></td>
            <td><%=user.getCourse() %></td>
            <td><%=user.getScore() %></td>
            </tr>
        <% }%>

        </table>


</body>
</html>