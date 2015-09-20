<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Login.jsp' starting page</title>

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
		String result = (String)request.getAttribute("result");
		if(result != null){
			if("no".equals(result)){
				out.write("欢迎光临本站！");
			}else{
				String[] strs2 = result.split(":");
				String time = strs2[1];
				out.write("欢迎再度光临本站，你曾于"+time+"拜访过本站");
			}
		}
	 %>

	<form action="/homework0919_2/servlet/Homework1" method="post">
		<p>

			<label for="textfield">姓名：</label> <br> <input type="text"
				name="username">

		</p>

		<p>

			<label for="textfield2">E-Mail：</label> <br> <input type="text"
				name="email">

		</p>

		<p>

			<input type="submit" name="Submit" value="登录">

		</p>

		<p>&nbsp;</p>

	</form>


</body>
</html>
