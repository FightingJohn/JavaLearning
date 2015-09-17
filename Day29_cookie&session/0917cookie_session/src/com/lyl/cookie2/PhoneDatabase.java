package com.lyl.cookie2;

import java.util.HashMap;
/**
 * 
 * @author ľľ
 * �洢���е��ֻ���Ϣ
 */
public class PhoneDatabase {
	
	private static HashMap<String, Cellphone> allPhones =
			new HashMap<String, Cellphone>();
	//�����ֻ���Ϣ
	static{
		
		Cellphone cp1 = 
				new Cellphone("1", "ƻ���ֻ�", "6888", "pink", "4G", "8G");
		Cellphone cp2 = 
				new Cellphone("2", "��Ϊ�ֻ�", "4999", "white", "4G", "16G");
		Cellphone cp3 = 
				new Cellphone("3", "�����ֻ�", "5889", "black", "4G", "16G");
		Cellphone cp4 = 
				new Cellphone("4", "oppo�ֻ�", "3229", "blue", "2G", "32G");
		
		//��ӵ�map��
		allPhones.put("1", cp1);
		allPhones.put("2", cp2);
		allPhones.put("3", cp3);
		allPhones.put("4", cp4);
		
	}
	
	//���map����
	public static HashMap<String, Cellphone> getAllPhones(){
		
		return allPhones;
	}
	
	//����map��keyֵ���value
	public static Cellphone getOnePhone(String id){
		
		return allPhones.get(id);
	}

}
