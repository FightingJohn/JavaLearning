<%@ page language="java" pageEncoding="UTF-8"%>

<%@ page contentType="text/html;charset=GB2312"%>

<%@ page import="java.util.Date,java.util.List,java.util.ArrayList" %>

<%@ page info="测试info" %>

<%@ include file="SecondJsp.jsp" %>

<%@ page errorPage="../jsp/ErrorJsp.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Hello.jsp' starting page</title>
    
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
    This is my first JSP page. <br>
    
    <%-- 这是定义在Servlet内的jspService方法中 --%>
    <%
    	Date date = new Date();
    	out.print("now is "+date.toString());
     %><br><br>
     
     <%-- 这是定义在Servlet内的jspService方法中 --%>
     <%!
     	static{
     		System.out.println("I am in static");
     	}
     	
     	private int i = 1;
     	
     	
      %>
      
      <%= getServletInfo() %><br><br>
      
      <%= "测试%!中的全局变量"+i %>
      
     <% 
     int num = 0;
     int result = 10 / num;
      %>
  </body>
</html>
