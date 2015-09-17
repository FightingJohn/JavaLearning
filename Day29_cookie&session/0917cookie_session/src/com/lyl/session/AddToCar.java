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
		
		//通过session获取购物车种的商品
		HttpSession session = request.getSession();
		ArrayList<Cellphone2>list =(ArrayList<Cellphone2>) session.getAttribute("car");
		//如果之前没有添加商品，则新建list容器
		if (list==null) {
			list = new ArrayList<Cellphone2>();
		}
		
		//把商品加入购物车中
		String id = request.getParameter("id");
		list.add(PhoneDatabase2.getOnePhone(id));
		session.setAttribute("car", list);
		
	//	out.print("<a href='AllProducts2'> 返回首页</a>");
		
		//浏览器禁用cookie时，才有此种方法
		String backurl = "ShowAllProduct";
		String back =  response.encodeURL(backurl);
		out.write("<a href='"+back+"'>回到首页</a>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
