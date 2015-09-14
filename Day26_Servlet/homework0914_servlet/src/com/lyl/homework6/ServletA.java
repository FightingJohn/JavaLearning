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

		//���ServletConfig����
		ServletConfig scf = getServletConfig();
		//���ServletContext����
		ServletContext sct = scf.getServletContext();
		//���context����param������studentID��ֵ
		String studentId = sct.getInitParameter("studentID");
		System.out.println("ServletA   studentId = "+ studentId);
		//���studentName���ԣ�ֵΪ lyl
		sct.setAttribute("studentName", "lyl");
		
		response.getWriter().write("this is ServletAAAA");
		
		//ת����ServletB
		RequestDispatcher rdp = sct.getRequestDispatcher("/servlet/ServletB");
		//�ѱ�servlet����Ӧ���responseһ��ת����servletB
		rdp.include(request, response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
