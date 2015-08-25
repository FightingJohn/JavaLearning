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
		
		//创建DOM解析器工厂
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		//得到DOM解析对象
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		
		//得到代表文档的document对象
		Document document = dBuilder.parse("exam.xml");
		
		//1. 向该xml文档里添加一个用户，姓名：王五，；location：铁岭；grade：99
		print("------------任务1------------");
		Element newStu = document.createElement("student");
		newStu.setAttribute("idcard", "555");							//添加一个新属性
		newStu.setAttribute("examid", "666");
		
		Element newName = document.createElement("name");				//创建student的子元素
		newName.setTextContent("王五");	
		Element newLocation = document.createElement("location");
		newLocation.setTextContent("铁岭");
		Element newGrade = document.createElement("grade");
		newGrade.setTextContent("99");
		
		newStu.appendChild(newName);
//		newStu.appendChild(newline1);									//如何添加换行元素
		newStu.appendChild(newLocation);
		newStu.appendChild(newGrade);
		
		document.getElementsByTagName("exam").item(0).appendChild(newStu);//把新的student元素插到末尾
		
		//2. 给每个学生增加一条信息，性别。
		print("------------任务2------------");
		NodeList studentsNode = document.getElementsByTagName("student");
		for(int i = 0; i<studentsNode.getLength(); i++){
			Element sexNode = document.createElement("性别");
			sexNode.setTextContent("男");
			studentsNode.item(i).appendChild(sexNode);
		}
		
		//. 删除第一个学生张三的所有信息。
		print("------------任务3------------");
		document.getElementsByTagName("exam").item(0).removeChild(studentsNode.item(0));
		
		//4. 将第二个学生李四的姓名改为 李四光
		print("------------任务4------------");
		studentsNode.item(0).getChildNodes().item(1).setTextContent("李四光");
		
		//5. 给每个学生增加一个ID属性。
		print("------------任务5------------");
		for(int i = 0; i<studentsNode.getLength(); i++){
			((Element) studentsNode.item(i)).setAttribute("ID", ""+i);						//能不能有不用强制转换类型的方法
		}
		
		//将内存里面的document代表的dom树 写回到硬盘上的标准做法
		TransformerFactory tsf =TransformerFactory.newInstance();
		Transformer tsTransformer = tsf.newTransformer();
	//	tsTransformer.setOutputProperty(OutputKeys.ENCODING, "GBK");
		tsTransformer.transform(
		new DOMSource(document), 
		new StreamResult("exam1.xml"));
		print("从内存写入硬盘成功！");

	}

}
