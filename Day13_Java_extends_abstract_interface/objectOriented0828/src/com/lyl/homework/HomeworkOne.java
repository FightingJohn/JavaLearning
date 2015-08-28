package com.lyl.homework;


public class HomeworkOne {

	/**
	 * 继承中，子类和父类的构造方法
	 */
	public static void main(String[] args) {
		
		new Son();

	}

}

//父类
class Father{
	
	//父类无参构造方法
	public Father(){
		System.out.println("Father()");
	}
	
	//父类有参构造方法
	public Father(int i, int j){
		System.out.println("Father(int i, int j)");
	}
}

//子类
class Son extends Father{
	
	private int k ;
	
	//子类无参构造方法
	public Son(){
//		k = 0;
//		super(0, 0);
		 k = 0;
		System.out.println("Son()" + k);
	}
}