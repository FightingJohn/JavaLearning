package com.lyl.cookie2;

import java.util.HashMap;
/**
 * 
 * @author 木木
 * 存储所有的手机信息
 */
public class PhoneDatabase {
	
	private static HashMap<String, Cellphone> allPhones =
			new HashMap<String, Cellphone>();
	//所以手机信息
	static{
		
		Cellphone cp1 = 
				new Cellphone("1", "苹果手机", "6888", "pink", "4G", "8G");
		Cellphone cp2 = 
				new Cellphone("2", "华为手机", "4999", "white", "4G", "16G");
		Cellphone cp3 = 
				new Cellphone("3", "三星手机", "5889", "black", "4G", "16G");
		Cellphone cp4 = 
				new Cellphone("4", "oppo手机", "3229", "blue", "2G", "32G");
		
		//添加到map中
		allPhones.put("1", cp1);
		allPhones.put("2", cp2);
		allPhones.put("3", cp3);
		allPhones.put("4", cp4);
		
	}
	
	//获得map对象
	public static HashMap<String, Cellphone> getAllPhones(){
		
		return allPhones;
	}
	
	//根据map的key值获得value
	public static Cellphone getOnePhone(String id){
		
		return allPhones.get(id);
	}

}
