package com.lyl.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddToCar extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//ͨ��session��ȡ���ﳵ�ֵ���Ʒ
		HttpSession session = request.getSession();
		ArrayList<Cellphone2>list =(ArrayList<Cellphone2>) session.getAttribute("car");
		//���֮ǰû�������Ʒ�����½�list����
		if (list==null) {
			list = new ArrayList<Cellphone2>();
		}
		
		//����Ʒ���빺�ﳵ��
		String id = request.getParameter("id");
		list.add(PhoneDatabase2.getOnePhone(id));
		session.setAttribute("car", list);
		
	//	out.print("<a href='AllProducts2'> ������ҳ</a>");
		
		//���������cookieʱ�����д��ַ���
		String backurl = "ShowAllProduct";
		String back =  response.encodeURL(backurl);
		out.write("<a href='"+back+"'>�ص���ҳ</a>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
