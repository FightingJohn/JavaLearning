package com.lyl.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//�������������ʾ����
		response.setContentType("text/html; charset=utf-8");
		//�����Ӧ���ĵ������
		PrintWriter out = response.getWriter();
		//���������л�ȡcookie
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++){
				
				if("user".equals(cookies[i].getName())){
					//��ȡ��ʱcookie��ֵ
					if(cookies[i].getValue() != null)
						out.print("�ٴε�¼�ɹ�");
					else
						response.sendRedirect("../html/login.html");
				}
				else{
					//�ض��򵽵�¼����
					response.sendRedirect("../html/login.html");
				}
			}
		}else{
			//�ض��򵽵�¼����
			response.sendRedirect("../html/login.html");
		}
			

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
