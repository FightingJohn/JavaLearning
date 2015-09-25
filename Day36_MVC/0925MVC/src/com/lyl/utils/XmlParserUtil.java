package com.lyl.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlParserUtil {
	
	private static String path = 
			"D:\\MyEclipse Project\\.metadata\\.me_tcat7\\webapps\\0925MVC\\xml\\users.xml";
	
	private XmlParserUtil(){}
	
	public static Document getDoucument(){
		
		Document document = null;
		SAXReader sReader = new SAXReader();
		try {
			document = sReader.read(path);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return document;
	}
	
	//把修改写回目标文件
	public static void writeBackXml(Document document){
		
		OutputFormat outputFormat = OutputFormat.createPrettyPrint();
		outputFormat.setEncoding("GBK");
		XMLWriter writer;
		try {
			writer = new XMLWriter(new FileOutputStream(path), outputFormat);
			writer.write(document);
			writer.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
