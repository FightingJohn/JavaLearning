package com.lyl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 手动实现一个servlet，要求用户去访问这个servlet的时候，
 * user每次在browser刷新都可以看到服务器当前的时间*/
public class Homework2 extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获得当前时间
		Date date = new Date();
		//格式化当前的时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formatDate = sdf.format(date);
		//把格式化的当前时间写入响应报文的输出流中
		response.getWriter().write(formatDate);
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

}
