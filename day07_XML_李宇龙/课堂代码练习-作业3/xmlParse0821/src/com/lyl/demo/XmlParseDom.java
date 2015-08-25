package com.lyl.demo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParseDom {

	/**
	 * 使用jAxp进行dom解析
	 * 解析目标book.xml
	 */
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception{
		
		//获得JAXP解析器的操作
		//第一步，调用 DocumentBuilderFactory.newInstance() 方法得到创建 DOM 解析器的工厂
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		
		//第二步，调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象
		DocumentBuilder dbuilder = dbfactory.newDocumentBuilder();
		
		//第三步，调用 DOM 解析器对象的 parse() 方法解析 XML 文档，得到代表整个文档的 Document 对象，
		//进行可以利用DOM特性对整个XML文档进行操作了
		Document document = dbuilder.parse("books.xml");
		
		/*	//1、得到某个具体的节点内容  和 nodeType  nodeValue nodeName
		Node price = document.getElementsByTagName("售价").item(0);
		String priceValue = price.getTextContent();
		
		print("--------------1---------------");
		print(priceValue);
		print(price.getNodeName());
		print(price.getNodeType());
		print(price.getNodeValue());
		
		//2、打印第一个书 节点的所有元素节点
		print("--------------2---------------");
		Node book1 = document.getElementsByTagName("书").item(0);
		NodeList book1Children = book1.getChildNodes();
		for(int i = 0; i<book1Children.getLength(); i++){
			if(book1Children.item(i).getNodeType()==1){
				print(book1Children.item(i).getNodeName());
			}
		}
		
		//3、修改某个元素节点的主体内容   修改第一本书的价格为100
		print("--------------3---------------");
		print(book1Children.item(5).getTextContent());
		book1Children.item(5).setTextContent("100元");
		print(book1Children.item(5).getTextContent());
		
		//4、向指定元素节点中增加子元素节点  向第一本书中增加一个书号 <书号>ISBN9001XXX</书号>
		print("--------------4---------------");
		Element newEle = document.createElement("书号");
		newEle.setTextContent("ISBN9001XXX");
		book1.appendChild(newEle);
		print(book1Children.item(7).getTextContent());
		
		//5、向指定元素节点上增加同级元素节点   在增加一本书
		print("--------------5---------------");
		Element newBook = document.createElement("书");
		document.getElementsByTagName("书架").item(0).insertBefore(newBook, book1);*/
		
		
		//6、删除指定元素节点
		print("--------------6---------------");
		Node deleteBook = document.getElementsByTagName("书").item(0);
		document.getElementsByTagName("书架").item(0).removeChild(deleteBook);
		
		
		//将内存里面的document代表的dom树 写回到硬盘上的标准做法
		  TransformerFactory tsf =TransformerFactory.newInstance();
		  Transformer tsTransformer = tsf.newTransformer();
		  tsTransformer.setOutputProperty(OutputKeys.ENCODING, "GBK");
		  tsTransformer.transform(
		  new DOMSource(document), 
		  new StreamResult("books.xml"));
		  print("从内存写入硬盘成功！");
	}

}
