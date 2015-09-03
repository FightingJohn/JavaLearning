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
	 * 使用jAxp进行dom解析
	 * 解析目标book.xml
	 */
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		//获得JAXP解析器的操作
		//第一步，调用 DocumentBuilderFactory.newInstance() 方法得到创建 DOM 解析器的工厂
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		
		//第二步，调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象
		DocumentBuilder dbuilder = null;
		Document document = null;
		try {
			dbuilder = dbfactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//第三步，调用 DOM 解析器对象的 parse() 方法解析 XML 文档，得到代表整个文档的 Document 对象，
		//进行可以利用DOM特性对整个XML文档进行操作了
		try {
			document = dbuilder.parse("book.xml");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//1、得到某个具体的节点内容  和 nodeType  nodeValue nodeName
		Node price = document.getElementsByTagName("售价").item(0);
		String priceValue = price.getTextContent();
		
		print("--------------1---------------");
		print(priceValue);
		print(price.getNodeName());
		print(price.getNodeType());
		print(price.getNodeValue());
	}

}
