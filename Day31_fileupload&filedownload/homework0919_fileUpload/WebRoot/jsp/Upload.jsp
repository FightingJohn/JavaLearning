<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    
    <form action="/homework0919_fileUpload/servlet/Homework4" method="post"
    encType="multipart/form-data">
    
    	上传文件1：<input type="file" name="file"></input>
    	 <br><br>
    	上传文件2：<input type="file" name="file"></input>
    	 <br><br>
    	上传文件3：<input type="file" name="file"></input>
    	 <br><br>
    	上传文件4：<input type="file" name="file"></input>
    	 <br><br>
    	上传文件5：<input type="file" name="file"></input>
    	 <br><br>
    	 <input type="submit" value="同时提交"></input>
    	 
    </form>
  </body>
</html>
