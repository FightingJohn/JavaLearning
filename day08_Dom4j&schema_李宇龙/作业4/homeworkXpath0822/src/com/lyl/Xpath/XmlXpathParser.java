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
	 * ���exam.xml�ļ�ʹ��xpath������²�����
		1���õ�ĳ������Ľڵ�����
		2���޸�ĳ��Ԫ�ؽڵ����������
		3����ָ��Ԫ�ؽڵ���������Ԫ�ؽڵ�
		4����ָ��Ԫ�ؽڵ�������ͬ��Ԫ�ؽڵ�
		5��ɾ��ָ��Ԫ�ؽڵ�
		6����������Ԫ�ؽڵ�
		7����ȡXML�ļ�ĳԪ������
	 */
	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception {
		
		//��ȡxml�ļ�����ȡdocument
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read("exam.xml");
		
		//1���õ�ĳ������Ľڵ�����  ��ӡ�ڶ���student��name
		print("-----------��ӡ�ڶ���student��name----------");
		Element secondStudentName = (Element) document.selectSingleNode("/exam/student[2]/name");
		print(secondStudentName.getText());
		
		//2���޸�ĳ��Ԫ�ؽڵ����������  �޸ĵڶ���student��locationΪ����
//		print("--------�޸ĵڶ���student��locationΪ����---------");
//		Element secondStudentLocation = (Element) document.selectSingleNode("/exam/student[last()]/location");
//		secondStudentLocation.setText("����");
		
		//3����ָ��Ԫ�ؽڵ���������Ԫ�ؽڵ�   ���ڶ���student���һ����Ԫ��age  ֵΪ28
//		print("--------���ڶ���student���һ����Ԫ��age  ֵΪ28---------");
//		Element secondStudent = (Element) document.selectSingleNode("/exam/student[last()]");
//		Element secondStudentAge = secondStudent.addElement("age");
//		secondStudentAge.setText("28");
		
		//4����ָ��Ԫ�ؽڵ�������ͬ��Ԫ�ؽڵ�  ����һ��student��gradeԪ��������� sex  ֵΪ��
//		print("--------����һ��student��gradeԪ��������� sex  ֵΪ��---------");
//		Element firstStudentGrade = (Element) document.selectSingleNode("/exam/student[1]/grade");
//		firstStudentGrade.addAttribute("sex", "��");
		
		//5��ɾ��ָ��Ԫ�ؽڵ�   ɾ���ڶ���student��ageԪ�ؽڵ�
//		Element secondStudentAge = (Element) document.selectSingleNode("/exam/student[last()]/age");
//		Element secondStudent = (Element) document.selectSingleNode("/exam/student[last()]");
//		secondStudent.remove(secondStudentAge);
		
		//6����������Ԫ�ؽڵ�
//		print("-----------��������Ԫ�ؽڵ�--------");
//		List allElement = document.selectNodes("//*");
//		for(int i = 0; i<allElement.size(); i++){
//			Element element = (Element) allElement.get(i);
//			print(element.getName());
//			print(element.getText());
//		}
		
		//7����ȡXML�ļ�ĳԪ������     
		print("--------------��ȡ���е���ôidcard���Ժ�examid����--------------");
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
		
		
		//Dom4j��׼д��xml�ĵ�����
		OutputFormat format = OutputFormat.createPrettyPrint();
		//��Ϊ�������ģ�����ָ������
		format.setEncoding("GBK");
		XMLWriter writer = new XMLWriter(new FileOutputStream("exam.xml"), format);
		writer.write(document);
		writer.close();

	}

}
