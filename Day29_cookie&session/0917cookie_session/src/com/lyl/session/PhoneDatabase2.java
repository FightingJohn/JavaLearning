package com.lyl.session;

import java.util.HashMap;
/**
 * 
 * @author 木木
 * 存储所有的手机信息
 */
public class PhoneDatabase2 {
	
	private static HashMap<String, Cellphone2> allPhones =
			new HashMap<String, Cellphone2>();
	//所以手机信息
	static{
		
		Cellphone2 cp1 = 
				new Cellphone2("1", "苹果手机", "6888", "pink", "4G", "8G");
		Cellphone2 cp2 = 
				new Cellphone2("2", "华为手机", "4999", "white", "4G", "16G");
		Cellphone2 cp3 = 
				new Cellphone2("3", "三星手机", "5889", "black", "4G", "16G");
		Cellphone2 cp4 = 
				new Cellphone2("4", "oppo手机", "3229", "blue", "2G", "32G");
		
		//添加到map中
		allPhones.put("1", cp1);
		allPhones.put("2", cp2);
		allPhones.put("3", cp3);
		allPhones.put("4", cp4);
		
	}
	
	//获得map对象
	public static HashMap<String, Cellphone2> getAllPhones(){
		
		return allPhones;
	}
	
	//根据map的key值获得value
	public static Cellphone2 getOnePhone(String id){
		
		return allPhones.get(id);
	}

}
