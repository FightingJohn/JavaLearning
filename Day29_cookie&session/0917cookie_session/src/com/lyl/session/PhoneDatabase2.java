package com.lyl.session;

import java.util.HashMap;
/**
 * 
 * @author ľľ
 * �洢���е��ֻ���Ϣ
 */
public class PhoneDatabase2 {
	
	private static HashMap<String, Cellphone2> allPhones =
			new HashMap<String, Cellphone2>();
	//�����ֻ���Ϣ
	static{
		
		Cellphone2 cp1 = 
				new Cellphone2("1", "ƻ���ֻ�", "6888", "pink", "4G", "8G");
		Cellphone2 cp2 = 
				new Cellphone2("2", "��Ϊ�ֻ�", "4999", "white", "4G", "16G");
		Cellphone2 cp3 = 
				new Cellphone2("3", "�����ֻ�", "5889", "black", "4G", "16G");
		Cellphone2 cp4 = 
				new Cellphone2("4", "oppo�ֻ�", "3229", "blue", "2G", "32G");
		
		//��ӵ�map��
		allPhones.put("1", cp1);
		allPhones.put("2", cp2);
		allPhones.put("3", cp3);
		allPhones.put("4", cp4);
		
	}
	
	//���map����
	public static HashMap<String, Cellphone2> getAllPhones(){
		
		return allPhones;
	}
	
	//����map��keyֵ���value
	public static Cellphone2 getOnePhone(String id){
		
		return allPhones.get(id);
	}

}
