package com.lyl.homework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homework3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		String username = request.getParameter("username");
		
		//加上下面两句在重定向哪里得到的会是乱码
//		byte[] b = user.getBytes("iso-8859-1");				
//		String username = new String(b, "utf-8");
		String password = request.getParameter("password");
		
		String info ="?"+"username=" +username+"&password="+password;
	
		
		response.sendRedirect("/homework0916_response/servlet/HomeWork3_Redirect"+info);
		System.out.println(info);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
