package com.lyl.homework3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

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

public class Homework3 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String personName = request.getParameter("name");
		String age = request.getParameter("age");
		String password = request.getParameter("password");
		String cellphone = request.getParameter("cellphone");
		String hometown = request.getParameter("hometown");
		
		saveToXml(personName,age,password,cellphone,hometown);
		
		response.getWriter().print("注册成功");
	}

	//将用户输入的信息保存到userInfo.xml文件中
	private void saveToXml(String personName, String age, String password,
			String cellphone, String hometown) {
		
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
			
			//添加user的子元素person
			root.addElement("person");
			//获得刚添加进入的person元素
			Element firstPerson =  (Element) root.elements().get(0);
			
			//向加入的person元素添加子元素,并添加文本
			Element name = firstPerson.addElement("name");
			name.setText(personName);
			Element personAge = firstPerson.addElement("age");
			personAge.setText(age);
			Element pw = firstPerson.addElement("password");
			pw.setText(password);
			Element cphone = firstPerson.addElement("cellphone");
			cphone.setText(cellphone);
			Element htown = firstPerson.addElement("hometown");
			htown.setText(hometown);
			
			//把更新的xml重新写回原文件
			OutputFormat outputFormat = OutputFormat.createPrettyPrint();
			outputFormat.setEncoding("GBK");
			XMLWriter writer = new XMLWriter(new FileOutputStream(realPath), outputFormat);
			writer.write(document);
			writer.close();
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
