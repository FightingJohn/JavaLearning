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

	/**
	 * 针对exam.xml文件使用dom4j完成入下操作：
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
		Element root = document.getRootElement();
		List studentList = root.elements();

		//1，得到某个具体的节点内容    第一个学生的姓名
		print("----------第一个学生的姓名----------");
		Element student1 = (Element) studentList.get(0);
		print(student1.element("name").getText());
		
		//2、修改某个元素节点的主体内容  第一个学生的grade改为99
//		print("----------第一个学生的grade改为99----------");
//		print(student1.element("grade").getText());
//		student1.element("grade").setText("99");
//		print("改为");
//		print(student1.element("grade").getText());
		
		//3、向指定元素节点中增加子元素节点  第一个学生增加一个sex节点
//		Element student1Sex = student1.addElement("sex");
//		student1Sex.setText("男");
		
		//4、向指定元素节点上增加同级元素节点   向第一个学生添加属性 list  值为5
//		student1.addAttribute("list", "5");
		
		//5、删除指定元素节点  删除添加 sex节点
//		Element removeStudent1Sex = student1.element("sex");
//		student1.remove(removeStudent1Sex);
		
		//6、遍历所有元素节点
		print("----------遍历所有节点----------");
		for(int i=0; i<studentList.size(); i++){
			print("student----"+(i+1));
			Element student = (Element) studentList.get(i);
			Element name = student.element("name");
			Element location = student.element("location");
			Element grade = student.element("grade");
			print(name.getText());
			print(location.getText());
			print(grade.getText());
		}
		
		//7、获取XML文件某元素属性     获得第一个学生的所有属性
		print("----------第一个学生的所有属性----------");
		List student1AttributeList = student1.attributes();
		for(int i=0; i<student1AttributeList.size(); i++){
			Attribute student1Attribute = (Attribute) student1AttributeList.get(i);
			print(student1Attribute.getValue());
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
