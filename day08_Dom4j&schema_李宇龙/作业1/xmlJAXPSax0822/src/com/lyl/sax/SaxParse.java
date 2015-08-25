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
		
		//1.创建SAX解析工厂
		SAXParserFactory spFactory = SAXParserFactory.newInstance();
		
		//2.通过解析工厂得到解析对象
		SAXParser sParser = spFactory.newSAXParser();
		
		//3.通过解析对象得到一个XML的读取器
		XMLReader xmlReader = sParser.getXMLReader();
		
		//4.设置读取器的事件处理器
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
				if(qName.equals("书名"))
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
				if(bkName.equals("书名") && flag==2){
					String content = new String(ch, start, length);
					print(content);
				}
				
			}
			
		};
		
		xmlReader.setContentHandler(cHandler);
		
		//5.解析xml文件
		xmlReader.parse("book.xml");
	}

}
