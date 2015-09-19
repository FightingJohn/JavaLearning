<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Download.jsp' starting page</title>
    
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
    <h1 align="center">下载页面</h1><br>
    
    <form action="/homework0919_fileUpload/servlet/Servlet" method="post">
   		 文件名：<input type="text" name="textfile"></input>
   		 <input type="submit" value="下载"></input>
   		 <br><br>
    </form>
    
    <form action="/homework0919_fileUpload/servlet/Servlet2" method="post">
   		 图片名：<input type="text" name="picture"></input>
   		 <input type="submit" value="下载"></input>
   		 <br><br>
    </form>
    
    <form action="/homework0919_fileUpload/servlet/Servlet3" method="post">
   		 音乐名：<input type="text" name="music"></input>
   		 <input type="submit" value="下载"></input>
   		 <br><br>
    </form>
    
  </body>
</html>
