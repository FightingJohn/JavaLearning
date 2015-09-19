package com.lyl.homework2;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String fileName = request.getParameter("textfile");
		
		//用户下载时显示的名字
		String downloadName = fileName+".txt";
		//解决下载名中含有汉字的情况
		response.setHeader("Content-Disposition", 
				"attachment; filename="+URLEncoder.encode(downloadName, "utf-8"));
		
		//下载文件的相对路径
		String filePath = "\\file\\info.txt";
		//获得绝对路径
		String realPath = getServletContext().getRealPath(filePath);
		
		FileInputStream fis = new FileInputStream(realPath);
		
		//写入响应报文的输出流中
		ServletOutputStream sos = response.getOutputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while((len = fis.read(b, 0, 1024)) != -1){
			
			sos.write(b, 0, len);
		}
		fis.close();
		
		//response.getWriter().print("恭喜你！ 下载文本文件成功");
		
	}

}
