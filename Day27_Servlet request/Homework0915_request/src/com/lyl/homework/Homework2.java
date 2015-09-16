package com.lyl.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homework2 extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		StringBuffer sb = request.getRequestURL();
		String url = sb.toString();
		String protocal = request.getProtocol();
		String method = request.getMethod();
		
		response.getWriter().println(url+ "  " + protocal + "  " + method);
		
		Enumeration<String> str1 = request.getHeaders("Accept");
		while(str1.hasMoreElements())
		{
			response.getWriter().println("Accept:"+str1.nextElement());
		}
		
		String str2 = request.getHeader("X-HttpWatch-RID");
		response.getWriter().println("X-HttpWatch-RID:"+str2);
		
		Enumeration<String> str3 = request.getHeaders("Accept-Language");
		while(str1.hasMoreElements())
		{
			response.getWriter().println("Accept-Language:"+str3.nextElement());
		}
		
		String str4 = request.getHeader("User-Agent");
		response.getWriter().println("User-Agent:"+str4);
		
		Enumeration<String> str5 = request.getHeaders("Accept-Encoding");
		while(str1.hasMoreElements())
		{
			response.getWriter().println("Accept-Encoding:"+str5.nextElement());
		}
		
		String str8 = request.getHeader("Host");
		response.getWriter().println("Host:"+str8);
		
		String str6 = request.getHeader("If-Modified-Since");
		response.getWriter().println("If-Modified-Since:"+str6);
		
		String str7 = request.getHeader("Connection");
		response.getWriter().println("Connection:"+str7);
		

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

}
