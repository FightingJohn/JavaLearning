package com.lyl.Xpath;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlXpathParser {

	/**
	 * 针对exam.xml文件使用xpath完成入下操作：
		1，得到某个具体的节点内容
		2、修改某个元素节点的主体内容
		3、向指定元素节点中增加子元素节点
		4、向指定元素节点上增加同级元素节点
		5、删除指定元素节点
		6、遍历所有元素节点
		7、获取XML文件某元素属性
	 */
	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception {
		
		//读取xml文件，获取document
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read("exam.xml");
		
		//1，得到某个具体的节点内容  打印第二个student的name
		print("-----------打印第二个student的name----------");
		Element secondStudentName = (Element) document.selectSingleNode("/exam/student[2]/name");
		print(secondStudentName.getText());
		
		//2、修改某个元素节点的主体内容  修改第二个student的location为深圳
//		print("--------修改第二个student的location为深圳---------");
//		Element secondStudentLocation = (Element) document.selectSingleNode("/exam/student[last()]/location");
//		secondStudentLocation.setText("深圳");
		
		//3、向指定元素节点中增加子元素节点   给第二个student添加一个子元素age  值为28
//		print("--------给第二个student添加一个子元素age  值为28---------");
//		Element secondStudent = (Element) document.selectSingleNode("/exam/student[last()]");
//		Element secondStudentAge = secondStudent.addElement("age");
//		secondStudentAge.setText("28");
		
		//4、向指定元素节点上增加同级元素节点  给第一个student的grade元素添加属性 sex  值为男
//		print("--------给第一个student的grade元素添加属性 sex  值为男---------");
//		Element firstStudentGrade = (Element) document.selectSingleNode("/exam/student[1]/grade");
//		firstStudentGrade.addAttribute("sex", "男");
		
		//5、删除指定元素节点   删除第二个student的age元素节点
//		Element secondStudentAge = (Element) document.selectSingleNode("/exam/student[last()]/age");
//		Element secondStudent = (Element) document.selectSingleNode("/exam/student[last()]");
//		secondStudent.remove(secondStudentAge);
		
		//6、遍历所有元素节点
//		print("-----------遍历所有元素节点--------");
//		List allElement = document.selectNodes("//*");
//		for(int i = 0; i<allElement.size(); i++){
//			Element element = (Element) allElement.get(i);
//			print(element.getName());
//			print(element.getText());
//		}
		
		//7、获取XML文件某元素属性     
		print("--------------获取所有的那么idcard属性和examid属性--------------");
		List idcardAttrs = document.selectNodes("//@idcard");
		List examcardAttrs = document.selectNodes("//@examid");
		for(int i = 0; i<idcardAttrs.size(); i++){
			Attribute idcardAttr = (Attribute) idcardAttrs.get(i);
			print(idcardAttr.getValue());
		}
		for(int i = 0; i<examcardAttrs.size(); i++){
			Attribute examcardAttr = (Attribute) examcardAttrs.get(i);
			print(examcardAttr.getValue());
		}
		
		
		//Dom4j标准写回xml文档代码
		OutputFormat format = OutputFormat.createPrettyPrint();
		//因为含有中文，所以指定编码
		format.setEncoding("GBK");
		XMLWriter writer = new XMLWriter(new FileOutputStream("exam.xml"), format);
		writer.write(document);
		writer.close();

	}

}
