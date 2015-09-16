package com.lyl.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		//重定向方式一
//		response.setStatus(302);//临时重定向
//		//如果以“/”开头，表示相对于当前服务器根路径的URL
//		response.setHeader("Location", "/0916httpResponse/servlet/Servlet2");
		
		//重定向2
		response.sendRedirect("/0916httpResponse/servlet/Servlet2");
		
		response.getWriter().write("你好，中国");
		System.out.println("this is servlet6");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
