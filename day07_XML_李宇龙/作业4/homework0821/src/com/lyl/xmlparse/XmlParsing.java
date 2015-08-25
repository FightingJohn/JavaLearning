package com.lyl.xmlparse;

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

public class XmlParsing {

	/**
	 * @param args
	 */
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception{
		
		//����DOM����������
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		//�õ�DOM��������
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		//�õ������ĵ���document����
		Document document = dBuilder.parse("exam.xml");
		
		//1. ���xml�ĵ������һ���û������������壬��location�����룻grade��99
		print("------------����1------------");
		Element newStu = document.createElement("student");
		newStu.setAttribute("idcard", "555");							//���һ��������
		newStu.setAttribute("examid", "666");
		
		Element newName = document.createElement("name");				//����student����Ԫ��
		newName.setTextContent("����");	
		Element newLocation = document.createElement("location");
		newLocation.setTextContent("����");
		Element newGrade = document.createElement("grade");
		newGrade.setTextContent("99");
		
		newStu.appendChild(newName);
//		newStu.appendChild(newline1);									//�����ӻ���Ԫ��
		newStu.appendChild(newLocation);
		newStu.appendChild(newGrade);
		
		document.getElementsByTagName("exam").item(0).appendChild(newStu);//���µ�studentԪ�ز嵽ĩβ
		
		//2. ��ÿ��ѧ������һ����Ϣ���Ա�
		print("------------����2------------");
		NodeList studentsNode = document.getElementsByTagName("student");
		for(int i = 0; i<studentsNode.getLength(); i++){
			Element sexNode = document.createElement("�Ա�");
			sexNode.setTextContent("��");
			studentsNode.item(i).appendChild(sexNode);
		}
		
		//. ɾ����һ��ѧ��������������Ϣ��
		print("------------����3------------");
		document.getElementsByTagName("exam").item(0).removeChild(studentsNode.item(0));
		
		//4. ���ڶ���ѧ�����ĵ�������Ϊ ���Ĺ�
		print("------------����4------------");
		studentsNode.item(0).getChildNodes().item(1).setTextContent("���Ĺ�");
		
		//5. ��ÿ��ѧ������һ��ID���ԡ�
		print("------------����5------------");
		for(int i = 0; i<studentsNode.getLength(); i++){
			((Element) studentsNode.item(i)).setAttribute("ID", ""+i);						//�ܲ����в���ǿ��ת�����͵ķ���
		}
		
		//���ڴ������document�����dom�� д�ص�Ӳ���ϵı�׼����
		TransformerFactory tsf =TransformerFactory.newInstance();
		Transformer tsTransformer = tsf.newTransformer();
	//	tsTransformer.setOutputProperty(OutputKeys.ENCODING, "GBK");
		tsTransformer.transform(
		new DOMSource(document), 
		new StreamResult("exam1.xml"));
		print("���ڴ�д��Ӳ�̳ɹ���");

	}

}
