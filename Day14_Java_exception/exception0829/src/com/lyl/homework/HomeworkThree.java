package com.lyl.homework;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class HomeworkThree {

	/**
	 * ʹ��jAxp����dom����
	 * ����Ŀ��book.xml
	 */
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		//���JAXP�������Ĳ���
		//��һ�������� DocumentBuilderFactory.newInstance() �����õ����� DOM �������Ĺ���
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		
		//�ڶ��������ù�������� newDocumentBuilder�����õ� DOM ����������
		DocumentBuilder dbuilder = null;
		Document document = null;
		try {
			dbuilder = dbfactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//������������ DOM ����������� parse() �������� XML �ĵ����õ����������ĵ��� Document ����
		//���п�������DOM���Զ�����XML�ĵ����в�����
		try {
			document = dbuilder.parse("book.xml");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//1���õ�ĳ������Ľڵ�����  �� nodeType  nodeValue nodeName
		Node price = document.getElementsByTagName("�ۼ�").item(0);
		String priceValue = price.getTextContent();
		
		print("--------------1---------------");
		print(priceValue);
		print(price.getNodeName());
		print(price.getNodeType());
		print(price.getNodeValue());
	}

}
