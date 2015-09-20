package com.lyl.homework1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homework1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//获得提交的用户名和email
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		//获得登录时的时间
		Date date = new Date();
		
		
		//将本用户的登录名和email以及登录时间保存到cookie中，用：作为分隔符
		Cookie cookie = new Cookie("usercookie", username+":"+email+":"+date.toString());
		//设置cookie的保存时间为30天,共享范围为整个服务器
		cookie.setMaxAge(60*60*24*30);
		cookie.setPath("/");
		response.addCookie(cookie);
//		System.out.println("servlet is over");//断点测试
		
		//获得请求中的cookie
		Cookie[] cookies = request.getCookies();
		
		//把判断结果（是同一个用转发yes，否则为no）转发到Login.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("../jsp/Login.jsp");
		if(cookies != null){
//			System.out.println("cookies 不为空");
			for(int i=0; i<cookies.length; i++){
				if("usercookie".equals(cookies[i].getName())){
//					System.out.println("找到了usercookie");
					//从cookie中获得usercookie-username:email:date.tostring
					String usercookie = cookies[i].getValue();
					//分割username，email，date
					String[] strs = usercookie.split(":");

					//判断是否为同一个用户登录
					if(username.equals(strs[0]) && email.equals(strs[1])){
						request.setAttribute("result", "yes:"+strs[2]);
//						System.out.println("同一个用户登录");//断点测试
						break;
					}else{
						request.setAttribute("result", "no");
//						System.out.println("不同用户登录");//断点测试
						break;
					}
					
				}
			}
		}else{
			request.setAttribute("result", "no");		
//			System.out.println("不同用户登录");				//断点测试
		}
		dispatcher.forward(request, response);
		
		
	}

}
