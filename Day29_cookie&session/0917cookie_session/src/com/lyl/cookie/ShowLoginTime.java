package com.lyl.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowLoginTime extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//设置浏览器的显示编码
		response.setContentType("text/html; charset=utf-8");
		//获得响应报文的输出流
		PrintWriter out = response.getWriter();
		out.println("你上次登陆的时间为：");
		//取出最后一次的登录时间，cookieName为lastTime
		Cookie[] cookies = request.getCookies();
		for(int i = 0; cookies != null&&i < cookies.length; i++){
			
			if("lastTime".equals(cookies[i].getName())){
				//获取此时cookie的值
				long time = Long.parseLong(cookies[i].getValue());
				Date date = new Date(time);
				out.println(date.toString());
			}
		}
		
		//记录本次的访问的时间
		Cookie cookie = new Cookie("lastTime", System.currentTimeMillis()+"");
		//设置cookie的有效期,一个小时. 如果不说明cookie的生存时间，则浏览器退出时，cookie清空
		cookie.setMaxAge(60*60);
		//设置cookie共享的范围，/表示整个服务器
		cookie.setPath("/");
		response.addCookie(cookie);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
