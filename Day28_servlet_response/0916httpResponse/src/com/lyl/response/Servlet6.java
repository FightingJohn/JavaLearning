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
		//�ض���ʽһ
//		response.setStatus(302);//��ʱ�ض���
//		//����ԡ�/����ͷ����ʾ����ڵ�ǰ��������·����URL
//		response.setHeader("Location", "/0916httpResponse/servlet/Servlet2");
		
		//�ض���2
		response.sendRedirect("/0916httpResponse/servlet/Servlet2");
		
		response.getWriter().write("��ã��й�");
		System.out.println("this is servlet6");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
