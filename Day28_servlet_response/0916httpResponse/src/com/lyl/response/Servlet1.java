package com.lyl.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//方法一手动调味utf-8
		//方法二
//		response.setHeader("Content-Type", "text/html; charset=utf-8");
		
		//方法三
//		String str = "<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />";
		
		
//		response.getOutputStream().write("你好呀".getBytes());//默认本地编码GBK
//		response.getOutputStream().write(str.getBytes());
//		response.getOutputStream().write("呵呵".getBytes("utf-8"));
		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().print("你好，世界");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
