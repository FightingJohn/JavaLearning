package com.lyl.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.lyl.constructor.Student;

public class FieldDemo {

	/**
	 * 通过反射获取成员变量并使用
	 */
	public static void main(String[] args) {
		
		
		try {
			//获得Student类的Class对象
			Class studentClass = Class.forName("com.lyl.constructor.Student");
			Student student = (Student) studentClass.getConstructor
					(String.class, int.class, String.class).newInstance("lyl",23,"female");
			
			//获得所有的public成员
			Field[] publicFeilds = studentClass.getFields();
			print("-------public fields---------");
			for (Field field : publicFeilds) {
				print(field);
			}
			
			//获得所有的所有的成员
			Field[] allFeilds = studentClass.getDeclaredFields();
			print("-------all fields---------");
			for (Field field : allFeilds) {
				print(field);
			}
			
			//获得某个的public成员
			Field publicFeildOne = studentClass.getField("name");
			print("-------one public field---------");
			
			print(publicFeildOne);
			//打印实例中对应的这个成员,打印后改变它的值
			String name = (String) publicFeildOne.get(student);
			print(name);
			//改变name变量的值
			publicFeildOne.set(student, "mike");
			String name2 = (String) publicFeildOne.get(student);
			print(name2);
			
			//获得某个成员
			Field FeildOne = studentClass.getDeclaredField("gender");
			print("-------one field---------");
			
			print(FeildOne);
			//打印实例中对应的这个成员,打印后改变它的值
			FeildOne.setAccessible(true);
			String gender = (String) FeildOne.get(student);
			print(gender);
			//改变name变量的值
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
