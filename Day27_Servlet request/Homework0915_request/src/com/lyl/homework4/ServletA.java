package com.lyl.homework4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rdp = request.getRequestDispatcher("ServletC");
		
		request.setAttribute("resource", "À´×ÔServletAAAAAA");
		
		rdp.forward(request, response);

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

}
