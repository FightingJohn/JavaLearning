package com.lyl.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowLoginTime extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//�������������ʾ����
		response.setContentType("text/html; charset=utf-8");
		//�����Ӧ���ĵ������
		PrintWriter out = response.getWriter();
		out.println("���ϴε�½��ʱ��Ϊ��");
		//ȡ�����һ�εĵ�¼ʱ�䣬cookieNameΪlastTime
		Cookie[] cookies = request.getCookies();
		for(int i = 0; cookies != null&&i < cookies.length; i++){
			
			if("lastTime".equals(cookies[i].getName())){
				//��ȡ��ʱcookie��ֵ
				long time = Long.parseLong(cookies[i].getValue());
				Date date = new Date(time);
				out.println(date.toString());
			}
		}
		
		//��¼���εķ��ʵ�ʱ��
		Cookie cookie = new Cookie("lastTime", System.currentTimeMillis()+"");
		//����cookie����Ч��,һ��Сʱ. �����˵��cookie������ʱ�䣬��������˳�ʱ��cookie���
		cookie.setMaxAge(60*60);
		//����cookie����ķ�Χ��/��ʾ����������
		cookie.setPath("/");
		response.addCookie(cookie);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
