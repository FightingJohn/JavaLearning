package com.lyl.OO;

public class HomeworkSix {

	/**
	 * 值传递和引用传递的区别
	 */
	public static void main(String[] args) {
		//初始化int型变量和数组第一个数为0
		int a = 0;
		int[] arr = {0};
		
		System.out.println("调用函数之前：");
		System.out.println("a = " + a);
		System.out.println("arr[0] = "+ arr[0]);
		
		passValue(a);					//值传递
		passRefrence(arr);				//引用传递
		
		System.out.println("调用函数之后：");
		System.out.println("值传递：a = " + a);
		System.out.println("引用传递：arr[0] = "+ arr[0]);

	}
	
	//值传递测试函数
	public static void passValue(int a){
		a = 20;
	}
	
	//测试引用传递
	public static void passRefrence(int[] arr){
		arr[0] = 20;
	}

}
