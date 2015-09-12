package com.lyl.demo;

public class NineDemo {

	/**
	 * 一个自然数如果恰好等于它的因子之和，这个自然数就称为"完数"。
	 * 例如6=1＋2＋3.编程找出1000以内的所有完数。
	 */
	public static void main(String[] args) {
		
		System.out.print("1000以内的完数有：1    ");
		//遍历1000以内的数
		for(int num = 1; num <= 1000; num++){
			//求一个自然数除去本身的因子数之和
			int sum = 0;				//一个数的所有真因子的和
			for(int i = 1; i <= num/2; i++){
				if(num % i == 0)
					sum+=i;
			}
			if(sum == num)
				System.out.print(num+"\t");
		}

	}

}
