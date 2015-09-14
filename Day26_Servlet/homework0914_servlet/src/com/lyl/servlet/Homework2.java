package com.lyl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * �ֶ�ʵ��һ��servlet��Ҫ���û�ȥ�������servlet��ʱ��
 * userÿ����browserˢ�¶����Կ�����������ǰ��ʱ��*/
public class Homework2 extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��õ�ǰʱ��
		Date date = new Date();
		//��ʽ����ǰ��ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formatDate = sdf.format(date);
		//�Ѹ�ʽ���ĵ�ǰʱ��д����Ӧ���ĵ��������
		response.getWriter().write(formatDate);
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

}
