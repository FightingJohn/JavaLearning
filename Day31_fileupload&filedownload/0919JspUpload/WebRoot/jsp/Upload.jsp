<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Upload.jsp' starting page</title>
    
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
    <!-- <input type="file">标签中必须注意：
    1，必须设置input输入项的name属性
    2，必须把form的enctype属性设为multipart/form-data
    3，表单提交方式要是post -->
    
    <form action="/0919JspUpload/servlet/UploadFile" method="post"
    encType="multipart/form-data">
    	
    	登录名：<input type="text" name="username"></input><br><br>
    	&nbsp;&nbsp;&nbsp;&nbsp;密码：<input type="text" name="password"></input><br><br>
    	
    	上传文件：<input type="file" name="file"></input>
    	<input type="submit" value="提交"></input>
    
    </form>
  </body>
</html>
