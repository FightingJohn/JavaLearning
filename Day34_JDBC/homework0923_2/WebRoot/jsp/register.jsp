<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1 align="center">注册页面</h1><br><hr>
      	<form name="loginView" action="/homework0923_2/servlet/Homework4" method="post">
		<p>

			<label for="textfield">用户名</label> <br> <input type="text"
				name="username" id="textfield">

		</p>

		<p>

			<label for="textfield2">密码</label> <br> <input type="password"
				name="password" id="textfield2">

		</p>

		<p>

			<input type="submit" name="Submit" value="确认">

		</p>

		<p>&nbsp;</p>

	</form>
  </body>
</html>
