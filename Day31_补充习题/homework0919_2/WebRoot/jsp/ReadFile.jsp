<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%@ page import="java.io.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ReadFile.jsp' starting page</title>
    
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
  		<%
  			FileInputStream fis = null;
  			char b = '\0';				//记录第n个字符
  			try{
  				//通过相对路径，获得绝对路径
  				String filepath = "\\file\\file.txt";
  				String realpath = getServletContext().getRealPath(filepath);
  				fis = new FileInputStream(realpath);
  				}catch(Exception e){
  					e.printStackTrace();
  				}
  		 %>
        <p align="center">
         
         	<font color="blue" size="6">读取文件中的字符</font>
         
        </p><hr> 
        
        <p>
        	文件前10个字节为："
        	<font color="red">
        		<% 
        			for(int i=0; i<10; i++){
        				char letter = (char)fis.read();
        				out.print(letter);
        				if(i==3)
        					b = letter;
        			}
        		 %>
        	</font>"
        </p>
        
        <p>
        	第 4个字节为："
        	<font color="red">
        		<% out.print(b); %>
        	</font>"
        </p>
        
        <%
        	if(fis != null)
        		try{
        			fis.close();
        			}catch(Exception e){
        				e.printStackTrace();
        			}
        %>
  </body>
</html>
