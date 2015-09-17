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
		
		//����������е�session
		HttpSession session = request.getSession();
		if(session != null){
			//�����lastTime��ǵ�����
			Date time = (Date) session.getAttribute("lastTime");
			
			if(time != null)
				out.print(time.toString());
			
			//��session�д��뵱ǰ����
			Date date = new Date();
			session.setAttribute("lastTime", date);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
