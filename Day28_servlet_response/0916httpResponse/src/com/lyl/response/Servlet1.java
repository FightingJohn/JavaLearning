package com.lyl.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//����һ�ֶ���ζutf-8
		//������
//		response.setHeader("Content-Type", "text/html; charset=utf-8");
		
		//������
//		String str = "<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />";
		
		
//		response.getOutputStream().write("���ѽ".getBytes());//Ĭ�ϱ��ر���GBK
//		response.getOutputStream().write(str.getBytes());
//		response.getOutputStream().write("�Ǻ�".getBytes("utf-8"));
		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().print("��ã�����");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
