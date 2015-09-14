package com.lyl.homework6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletB extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().write("this is ServletBBBB");
		//���ServletConfig����
		ServletConfig scf = getServletConfig();
		//���ServletContext����
		ServletContext sct = scf.getServletContext();
		//���context����param������studentID��ֵ���Լ�����studentName��ֵ
		String studentId = sct.getInitParameter("studentID");
		String studentName = (String) sct.getAttribute("studentName");
		System.out.println("ServletB   studentId = "+ studentId + "studentName = " + studentName);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
