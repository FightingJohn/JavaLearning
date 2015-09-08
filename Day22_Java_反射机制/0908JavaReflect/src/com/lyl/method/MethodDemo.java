package com.lyl.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.lyl.constructor.Student;

public class MethodDemo {

	/**
	 * 通过反射获取成员方法并使用
	 */
	public static void main(String[] args) {
		
		try {
			//获得Student类的Class对象
			Class studentClass = Class.forName("com.lyl.constructor.Student");
			//初始化一个对象
			Student student = (Student) studentClass.getConstructor
					(String.class, int.class, String.class).newInstance("lyl",23,"female");
			
			//获得Student类中所有的public方法(包括父类的)
			Method[] publicMethods = studentClass.getMethods();
			print("---------public methods--------");
			for (Method method : publicMethods) {
				print(method);
			}
			
			//获得Student类中所有的方法(不包括父类的)
			Method[] allMethods = studentClass.getDeclaredMethods();
			print("---------all methods--------");
			for (Method method : allMethods) {
				print(method);
			}
			
			//获得Student类中某个public方法
			Method publicMethodOne = studentClass.getMethod("getGender");
			print("---------one public methods--------");
			
			print(publicMethodOne);
			//使用这个方法
			String gender = (String) publicMethodOne.invoke(student);
			print(gender);
			
			//获得Student类中某个方法
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
