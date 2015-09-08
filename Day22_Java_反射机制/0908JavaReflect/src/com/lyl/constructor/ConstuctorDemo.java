package com.lyl.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstuctorDemo {

	/**
	 * ͨ�������ȡ���췽����ʹ��
	 */
	public static void main(String[] args) {
		
		try {
			//���Student���Class����
			Class studentClass = Class.forName("com.lyl.constructor.Student");
			
			//������е�public���췽��
			Constructor[] constuctorsPublic = studentClass.getConstructors();
			print("----------------public constructors----------");
			for (Constructor constructor : constuctorsPublic) {
				
				print(constructor);
			}
			
			//������еĹ��췽��
			Constructor[] constuctorsAll = studentClass.getDeclaredConstructors();
			print("----------------all constructors----------");
			for (Constructor constructor : constuctorsAll) {
				
				print(constructor);
			}
			
			//���ָ����ĳ��public���췽,int.class��Ƶ��Զ�װ��/�������
			Constructor constuctorsOne = studentClass.getConstructor(String.class, int.class, String.class);
			print("----------------one public constructor----------");
				
			print(constuctorsOne);
			//��������
			Student student1 = (Student) constuctorsOne.newInstance("kangkang", 20, "female");
			print(student1.toString());
			
			//���ָ����ĳ��private���췽
			Constructor constuctorPrivate = studentClass.getDeclaredConstructor(String.class);
			print("----------------one private constructor----------");
				
			print(constuctorPrivate);
			//��������
			constuctorPrivate.setAccessible(true);				//����Ϊ�Ϸ��Ĵ�ȡ
			Student student2 = (Student) constuctorPrivate.newInstance("lily");
			print(constuctorPrivate.toString());
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
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
		}

	}
	
	private static void print(Object obj){
		System.out.println(obj);
	}

}
