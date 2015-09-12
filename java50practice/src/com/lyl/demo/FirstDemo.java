package com.lyl.demo;

public class FirstDemo {

	/**
	 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
	 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？ 
	 * 分析：每个月兔子的对数  ： 1， 1， 2， 3， 5， 8， 13
	 * 类似于斐波那契数列数列列f(n) = f(n-1) + f(n-2)(n>=2, n属于正整数)
	 */
	public static void main(String[] args) {
		
		System.out.println("第 10 天的兔子个数为：" + fun(10));

	}

	private static int fun(int n) {
		
		if(n==1 || n==2){
			return 1;
		}
		else
			return fun(n-1) + fun(n-2);
	}

}
