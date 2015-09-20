<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ page import="java.io.File" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'GetFiles.jsp' starting page</title>
    
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
  
          <%--获得某个指定文件夹下的所有文件目录 --%>
         <%
         	File file = new File("D:\\MyEclipse Project\\firstWeb");
         	String[] fileList = file.list();	
          %>
          
    	 <p align="center">
         
         	<font color="blue" size="6">取得目录中的文件</font>
         
         </p><hr> 
         <p>
         	在
         	<font color="red">
         	<% out.print(file.getAbsolutePath()); %>
         	 </font>目录下的文件有<br><br>
         	 <%
         	 	for(int i=0; i<fileList.length; i++){
         	 %>
         	 
         	 <% out.print(fileList[i]); %><br>
         	 
         	 <%
         	 	}
         	  %>
         </p>
        
         
  </body>
</html>
