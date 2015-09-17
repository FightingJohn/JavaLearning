package com.lyl.cookie2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author 木木
 * 显示所有的商品
 */
public class AllProducts extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//从数据库中获取所有手机名称打印
		HashMap<String, Cellphone> allPhones = PhoneDatabase.getAllPhones();
		for(int i=1; i<=allPhones.size(); i++){
			Cellphone phoneName = allPhones.get(i+"");
			out.print(phoneName.getName()+"<br>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
