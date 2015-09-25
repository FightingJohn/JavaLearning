package com.lyl.daoImpl;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;

import com.lyl.bean.User;
import com.lyl.dao.SaveDataInference;
import com.lyl.utils.XmlParserUtil;

public class SaveToXml implements SaveDataInference {

	//保存数据到指定文件内
	public boolean saveData(User user) {
		
		boolean flag = false;		//作为写入是否成功的标记，写入成功true，否则false
		
		//使用工具类得到document
		Document document = XmlParserUtil.getDoucument();
		if(document != null){
			Element root = document.getRootElement();
			
			//添加user节点,并把传入的user信息添加到user节点的属性中
			Element userEle = root.addElement("user");
			userEle.addAttribute("username", user.getUsername());
			userEle.addAttribute("password", user.getPassword());
			userEle.addAttribute("email", user.getEmail());
			
			//写回xml文件中
			XmlParserUtil.writeBackXml(document);
			flag = true;
		}
		
		return flag;
		
	}


	public boolean findUsername(String username) {
		
		boolean flag = false;		//作为写入是否成功的标记，写入成功true，否则false
		
		//使用工具类得到document
		Document document = XmlParserUtil.getDoucument();
		if(document != null){
			Element root = document.getRootElement();
			//获得根节点的所有子节点
			List<Element> elements = root.elements();
			//遍历子节点的所有username属性,与username进行匹配
			if(elements != null){
				for (Element element : elements) {
					if(username.equals(element.attribute("username").getValue())){
							flag = true;
							break;
					}
					
				}
			}
			
		}
		
		return flag;
	}


	public boolean findUser(String username, String password) {
		
		boolean flag = false;		//作为写入是否成功的标记，写入成功true，否则false
		
		//使用工具类得到document
		Document document = XmlParserUtil.getDoucument();
		if(document != null){
			Element root = document.getRootElement();
			//获得根节点的所有子节点
			List<Element> elements = root.elements();
			//遍历子节点的所有username和password属性,与username和password进行匹配
			if(elements != null){
				for (Element element : elements) {
					if(username.equals(element.attribute("username").getValue())&&
							password.equals(element.attribute("password").getValue())){
							flag = true;
							break;
					}
				}
			}
			
		}
		
		return flag;
	}

}
