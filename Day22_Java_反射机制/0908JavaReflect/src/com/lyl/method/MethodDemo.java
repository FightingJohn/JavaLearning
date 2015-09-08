package com.lyl.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.lyl.constructor.Student;

public class MethodDemo {

	/**
	 * ͨ�������ȡ��Ա������ʹ��
	 */
	public static void main(String[] args) {
		
		try {
			//���Student���Class����
			Class studentClass = Class.forName("com.lyl.constructor.Student");
			//��ʼ��һ������
			Student student = (Student) studentClass.getConstructor
					(String.class, int.class, String.class).newInstance("lyl",23,"female");
			
			//���Student�������е�public����(���������)
			Method[] publicMethods = studentClass.getMethods();
			print("---------public methods--------");
			for (Method method : publicMethods) {
				print(method);
			}
			
			//���Student�������еķ���(�����������)
			Method[] allMethods = studentClass.getDeclaredMethods();
			print("---------all methods--------");
			for (Method method : allMethods) {
				print(method);
			}
			
			//���Student����ĳ��public����
			Method publicMethodOne = studentClass.getMethod("getGender");
			print("---------one public methods--------");
			
			print(publicMethodOne);
			//ʹ���������
			String gender = (String) publicMethodOne.invoke(student);
			print(gender);
			
			//���Student����ĳ������
			Method MethodOne = studentClass.getDeclaredMethod("setName",String.class);
			
			print("---------one methods--------");
			print(MethodOne);
			MethodOne.setAccessible(true);
			MethodOne.invoke(student, "hahaha");
			print(student.toString());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
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
	
	private static void print(Object obj){
		System.out.println(obj);
	}

}
