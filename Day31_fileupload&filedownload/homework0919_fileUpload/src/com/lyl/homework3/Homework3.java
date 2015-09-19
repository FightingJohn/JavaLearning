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
		
		response.getWriter().print("ע��ɹ�");
	}

	//���û��������Ϣ���浽userInfo.xml�ļ���
	private void saveToXml(String personName, String age, String password,
			String cellphone, String hometown) {
		
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
			
			//���user����Ԫ��person
			root.addElement("person");
			//��ø���ӽ����personԪ��
			Element firstPerson =  (Element) root.elements().get(0);
			
			//������personԪ�������Ԫ��,������ı�
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
			
			//�Ѹ��µ�xml����д��ԭ�ļ�
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
