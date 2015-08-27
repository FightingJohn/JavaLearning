package com.lyl.OO;

public class HomeworkOne {
	/**
	 * 引用传递和值传递
	 */
	public static void main(String[] args) {

		Demo demo1 = new Demo(1);
		Demo demo2 = new Demo(2);
		System.out.println("交换前--------------");
		System.out.println("demo1.a = "+ demo1.a);
		System.out.println("demo2.a = "+ demo2.a);
		//调用方法一测试
//		swap1(demo1, demo2);
		
		//调用方法二测试
		swap2(demo1, demo2);
		System.out.println("交换后--------------");
		System.out.println("demo1.a = "+ demo1.a);
		System.out.println("demo2.a = "+ demo2.a);
	}
	
	//方法一，交换两个对象中成员变量的值
	public static void swap1(Demo d1, Demo d2){
		int temp = d1.a;
		d1.a = d2.a;
		d2.a = temp;
	}
	
	//方法二，交换两个对象的值
	public static void swap2(Demo d1, Demo d2){
		Demo temp = d1;
		d1 = d2;
		d2 = temp;
	}

}

//定义一个缺省类
class Demo{
	
	//定义成员变量
	int a;
	//有参构造方法
	public Demo(int a){
		this.a = a;
	}	
}
