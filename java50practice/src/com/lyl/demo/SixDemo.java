package com.lyl.demo;

import java.util.Scanner;

public class SixDemo {

	/**
	 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
	 * 分析：用辗转相除法求两个数的最大公约数，两个数的乘积除以最大公约数得到最小公倍数
	 */
	public static void main(String[] args) {
		
		int res ;
		System.out.println("输入两个正整数：");
		Scanner scan = new Scanner(System.in);
		
		int one = scan.nextInt();
		int tow = scan.nextInt();
		
		int max = one > tow ? one : tow;
		int min = one > tow ? tow : one;
		res = max % min;
		while (res != 0){
			max = min;
			min = res;
			res = max % min;
		}
		System.out.println(one + "和" + tow +"的最大公约数为："+min);
		System.out.println(one + "和" + tow +"的最小公倍数为："+one*tow/min);
		
		scan.close();

	}

}
