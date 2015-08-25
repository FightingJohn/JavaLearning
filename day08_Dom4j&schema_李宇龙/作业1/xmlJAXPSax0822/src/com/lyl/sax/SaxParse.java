package com.lyl.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParse {

	/**
	 * @param args
	 */
	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception{
		
		//1.����SAX��������
		SAXParserFactory spFactory = SAXParserFactory.newInstance();
		
		//2.ͨ�����������õ���������
		SAXParser sParser = spFactory.newSAXParser();
		
		//3.ͨ����������õ�һ��XML�Ķ�ȡ��
		XMLReader xmlReader = sParser.getXMLReader();
		
		//4.���ö�ȡ�����¼�������
		DefaultHandler cHandler = new DefaultHandler() {
			
			String bkName ;
			int flag = 0;
			public void startDocument() throws SAXException {
//				print("startDocument()");
			}

			public void endDocument() throws SAXException {
	//			print("endDocument()");
			}

			public void startElement(String uri, String localName,
					String qName, Attributes attributes) throws SAXException {
				
				bkName = qName;
				if(qName.equals("����"))
					++flag;
			}

			public void endElement(String uri, String localName, String qName)
					throws SAXException {
//				print("endElement()");
			}

			public void characters(char[] ch, int start, int length)
					throws SAXException {
//				print("characters()");
//				print(flag);
				if(bkName.equals("����") && flag==2){
					String content = new String(ch, start, length);
					print(content);
				}
				
			}
			
		};
		
		xmlReader.setContentHandler(cHandler);
		
		//5.����xml�ļ�
		xmlReader.parse("book.xml");
	}

}
