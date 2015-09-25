package com.lyl.daoImpl;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;

import com.lyl.bean.User;
import com.lyl.dao.SaveDataInference;
import com.lyl.utils.XmlParserUtil;

public class SaveToXml implements SaveDataInference {

	//�������ݵ�ָ���ļ���
	public boolean saveData(User user) {
		
		boolean flag = false;		//��Ϊд���Ƿ�ɹ��ı�ǣ�д��ɹ�true������false
		
		//ʹ�ù�����õ�document
		Document document = XmlParserUtil.getDoucument();
		if(document != null){
			Element root = document.getRootElement();
			
			//���user�ڵ�,���Ѵ����user��Ϣ��ӵ�user�ڵ��������
			Element userEle = root.addElement("user");
			userEle.addAttribute("username", user.getUsername());
			userEle.addAttribute("password", user.getPassword());
			userEle.addAttribute("email", user.getEmail());
			
			//д��xml�ļ���
			XmlParserUtil.writeBackXml(document);
			flag = true;
		}
		
		return flag;
		
	}


	public boolean findUsername(String username) {
		
		boolean flag = false;		//��Ϊд���Ƿ�ɹ��ı�ǣ�д��ɹ�true������false
		
		//ʹ�ù�����õ�document
		Document document = XmlParserUtil.getDoucument();
		if(document != null){
			Element root = document.getRootElement();
			//��ø��ڵ�������ӽڵ�
			List<Element> elements = root.elements();
			//�����ӽڵ������username����,��username����ƥ��
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
		
		boolean flag = false;		//��Ϊд���Ƿ�ɹ��ı�ǣ�д��ɹ�true������false
		
		//ʹ�ù�����õ�document
		Document document = XmlParserUtil.getDoucument();
		if(document != null){
			Element root = document.getRootElement();
			//��ø��ڵ�������ӽڵ�
			List<Element> elements = root.elements();
			//�����ӽڵ������username��password����,��username��password����ƥ��
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
