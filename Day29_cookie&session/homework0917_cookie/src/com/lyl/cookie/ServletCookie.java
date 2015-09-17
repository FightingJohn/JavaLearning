package com.lyl.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		

		String userIfo = username +":"+password;
		//以user为标识放入cookie中
		Cookie cookie = new Cookie("user", userIfo);
		cookie.setMaxAge(60*60);
		cookie.setPath("/");
		response.addCookie(cookie);
		response.getWriter().print("登录成功！");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
