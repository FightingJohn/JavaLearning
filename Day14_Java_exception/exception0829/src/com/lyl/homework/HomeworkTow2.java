package com.lyl.homework;

public class HomeworkTow2 {

	/**
	 * 类转型异常处理（ClassCastException）
	 */
	public static void main(String[] args) {
		
		Father f = new Father();
		Child c = null;
		try {
			
			c = (Child)f;		//不安全的向下转型
			return;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			c = new Child();
		} finally {
			
			System.out.println("这是作业2-2(try 内含有return)的finally");
			
		}
		
		c.print();
		System.out.println("over");
	}
}

//父类
class Father{
	
	void print(){
		System.out.println("这是父类 ");
	}
}

//子类
class Child extends Father{
	
	void print(){
		System.out.println("这是子类  ");
	}
}