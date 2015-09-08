package com.lyl.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class MainDemo {

	/**
	 * ProPerties属性集搭配反射机制使用
	 */
	public static void main(String[] args) {
		
		//创建一个无默认值的空属性列表
		Properties properties = new Properties();
		
		try {
			//创建文件字符输入流
			FileReader fileReader = new FileReader("config.txt");
			
			//从输入流中读取属性列表
			properties.load(fileReader);
			
			//通过指定键在属性列表获得对应的属性
			String className = properties.getProperty("class");
			String methodName = properties.getProperty("method");
			
			//根据类名建立实例
			Class oneClass = Class.forName("com.lyl.properties.Student");
			Object obj = oneClass.getConstructor().newInstance();
			//根据方法名获得方法
			Method oneMethod = oneClass.getMethod(methodName);
			//调用方法
			oneMethod.invoke(obj);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {//非法存取
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
