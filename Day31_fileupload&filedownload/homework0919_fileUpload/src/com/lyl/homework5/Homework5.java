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
		
		//�ж�������û����������Ƿ�ƥ��
		if(prove(username, password)){
			response.getWriter().print("��¼�ɹ���");
		}else{
			//��ƥ�䣬�򷵻ص�¼����
			response.sendRedirect("../jsp/LoginAgain.jsp");
		}

	}

	private boolean prove(String username, String password) {
		
		//�ļ������·��
		String filePath = "\\xml\\userInfo.xml";
		//��þ���·��
		String realPath = getServletContext().getRealPath(filePath);
		
		//ʹ��Dom4j������xml
		try {
			SAXReader reader = new SAXReader();
			Document document = 
					reader.read(realPath);
			Element root = document.getRootElement();			//��ø�Ԫ�� user
			
			List elements = root.elements();
			//���������û�
			for (int i=0; i < elements.size(); i++) {
				
				Element person = (Element) elements.get(i);
				Element elementName = person.element("name");	//��¼Ԫ��
				Element elementpw = person.element("password");	//����Ԫ��
				String pName = elementName.getText();			//��¼��
				String pPassword = elementpw.getText();			//����
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
