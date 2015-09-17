package com.lyl.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneProduct2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//��ȡĳ���ֻ��Ķ���
		String id = request.getParameter("id");
		Cellphone2 phone = PhoneDatabase2.getOnePhone(id);
		
//		out.print("<a href='AddToCar?id="+id+"'> ���빺�ﳵ</a><br>");
//		
//		out.print(phone.getName()+"�������£�<br>"+phone.toString()+"<br>");
//		out.print("<a href='AllProducts2'> ������ҳ</a>");
		
		//���������cookieʱ�����д��ַ���
		String urlString  = "AddToCart?id="+id;
		String url = response.encodeURL(urlString);
		out.write("<a href='"+url+"'>���뵽���ﳵ</a>");
		
		String backurl = "ShowAllProduct";
		String back =  response.encodeURL(backurl);
		out.write("<a href='"+ back +"'>������ҳ�������</a>");
	}



	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
