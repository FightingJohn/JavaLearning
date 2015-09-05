package com.lyl.homework1;

public class Recursion {

	/**
	 * 递归，打印某个整数的阶乘
	 */
	public static void main(String[] args) {

		//打印5的阶乘
		System.out.print("5的阶乘为：" + function(5));

	}
	
	//阶乘函数
	private static int function(int i){
		
		//递归的出口
		if(i == 1){
			return 1;
		}
		
		return i * function(i-1);
	}

}
