package com.lyl.homework6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//获得ServletConfig对象
		ServletConfig scf = getServletConfig();
		//获得ServletContext对象
		ServletContext sct = scf.getServletContext();
		//获得context——param的属性studentID的值
		String studentId = sct.getInitParameter("studentID");
		System.out.println("ServletA   studentId = "+ studentId);
		//添加studentName属性，值为 lyl
		sct.setAttribute("studentName", "lyl");
		
		response.getWriter().write("this is ServletAAAA");
		
		//转发给ServletB
		RequestDispatcher rdp = sct.getRequestDispatcher("/servlet/ServletB");
		//把本servlet的响应结果response一起转发给servletB
		rdp.include(request, response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
