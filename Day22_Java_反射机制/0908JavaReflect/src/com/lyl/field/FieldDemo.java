package com.lyl.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.lyl.constructor.Student;

public class FieldDemo {

	/**
	 * ͨ�������ȡ��Ա������ʹ��
	 */
	public static void main(String[] args) {
		
		
		try {
			//���Student���Class����
			Class studentClass = Class.forName("com.lyl.constructor.Student");
			Student student = (Student) studentClass.getConstructor
					(String.class, int.class, String.class).newInstance("lyl",23,"female");
			
			//������е�public��Ա
			Field[] publicFeilds = studentClass.getFields();
			print("-------public fields---------");
			for (Field field : publicFeilds) {
				print(field);
			}
			
			//������е����еĳ�Ա
			Field[] allFeilds = studentClass.getDeclaredFields();
			print("-------all fields---------");
			for (Field field : allFeilds) {
				print(field);
			}
			
			//���ĳ����public��Ա
			Field publicFeildOne = studentClass.getField("name");
			print("-------one public field---------");
			
			print(publicFeildOne);
			//��ӡʵ���ж�Ӧ�������Ա,��ӡ��ı�����ֵ
			String name = (String) publicFeildOne.get(student);
			print(name);
			//�ı�name������ֵ
			publicFeildOne.set(student, "mike");
			String name2 = (String) publicFeildOne.get(student);
			print(name2);
			
			//���ĳ����Ա
			Field FeildOne = studentClass.getDeclaredField("gender");
			print("-------one field---------");
			
			print(FeildOne);
			//��ӡʵ���ж�Ӧ�������Ա,��ӡ��ı�����ֵ
			FeildOne.setAccessible(true);
			String gender = (String) FeildOne.get(student);
			print(gender);
			//�ı�name������ֵ
			FeildOne.set(student, "male");
			String gender2 = (String) FeildOne.get(student);
			print(gender2);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
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
		}

	}
	
	private static void print(Object obj){
		System.out.println(obj);
	}

}
