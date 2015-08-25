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
		
		//ʹ��Dom4j������book.xml
		SAXReader sReader = new SAXReader();
		Document document = sReader.read("book.xml");
		Element root = document.getRootElement();
		
		//1.��õ�һ����ļ۸�
		print("----------��õ�һ����ļ۸�----------");
		List booklist = root.elements();				//��ø�Ԫ���������Ԫ��
		Element firstBook = (Element) booklist.get(0);
		Element firstBookPrice = firstBook.element("�ۼ�");
		print(firstBookPrice.getText());
		
		//2.�ҵ��ڶ����飬�޸�����Ϊ�����ʿ
//		print("----------�޸ĵڶ���������Ϊ�����ʿ----------");
//		Element secondBook = (Element) booklist.get(1);
//		Element secondBookAuthor = secondBook.element("����");
//		secondBookAuthor.setText("���");
		
		//3.�ڵ�һ�������һ�� ���Ԫ�� ֵΪ100001
//		print("----------��һ�������һ�� ���Ԫ�� ֵΪ100001----------");
//		Element firstBookNum = firstBook.addElement("���");
//		firstBookNum.addCDATA("<html>haha</html>");
//		firstBookNum.setText("1000001");
		
		//4.ɾ�����������
//		print("----------ɾ�����������----------");
//		Element removeFirstBookNum = firstBook.element("���");
//		firstBook.remove(removeFirstBookNum);
		
		//5.����һ��������һ������  ϵ�� ֵΪ3
		Element firstBookNum = firstBook.element("���");
//		firstBookNum.addAttribute("ϵ��", "3");
		
		//6.���ĳ���ڵ�����ԣ����ı�����ֵ
		Attribute firstBookNumAttr = firstBookNum.attribute("ϵ��");
//		print(firstBookNumAttr.getText());
//		firstBookNumAttr.setText("5");
		
		//�Ƴ���ӵ�����
		firstBookNum.remove(firstBookNumAttr);
		
		
		//Dom4j��׼д�ᵽxml�ļ��Ĵ���
		OutputFormat outputFormat = OutputFormat.createPrettyPrint();
		outputFormat.setEncoding("GBK");
		XMLWriter writer = new XMLWriter(new FileOutputStream("book.xml"), outputFormat);
		writer.write(document);
		writer.close();
	}

}
