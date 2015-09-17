package com.lyl.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//设置浏览器的显示编码
		response.setContentType("text/html; charset=utf-8");
		//获得响应报文的输出流
		PrintWriter out = response.getWriter();
		//从请求报文中获取cookie
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++){
				
				if("user".equals(cookies[i].getName())){
					//获取此时cookie的值
					if(cookies[i].getValue() != null)
						out.print("再次登录成功");
					else
						response.sendRedirect("../html/login.html");
				}
				else{
					//重定向到登录界面
					response.sendRedirect("../html/login.html");
				}
			}
		}else{
			//重定向到登录界面
			response.sendRedirect("../html/login.html");
		}
			

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
