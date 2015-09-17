package com.lyl.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 
 * @author ľľ
 * ��ʾ���е���Ʒ
 */
public class AllProducts2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//�����ݿ��л�ȡ�����ֻ����ƴ�ӡ
		HashMap<String, Cellphone2> allPhones = PhoneDatabase2.getAllPhones();
		for(int i=1; i<=allPhones.size(); i++){
			Cellphone2 phoneName = allPhones.get(i+"");
			//��������ֻ�����ҳ
//			out.print(phoneName.getName()+"<a href='OneProduct2?id="+i+"'>����ֻ�����</a><br>");
			String backurl = "ShowOneProduct?id="+i;
			String back =  response.encodeURL(backurl);
		 out.write(phoneName.getName()+"<a href='"+back+"'> ����鿴����</a><br>");
		}
		
		out.print("<br><br><br><br><br><br><hr>��������������Ʒ��Ϣ���£�<br>");
		
		//��session���ó����빺�ﳵ�ֵ��ֻ���Ϣ
		HttpSession session = request.getSession();
		
		ArrayList<Cellphone2> productList = (ArrayList<Cellphone2>) session.getAttribute("car");
		if(productList != null){
			for(int i=0; i<productList.size(); i++){
				Cellphone2 phone = productList.get(i);
				out.print(phone.toString()+"<br>");
			}
		}
		
	
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
