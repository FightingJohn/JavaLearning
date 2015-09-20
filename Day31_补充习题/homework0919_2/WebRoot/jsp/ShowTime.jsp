<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ShowTime.jsp' starting page</title>
    
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
  
         <p align="center">
         
         	<font color="blue" size="10">session时间与编号</font>
         
         </p><hr>
         
         <p>
         	session的编号：<p align="center">
         	<font color="red">
         	<% out.print(session.getId()); %>
         	 </font></p>
         </p>
         
          <p>
         	session建立时间：<p align="center">
         	<font color="red">
         	<% out.print(new Date(session.getCreationTime())); %> 
         	</font></p>
         </p>
         
          <p>
         	最近使用session时间：<p align="center">
         	<font color="red">
         	<% out.print(new Date(session.getLastAccessedTime())); %>
         	</font></p>
         </p>
  </body>
</html>
