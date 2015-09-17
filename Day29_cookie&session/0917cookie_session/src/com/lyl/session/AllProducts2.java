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
 * @author 木木
 * 显示所有的商品
 */
public class AllProducts2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//从数据库中获取所有手机名称打印
		HashMap<String, Cellphone2> allPhones = PhoneDatabase2.getAllPhones();
		for(int i=1; i<=allPhones.size(); i++){
			Cellphone2 phoneName = allPhones.get(i+"");
			//点击进入手机详情页
//			out.print(phoneName.getName()+"<a href='OneProduct2?id="+i+"'>点击手机详情</a><br>");
			String backurl = "ShowOneProduct?id="+i;
			String back =  response.encodeURL(backurl);
		 out.write(phoneName.getName()+"<a href='"+back+"'> 点击查看详情</a><br>");
		}
		
		out.print("<br><br><br><br><br><br><hr>最近浏览的三个商品信息如下：<br>");
		
		//从session中拿出加入购物车种的手机信息
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
