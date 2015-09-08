package com.lyl.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class MainDemo {

	/**
	 * ProPerties���Լ����䷴�����ʹ��
	 */
	public static void main(String[] args) {
		
		//����һ����Ĭ��ֵ�Ŀ������б�
		Properties properties = new Properties();
		
		try {
			//�����ļ��ַ�������
			FileReader fileReader = new FileReader("config.txt");
			
			//���������ж�ȡ�����б�
			properties.load(fileReader);
			
			//ͨ��ָ�����������б��ö�Ӧ������
			String className = properties.getProperty("class");
			String methodName = properties.getProperty("method");
			
			//������������ʵ��
			Class oneClass = Class.forName("com.lyl.properties.Student");
			Object obj = oneClass.getConstructor().newInstance();
			//���ݷ�������÷���
			Method oneMethod = oneClass.getMethod(methodName);
			//���÷���
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
		} catch (IllegalAccessException e) {//�Ƿ���ȡ
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
