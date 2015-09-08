package com.lyl.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstuctorDemo {

	/**
	 * 通过反射获取构造方法并使用
	 */
	public static void main(String[] args) {
		
		try {
			//获得Student类的Class对象
			Class studentClass = Class.forName("com.lyl.constructor.Student");
			
			//获得所有的public构造方法
			Constructor[] constuctorsPublic = studentClass.getConstructors();
			print("----------------public constructors----------");
			for (Constructor constructor : constuctorsPublic) {
				
				print(constructor);
			}
			
			//获得所有的构造方法
			Constructor[] constuctorsAll = studentClass.getDeclaredConstructors();
			print("----------------all constructors----------");
			for (Constructor constructor : constuctorsAll) {
				
				print(constructor);
			}
			
			//获得指定的某个public构造方,int.class设计到自动装箱/拆箱机制
			Constructor constuctorsOne = studentClass.getConstructor(String.class, int.class, String.class);
			print("----------------one public constructor----------");
				
			print(constuctorsOne);
			//创建对象
			Student student1 = (Student) constuctorsOne.newInstance("kangkang", 20, "female");
			print(student1.toString());
			
			//获得指定的某个private构造方
			Constructor constuctorPrivate = studentClass.getDeclaredConstructor(String.class);
			print("----------------one private constructor----------");
				
			print(constuctorPrivate);
			//创建对象
			constuctorPrivate.setAccessible(true);				//设置为合法的存取
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
