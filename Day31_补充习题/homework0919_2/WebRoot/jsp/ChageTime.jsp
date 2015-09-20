<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ChageTime.jsp' starting page</title>
    
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
         
         	<font color="blue" size="6">session有效时间的设置与取得</font>
         
         </p><hr>
         
         <p>
         	session的有效时间：
         	<font color="red">
         	<% out.print(session.getMaxInactiveInterval()); %>
         	 </font>
         </p>
         <%--设置session的有效时间 --%>
         <%session.setMaxInactiveInterval(2000); %>
          <p>
         	更改后，session的有效时间：
         	<font color="red">
         	<% out.print(session.getMaxInactiveInterval()); %> 
         	</font>
         </p>
         
  </body>
</html>
