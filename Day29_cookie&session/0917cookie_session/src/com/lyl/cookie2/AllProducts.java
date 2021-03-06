package com.lyl.cookie2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
			//点击进入手机详情页
			out.print(phoneName.getName()+"<a href='OneProduct?id="+i+"'>点击手机详情</a><br>");
		}
		
		out.print("<br><br><br><br><br><br><hr>最近浏览的三个商品信息如下：<br>");
		
		//打印最近浏览的3个页面信息
		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				if ("phoneList".equals(cookie.getName())) {
					
					String values = cookie.getValue();
					String[] ids = values.split("-");
					
					for (int i =0;i<ids.length;i++) {
						
						Cellphone phone = allPhones.get(ids[i]);
						out.write( phone.toString()+"<br>");
					}
				}
			}
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
