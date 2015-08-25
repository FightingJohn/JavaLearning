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
	 * ʹ��jAxp����dom����
	 * ����Ŀ��book.xml
	 */
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception{
		
		//���JAXP�������Ĳ���
		//��һ�������� DocumentBuilderFactory.newInstance() �����õ����� DOM �������Ĺ���
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		
		//�ڶ��������ù�������� newDocumentBuilder�����õ� DOM ����������
		DocumentBuilder dbuilder = dbfactory.newDocumentBuilder();
		
		//������������ DOM ����������� parse() �������� XML �ĵ����õ����������ĵ��� Document ����
		//���п�������DOM���Զ�����XML�ĵ����в�����
		Document document = dbuilder.parse("books.xml");
		
		/*	//1���õ�ĳ������Ľڵ�����  �� nodeType  nodeValue nodeName
		Node price = document.getElementsByTagName("�ۼ�").item(0);
		String priceValue = price.getTextContent();
		
		print("--------------1---------------");
		print(priceValue);
		print(price.getNodeName());
		print(price.getNodeType());
		print(price.getNodeValue());
		
		//2����ӡ��һ���� �ڵ������Ԫ�ؽڵ�
		print("--------------2---------------");
		Node book1 = document.getElementsByTagName("��").item(0);
		NodeList book1Children = book1.getChildNodes();
		for(int i = 0; i<book1Children.getLength(); i++){
			if(book1Children.item(i).getNodeType()==1){
				print(book1Children.item(i).getNodeName());
			}
		}
		
		//3���޸�ĳ��Ԫ�ؽڵ����������   �޸ĵ�һ����ļ۸�Ϊ100
		print("--------------3---------------");
		print(book1Children.item(5).getTextContent());
		book1Children.item(5).setTextContent("100Ԫ");
		print(book1Children.item(5).getTextContent());
		
		//4����ָ��Ԫ�ؽڵ���������Ԫ�ؽڵ�  ���һ����������һ����� <���>ISBN9001XXX</���>
		print("--------------4---------------");
		Element newEle = document.createElement("���");
		newEle.setTextContent("ISBN9001XXX");
		book1.appendChild(newEle);
		print(book1Children.item(7).getTextContent());
		
		//5����ָ��Ԫ�ؽڵ�������ͬ��Ԫ�ؽڵ�   ������һ����
		print("--------------5---------------");
		Element newBook = document.createElement("��");
		document.getElementsByTagName("���").item(0).insertBefore(newBook, book1);*/
		
		
		//6��ɾ��ָ��Ԫ�ؽڵ�
		print("--------------6---------------");
		Node deleteBook = document.getElementsByTagName("��").item(0);
		document.getElementsByTagName("���").item(0).removeChild(deleteBook);
		
		
		//���ڴ������document�����dom�� д�ص�Ӳ���ϵı�׼����
		  TransformerFactory tsf =TransformerFactory.newInstance();
		  Transformer tsTransformer = tsf.newTransformer();
		  tsTransformer.setOutputProperty(OutputKeys.ENCODING, "GBK");
		  tsTransformer.transform(
		  new DOMSource(document), 
		  new StreamResult("books.xml"));
		  print("���ڴ�д��Ӳ�̳ɹ���");
	}

}
