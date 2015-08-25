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
	 * ���exam.xml�ļ�ʹ��dom4j������²�����
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
		Element root = document.getRootElement();
		List studentList = root.elements();

		//1���õ�ĳ������Ľڵ�����    ��һ��ѧ��������
		print("----------��һ��ѧ��������----------");
		Element student1 = (Element) studentList.get(0);
		print(student1.element("name").getText());
		
		//2���޸�ĳ��Ԫ�ؽڵ����������  ��һ��ѧ����grade��Ϊ99
//		print("----------��һ��ѧ����grade��Ϊ99----------");
//		print(student1.element("grade").getText());
//		student1.element("grade").setText("99");
//		print("��Ϊ");
//		print(student1.element("grade").getText());
		
		//3����ָ��Ԫ�ؽڵ���������Ԫ�ؽڵ�  ��һ��ѧ������һ��sex�ڵ�
//		Element student1Sex = student1.addElement("sex");
//		student1Sex.setText("��");
		
		//4����ָ��Ԫ�ؽڵ�������ͬ��Ԫ�ؽڵ�   ���һ��ѧ��������� list  ֵΪ5
//		student1.addAttribute("list", "5");
		
		//5��ɾ��ָ��Ԫ�ؽڵ�  ɾ����� sex�ڵ�
//		Element removeStudent1Sex = student1.element("sex");
//		student1.remove(removeStudent1Sex);
		
		//6����������Ԫ�ؽڵ�
		print("----------�������нڵ�----------");
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
		
		//7����ȡXML�ļ�ĳԪ������     ��õ�һ��ѧ������������
		print("----------��һ��ѧ������������----------");
		List student1AttributeList = student1.attributes();
		for(int i=0; i<student1AttributeList.size(); i++){
			Attribute student1Attribute = (Attribute) student1AttributeList.get(i);
			print(student1Attribute.getValue());
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
