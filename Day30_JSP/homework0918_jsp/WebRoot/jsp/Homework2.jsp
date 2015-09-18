<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Homework2.jsp' starting page</title>
    
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
     <br>
     <%--打印11行的菱形 --%>
    <%
		int rowSum = 11;
		int begin = rowSum / 2 + 1;

		out.print("菱形：");
	%>
		<br>
	<%
		for(int i = 1;i <= rowSum;i++){
			if(i <= begin){
				for(int k = 1;k <= begin - i;k++){
					out.print("&nbsp");
				}
				for(int k = 1;k <= i;k++){
					out.print("*");
				}
	%>
		<br>  
	<%
		
			}else{
				for(int k =1;k <= (i - begin);k++){
					out.print("&nbsp");
				}
				for(int k = 1;k <= (2 * begin - i);k++){
					out.print("*" );
				}
	%>
		<br>
	<%
			}	
		}
		
     %>
  </body>
</html>
