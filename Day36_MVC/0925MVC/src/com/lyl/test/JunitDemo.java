package com.lyl.test;

import org.junit.Test;

import com.lyl.bean.User;
import com.lyl.dao.SaveDataInference;
import com.lyl.daoImpl.SaveToXml;

/**
 * java单元测试，局部的测试，不用每次启动服务器
 * @author 木木
 *
 */

public class JunitDemo {
	
	@Test
	public void testSaveData(){
		
		User user = new User("hehe","123","abc@sina.com");
		SaveDataInference saveToXml = new SaveToXml();
		saveToXml.saveData(user);
		System.out.println("testSaveData() is over");
	}
	
	@Test
	public void testFindUsername(){
		
		SaveDataInference saveToXml = new SaveToXml();
		boolean result = saveToXml.findUsername("ly");
		System.out.println("testFindUsername() is over result = " + result);
	}
	
	@Test
	public void testFindUser(){
		
		SaveDataInference saveToXml = new SaveToXml();
		boolean result2 = saveToXml.findUser("hehe","12");
		System.out.println("testFindUser() is over result = " + result2);
	}

}
