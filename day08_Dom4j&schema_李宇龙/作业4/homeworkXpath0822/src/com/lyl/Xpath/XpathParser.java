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
	 * ��ϰXpath����
	 */
	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		//��ȡdocument����
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read("exam.xml");
			
			//�������е�Ԫ�ؽڵ�
/*			List allNodes = document.selectNodes("//*");
			for(int i = 0; i < allNodes.size(); i++){
				//���ÿһ���ڵ�Ԫ��,����ӡ����
				Node element = (Node) allNodes.get(i);
				print(element.getName());
				print(element.getText());
				print(element.getNodeType()+"");
			}*/
			
			//��ȡ��Ԫ��
	/*		Node rootNode = document.selectSingleNode("/exam");
			print(rootNode.getName());
			//��ø��ڵ������studentԪ��
			List studentNodes = document.selectNodes("/exam/student");
			for(int i = 0; i < studentNodes.size(); i++){
				Element student = (Element)studentNodes.get(i);
				print(student.getName());
				print(student.getText());
				//��ȡԪ�ؽڵ�����
				print(student.attribute(i).getName());
				print(student.attribute(i).getText());
			}*/
			
			//��ȡname�ڵ�
/*			List nameNodes = document.selectNodes("/exam/student/name");
			for(int i = 0; i < nameNodes.size(); i++){
				//���ÿһ���ڵ�Ԫ��,����ӡ����
				Element element = (Element) nameNodes.get(i);
				print(element.getName());
				print(element.getText());
			}*/
			
			//���xml�����е�name�ڵ�
/*			List nameNodes = document.selectNodes("//name");
			for(int i = 0; i < nameNodes.size(); i++){
				//���ÿһ���ڵ�Ԫ��,����ӡ����
				Element element = (Element) nameNodes.get(i);
				print(element.getName());
				Element parent = element.getParent();
				print(parent.getName());		//����丸�ڵ�
				print(element.getText());
			}*/
			
			//ѡ��/exam/student·���µ�����Ԫ��
/*			List nameNodes = document.selectNodes("/exam/student/*");
			for(int i = 0; i < nameNodes.size(); i++){
				//���ÿһ���ڵ�Ԫ��,����ӡ����
				Element element = (Element) nameNodes.get(i);
				print(element.getName());
				Element parent = element.getParent();
				print("���ڵ㣺"+parent.getName());		//����丸�ڵ�
				print(element.getText());
			}*/
			
			//ѡ����1�����Ƚڵ��name�ڵ�
//			Element oneParentName = (Element) document.selectSingleNode("/*/name");
//			print(oneParentName.getName());
//			print(oneParentName.getText());
			
			//��õ�һ��student��name�ڵ�
			/*Element oneParentName = (Element) document.selectSingleNode("/exam/student[2]/name");
			print(oneParentName.getName());
			print(oneParentName.getText());*/
			
			//������е�idcard����
			/*List idcardAttr = document.selectNodes("//@idcard");
			for(int i = 0; i < idcardAttr.size(); i++){
				//���ÿһ���ڵ�Ԫ��,����ӡ����
				Attribute element = (Attribute) idcardAttr.get(i);
				print(element.getName());
				print(element.getValue());
				print(element.getText());
			}*/
			
			//��ú������Ե�grade�ڵ�
			Element grade = (Element) document.selectSingleNode("//grade[@sex='��']");
			print(grade.getName());
			print(grade.getText());	
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		

	}

}
