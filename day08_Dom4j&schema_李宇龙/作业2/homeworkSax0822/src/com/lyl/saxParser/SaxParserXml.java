package com.lyl.saxParser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserXml {

	/**	使用sax解析cd.xml文件。打印出里面所有属于UK的专辑作者。结果如下：
		MySaxDemo.main characters()  Bonnie Tyler
		MySaxDemo.main characters()  Gary Moore
		MySaxDemo.main characters()  Bee Gees
	 */
	private static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args) throws Exception {
		
		//1.创建SAX解析工厂
		SAXParserFactory spFactory = SAXParserFactory.newInstance();
		
		//2.通过解析工厂得到解析对象
		SAXParser sParser = spFactory.newSAXParser();
		
		//3.通过解析对象得到一个XML的读取器
		XMLReader xmlReader = sParser.getXMLReader();
		
		//4.设置读取器的事件处理
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
				if(temp.equals("ARTIST") && (flag%2==0)){			//这里判断flag是为了跳过</ARTIST>
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
		
		//5.解析xml文件
		xmlReader.parse("cd.xml");

	}

}
