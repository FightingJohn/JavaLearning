package com.lyl.dom4j;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


public class XmlDom4jParser {

	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception {
		
		//使用Dom4j来解析book.xml
		SAXReader sReader = new SAXReader();
		Document document = sReader.read("book.xml");
		Element root = document.getRootElement();
		
		//1.获得第一本书的价格
		print("----------获得第一本书的价格----------");
		List booklist = root.elements();				//获得根元素下面的子元素
		Element firstBook = (Element) booklist.get(0);
		Element firstBookPrice = firstBook.element("售价");
		print(firstBookPrice.getText());
		
		//2.找到第二本书，修改作者为吴军博士
//		print("----------修改第二本书作者为吴军博士----------");
//		Element secondBook = (Element) booklist.get(1);
//		Element secondBookAuthor = secondBook.element("作者");
//		secondBookAuthor.setText("吴军");
		
		//3.在第一本书添加一个 书号元素 值为100001
//		print("----------第一本书添加一个 书号元素 值为100001----------");
//		Element firstBookNum = firstBook.addElement("书号");
//		firstBookNum.addCDATA("<html>haha</html>");
//		firstBookNum.setText("1000001");
		
		//4.删除新增的书号
//		print("----------删除新增的书号----------");
//		Element removeFirstBookNum = firstBook.element("书号");
//		firstBook.remove(removeFirstBookNum);
		
		//5.给第一本书号添加一个属性  系列 值为3
		Element firstBookNum = firstBook.element("书号");
//		firstBookNum.addAttribute("系列", "3");
		
		//6.获得某个节点的属性，并改变它的值
		Attribute firstBookNumAttr = firstBookNum.attribute("系列");
//		print(firstBookNumAttr.getText());
//		firstBookNumAttr.setText("5");
		
		//移除添加的属性
		firstBookNum.remove(firstBookNumAttr);
		
		
		//Dom4j标准写会到xml文件的代码
		OutputFormat outputFormat = OutputFormat.createPrettyPrint();
		outputFormat.setEncoding("GBK");
		XMLWriter writer = new XMLWriter(new FileOutputStream("book.xml"), outputFormat);
		writer.write(document);
		writer.close();
	}

}
