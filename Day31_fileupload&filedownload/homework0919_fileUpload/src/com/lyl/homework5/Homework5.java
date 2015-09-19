package com.lyl.homework5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Homework5 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//判断输入的用户名和密码是否匹配
		if(prove(username, password)){
			response.getWriter().print("登录成功！");
		}else{
			//不匹配，则返回登录界面
			response.sendRedirect("../jsp/LoginAgain.jsp");
		}

	}

	private boolean prove(String username, String password) {
		
		//文件的相对路径
		String filePath = "\\xml\\userInfo.xml";
		//获得绝对路径
		String realPath = getServletContext().getRealPath(filePath);
		
		//使用Dom4j来操作xml
		try {
			SAXReader reader = new SAXReader();
			Document document = 
					reader.read(realPath);
			Element root = document.getRootElement();			//获得根元素 user
			
			List elements = root.elements();
			//遍历所有用户
			for (int i=0; i < elements.size(); i++) {
				
				Element person = (Element) elements.get(i);
				Element elementName = person.element("name");	//登录元素
				Element elementpw = person.element("password");	//密码元素
				String pName = elementName.getText();			//登录名
				String pPassword = elementpw.getText();			//密码
				if(pName.equals(username) && pPassword.equals(password))
					return true;
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return false;
	}

}
