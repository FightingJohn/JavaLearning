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
		
		//获取某个手机的对象
		String id = request.getParameter("id");
		Cellphone2 phone = PhoneDatabase2.getOnePhone(id);
		
//		out.print("<a href='AddToCar?id="+id+"'> 加入购物车</a><br>");
//		
//		out.print(phone.getName()+"详情如下：<br>"+phone.toString()+"<br>");
//		out.print("<a href='AllProducts2'> 返回首页</a>");
		
		//浏览器禁用cookie时，才有此种方法
		String urlString  = "AddToCart?id="+id;
		String url = response.encodeURL(urlString);
		out.write("<a href='"+url+"'>加入到购物车</a>");
		
		String backurl = "ShowAllProduct";
		String back =  response.encodeURL(backurl);
		out.write("<a href='"+ back +"'>返回首页继续浏览</a>");
	}



	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
