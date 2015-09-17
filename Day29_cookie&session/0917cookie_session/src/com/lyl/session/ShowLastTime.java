package com.lyl.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowLastTime extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//获得请求报文中的session
		HttpSession session = request.getSession();
		if(session != null){
			//获得以lastTime标记的内容
			Date time = (Date) session.getAttribute("lastTime");
			
			if(time != null)
				out.print(time.toString());
			
			//在session中存入当前日期
			Date date = new Date();
			session.setAttribute("lastTime", date);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
