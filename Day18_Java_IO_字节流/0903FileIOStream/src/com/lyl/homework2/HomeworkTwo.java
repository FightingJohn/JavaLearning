package com.lyl.homework2;

public class HomeworkTwo {

	/**
	 * 递归求斐波那契数列的第n项值.斐波那契数列数列：0、1、1、2、3、5、8、13、21、34、……
	 * 以递归的方法定义：F（0）=0，F（1）=1，F（n）=F(n-1)+F(n-2)（n≥2，n∈N*）
	 */
	public static void main(String[] args) {
		
		//斐波那契数列的第n项值
		System.out.println("斐波那契数列的第 30 项值是：" + FibonacciSeq(30-1));

	}
	
	//斐波那契数列函数
	private static int FibonacciSeq(int n){
		
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return FibonacciSeq(n-1) + FibonacciSeq(n-2);
	}

}
