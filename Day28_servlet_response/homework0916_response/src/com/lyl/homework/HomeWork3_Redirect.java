package com.lyl.homework;

import java.io.IOException;

import javax.jms.BytesMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeWork3_Redirect extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		

		//String query = request.getQueryString();
		String user = request.getParameter("username");
		byte[] bytes = user.getBytes("iso-8859-1");
		String username = new String(bytes, "utf-8");
		String password = request.getParameter("password");
		
		
		response.getWriter().write("”√ªß√˚£∫"+ username +" √‹¬Î£∫"+password);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
