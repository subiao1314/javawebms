<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加信息界面</title>
</head>
<body>
<h2>添加学生信息</h2>
<form action="../ListServlet" method="post">
<p>姓名:<input type="text" name="name"/>  </p>
<p>班级:<select name="clas">
      <option value="一年级">一年级</option>
      <option value="二年级">二年级</option>
      <option value="三年级">三年级</option>
      <option value="四年级">四年级</option>
      <option value="五年级">五年级</option>
      <option value="六年级">六年级</option>
</select>  </p>
<p>课程:<select name="course">
      <option value="语文">语文</option>
      <option value="数学">数学</option>
      <option value="英语">英语</option>
      <option value="美术">美术</option>
      <option value="音乐">音乐</option>
      <option value="体育">体育</option>
</select>  </p>
<p>成绩:<input type="text" name="score" />  </p>
<input type="submit"  value="添加"/>
</form>
</body>
</html>