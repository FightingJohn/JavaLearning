package com.lyl.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().write("׼����ת����һ��ҳ��");
		
		response.setHeader("Refresh", "2;url='../index.jsp'");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}