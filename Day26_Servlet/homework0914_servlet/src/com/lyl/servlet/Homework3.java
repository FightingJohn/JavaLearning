package com.lyl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homework3 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.getWriter().write("hello, homework3");
	}


	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		
		System.out.println("this is service()");
		super.service(arg0, arg1);
	}



	public void destroy() {
		
		System.out.println("this is destory()");
		super.destroy();
	}


	
	public void init() throws ServletException {
		
		System.out.println("this is init()");
		super.init();
	}

}
