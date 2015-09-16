package com.lyl.response;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//下载图片
		String pictureName = "ali.jpg";
		//解决图片含中文的问题
		response.setHeader("Content-Disposition", 
				"attachment; filename="+URLEncoder.encode(pictureName, "utf-8"));
		
		//图片路径和Servlet3的相对路径
		String picPath = "\\WEB-INF\\classes\\阿狸.jpg";
		//获得照片的绝对路径
		String realPath = getServletContext().getRealPath(picPath);
		
		System.out.println("realPath = "+ realPath);
		
		//把图片信息写入到响应头的输出流里面
		FileInputStream fis = new FileInputStream(realPath);
		
		ServletOutputStream sos = response.getOutputStream();
		
		byte[] b = new byte[1024];
		int len = 0;
		while((len = fis.read(b, 0, 1024)) != -1){
			
			sos.write(b, 0, len);
	
		}
		fis.close();

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
