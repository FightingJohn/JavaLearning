package com.lyl.saxParser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserXml {

	/**	ʹ��sax����cd.xml�ļ�����ӡ��������������UK��ר�����ߡ�������£�
		MySaxDemo.main characters()  Bonnie Tyler
		MySaxDemo.main characters()  Gary Moore
		MySaxDemo.main characters()  Bee Gees
	 */
	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception {
		
		//1.����SAX��������
		SAXParserFactory spFactory = SAXParserFactory.newInstance();
		
		//2.ͨ�����������õ���������
		SAXParser sParser = spFactory.newSAXParser();
		
		//3.ͨ����������õ�һ��XML�Ķ�ȡ��
		XMLReader xmlReader = sParser.getXMLReader();
		
		//4.���ö�ȡ�����¼�����
		DefaultHandler dHandler = new DefaultHandler(){
			
			String tempARTIST=null, tempCOUNTRY = null, temp=null;
			int flag = 0;
			public void startDocument() throws SAXException {
			}

			public void endDocument() throws SAXException {
			}

			public void startElement(String uri, String localName,
					String qName, Attributes attributes) throws SAXException {
				temp = qName;
			}

			public void endElement(String uri, String localName, String qName)
					throws SAXException {
			}

			public void characters(char[] ch, int start, int length)
					throws SAXException {
				if(temp.equals("ARTIST") && (flag%2==0)){			//�����ж�flag��Ϊ������</ARTIST>
					tempARTIST = new String(ch, start, length);
				}
				flag++;
				if(temp.equals("COUNTRY")){
					tempCOUNTRY = new String(ch, start, length);
					if(tempCOUNTRY.equals("UK")){
						print(tempARTIST);
						}
				}
			}
			
		};
		
		xmlReader.setContentHandler(dHandler);
		
		//5.����xml�ļ�
		xmlReader.parse("cd.xml");

	}

}
