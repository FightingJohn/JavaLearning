package com.lyl.cookie2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneProduct extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//获取某个手机的对象
		String id = request.getParameter("id");
		Cellphone phone = PhoneDatabase.getOnePhone(id);
		
		out.print(phone.getName()+"详情如下：<br>"+phone.toString()+"<br>");
		out.print("<a href='AllProducts'> 返回首页</a>");
		
		//最近（3个）浏览手机详情页的编号序列，如 1-2-3
		String list =  getList(request, id);
		
		//把list写入cookie中，用phoneList作为标记
		Cookie browseList = new Cookie("phoneList", list);
		browseList.setMaxAge(60*60);
		response.addCookie(browseList);

	}

	private String getList(HttpServletRequest request, String id) {
		
		Cookie[] cookies = request.getCookies();
		Cookie phoneCookie = null;				//包含手机id的cookie
		
		if(cookies == null)
			return id;
		else{
			for (Cookie cookie : cookies) {
				if("phoneList".equals(cookie.getName())){
					phoneCookie = cookie;
				}
			}
		}
		
		//首次访问某个手机详情页，直接返回id
		if(phoneCookie == null)
			return id;
		
		//获得cookie中的值
		String values = phoneCookie.getValue();
		
		//以“-”进行分割,获得之前访问的所有id
		String[] ids = values.split("-");
		
		LinkedList<String> queue = new LinkedList<String>(Arrays.asList(ids));
		//当之前访问的手机详情页数在3个以内时
		if(queue.size() < 3){
			//此时访问的页面之前访问过，则删除原来存入的id,在加入此id
			if(queue.contains(id))
				queue.remove(id);
			queue.add(id);		
		}else{
			//访问页面大于3时；如果此页面id含在存入的ids中，则删除id，如果没有，删除队列第一个元素，然后存入id
			if(queue.contains(id))
				queue.remove(id);
			else
				queue.removeFirst();
			queue.add(id);
		}
		
		//返回形如 1-2-3的字符串
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<queue.size(); i++){
			
			String data = queue.get(i);
			if(i != 0)
				sb.append("-");
			sb.append(data);
		}
		
		return sb.toString();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
