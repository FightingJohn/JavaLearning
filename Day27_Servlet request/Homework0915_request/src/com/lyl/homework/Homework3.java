package com.lyl.homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lyl.bean.User;

public class Homework3 extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//…Ë÷√±‡¬ÎŒ™utf-8
		//request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("userName");
		String gender = request.getParameter("gender");
		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr);
		String school = request.getParameter("school");
		String address = request.getParameter("address");
		
		User user = new User(username, gender, age, school, address);
		
		response.getWriter().write(user.toString());

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
