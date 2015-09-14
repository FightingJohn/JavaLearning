package com.lyl.Xpath;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XpathParser {

	/**
	 * 练习Xpath解析
	 */
	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		//获取document对象
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read("exam.xml");
			
			//遍历所有的元素节点
/*			List allNodes = document.selectNodes("//*");
			for(int i = 0; i < allNodes.size(); i++){
				//获得每一个节点元素,并打印它的
				Node element = (Node) allNodes.get(i);
				print(element.getName());
				print(element.getText());
				print(element.getNodeType()+"");
			}*/
			
			//获取根元素
	/*		Node rootNode = document.selectSingleNode("/exam");
			print(rootNode.getName());
			//获得根节点下面的student元素
			List studentNodes = document.selectNodes("/exam/student");
			for(int i = 0; i < studentNodes.size(); i++){
				Element student = (Element)studentNodes.get(i);
				print(student.getName());
				print(student.getText());
				//获取元素节点属性
				print(student.attribute(i).getName());
				print(student.attribute(i).getText());
			}*/
			
			//获取name节点
/*			List nameNodes = document.selectNodes("/exam/student/name");
			for(int i = 0; i < nameNodes.size(); i++){
				//获得每一个节点元素,并打印它的
				Element element = (Element) nameNodes.get(i);
				print(element.getName());
				print(element.getText());
			}*/
			
			//获得xml中所有的name节点
/*			List nameNodes = document.selectNodes("//name");
			for(int i = 0; i < nameNodes.size(); i++){
				//获得每一个节点元素,并打印它的
				Element element = (Element) nameNodes.get(i);
				print(element.getName());
				Element parent = element.getParent();
				print(parent.getName());		//获得其父节点
				print(element.getText());
			}*/
			
			//选择/exam/student路径下的所有元素
/*			List nameNodes = document.selectNodes("/exam/student/*");
			for(int i = 0; i < nameNodes.size(); i++){
				//获得每一个节点元素,并打印它的
				Element element = (Element) nameNodes.get(i);
				print(element.getName());
				Element parent = element.getParent();
				print("父节点："+parent.getName());		//获得其父节点
				print(element.getText());
			}*/
			
			//选择有1个祖先节点的name节点
//			Element oneParentName = (Element) document.selectSingleNode("/*/name");
//			print(oneParentName.getName());
//			print(oneParentName.getText());
			
			//获得第一个student的name节点
			/*Element oneParentName = (Element) document.selectSingleNode("/exam/student[2]/name");
			print(oneParentName.getName());
			print(oneParentName.getText());*/
			
			//获得所有的idcard属性
			/*List idcardAttr = document.selectNodes("//@idcard");
			for(int i = 0; i < idcardAttr.size(); i++){
				//获得每一个节点元素,并打印它的
				Attribute element = (Attribute) idcardAttr.get(i);
				print(element.getName());
				print(element.getValue());
				print(element.getText());
			}*/
			
			//获得含有属性的grade节点
			Element grade = (Element) document.selectSingleNode("//grade[@sex='男']");
			print(grade.getName());
			print(grade.getText());	
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		

	}

}
