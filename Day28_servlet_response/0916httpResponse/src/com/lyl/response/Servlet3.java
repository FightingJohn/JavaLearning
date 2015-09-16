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
		
		//����ͼƬ
		String pictureName = "ali.jpg";
		//���ͼƬ�����ĵ�����
		response.setHeader("Content-Disposition", 
				"attachment; filename="+URLEncoder.encode(pictureName, "utf-8"));
		
		//ͼƬ·����Servlet3�����·��
		String picPath = "\\WEB-INF\\classes\\����.jpg";
		//�����Ƭ�ľ���·��
		String realPath = getServletContext().getRealPath(picPath);
		
		System.out.println("realPath = "+ realPath);
		
		//��ͼƬ��Ϣд�뵽��Ӧͷ�����������
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
