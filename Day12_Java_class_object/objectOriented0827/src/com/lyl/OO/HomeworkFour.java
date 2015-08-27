package com.lyl.OO;

public class HomeworkFour {

	/**
	 * 构造函数
	 */
	//无参构造方法
	public HomeworkFour(){
		
		System.out.print("HomeworkFour()");
	}
	
	//带有一个参数的有参构造函数
	public HomeworkFour(String str){
		
		this();
		System.out.print(" " + str + " ");
	}
	
	//带有两个参数的构造方法1
	public HomeworkFour(String str, int i){
		this();
		System.out.println(str + i);
	}
	
	//带有两个参数的构造方法2
	public HomeworkFour(int i, String str){
		this("lalall");
		System.out.println(i + str);
	}
	
	public static void main(String[] args) {

//		new HomeworkFour();
//		new HomeworkFour("hello");
		new HomeworkFour("hahaha", 3);
		new HomeworkFour(4, "hehhehheh");

	}

}
