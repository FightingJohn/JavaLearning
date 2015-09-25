package com.lyl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lyl.bean.User;
import com.lyl.dao.SaveDataInference;
import com.lyl.daoImpl.SaveToMysql;

public class Contorller extends HttpServlet {
	
	private SaveDataInference saveToXml = new SaveToMysql();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			 {
		response.setContentType("text/html; charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//获得jsp中携带的type值，判断是登录还是注册
		String type = request.getParameter("type");
		System.out.println(type);
		if("login".equals(type))
			doLogin(request, response);
		else if("register".equals(type))
			doRegister(request, response);
		else if("logout".equals(type))
			doLogout(request, response);
		
		
	}

	//注销处理
	private void doLogout(HttpServletRequest request,
			HttpServletResponse response) {
		
		// 删除session中的username，并设置session无效
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("this doLogout");
		HttpSession hs = request.getSession();
		hs.removeAttribute("result");
		hs.invalidate();					//设置session无效
		out.write("注销成功，即将回到主页");
		response.setHeader("refresh", "1;url=/0925MVC/index.jsp");
		
	}

	//登录处理
	private void doLogin(HttpServletRequest request,
			HttpServletResponse response) {
		
		PrintWriter out = null;
		response.setContentType("text/html; charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
			out = response.getWriter();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//登录成功
		if(saveToXml.findUser(username, password)){
			
			//登录成功时，向session中写入登录的username
			HttpSession hs = request.getSession();
			hs.setAttribute("result", username);
			
			out.write("恭喜你，登录成功，即将跳到主页");
			response.setHeader("refresh", "1;url=/0925MVC/index.jsp");
		}else{
			out.write("用户名或密码不正确请重新登录");
			 response.setHeader("refresh", "2;url=/0925MVC/jsp/login.jsp");
		}
		
	}

	//注册处理
	private void doRegister(HttpServletRequest request,
			HttpServletResponse response) {
		
		PrintWriter out = null;
		response.setContentType("text/html; charset=utf-8");
		try {
			request.setCharacterEncoding("utf-8");
			out = response.getWriter();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		
		User user = new User(username, password, email);
		
		//判断注册的信息是否有效
		//两次输入的密码是否一致
		if(username.isEmpty() || password.isEmpty() 
				|| password2.isEmpty() || email.isEmpty()){
			out.write("*标记的必填，不能为空，请重新注册");
			//2s后显示注册页面
			response.setHeader("refresh", "2;url=/0925MVC/jsp/register.jsp");
			
		}else{
			//确认密码和首次输入密码不匹配
			 if(password.equals(password2) == false){
				 out.write("密码和确认密码不匹配，请重新输入");
				 response.setHeader("refresh", "2;url=/0925MVC/jsp/register.jsp");
			 }
			 //用户已经被注册
			 else if(saveToXml.findUsername(username)){
				 out.write("该用户名已经被注册，请重新注册");
				 response.setHeader("refresh", "2;url=/0925MVC/jsp/register.jsp");
			 }
			 //注册信息符合要求，写入到xml文件中
			 else{
				//保存注册信息
				saveToXml.saveData(user);
				out.write("恭喜你，注册成功");
				response.setHeader("refresh", "2;url=/0925MVC/index.jsp");
			 }
			 
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response){
		
		doGet(request,response);
	}

}
