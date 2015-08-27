package com.lyl.OO;

public class HomeworkThree {

	/**
	 * 函数重载
	 */
	public static void main(String[] args) {
		
		String str1 = "1234";
		String str2 = "5678";
		System.out.println("测试传入字符串：");
		connect(str1, str2);
		System.out.println("测试传入整数：");
		connect(Integer.parseInt(str1), Integer.parseInt(str2));
		System.out.println("测试传入浮点数：");
		connect(Float.parseFloat(str1), Float.parseFloat(str2));
		

	}
	
	//重载1，形参为字符串类型
	public static void connect(String str1, String str2){
		
		System.out.println(str1 + str2);
	}
	
	//重载2，形参为整数
	public static void connect(int i1, int i2){
		
		System.out.println(i1 + i2 + "");
	}
	
	//重载3，形参为浮点
	public static void connect(float f1, float f2){
		
		System.out.println(f1 + f2 + "");
	}

}
