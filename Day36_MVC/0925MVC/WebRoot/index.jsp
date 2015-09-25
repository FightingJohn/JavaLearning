<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <h1 align="center">王道主页</h1><hr>
    
    <%
		String username = 
			(String)pageContext.getAttribute("result",PageContext.SESSION_SCOPE);  
		if(username != null){
			 
     %>
     	欢迎你，<%=username %>!
     <a href="servlet/Contorller?type=logout">注销</a>
     <%
     }else{
      %>
    
    <a href="jsp/login.jsp">登录</a>
    <a href="jsp/register.jsp">注册</a>
    
    <%} %>
  </body>
</html>
