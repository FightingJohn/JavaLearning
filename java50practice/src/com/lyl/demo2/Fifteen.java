package com.lyl.demo2;

import java.util.Scanner;

public class Fifteen {

	/**
	 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
		程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，
		如果x>y则将x与y的值进行交换，然后再用x与z进行比较，
		如果x>z则将x与z的值进行交换，这样能使x最小。
	 */
	public static void main(String[] args) {
		
		System.out.print("输入三个整数");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = a > (b > c ?b:c) ?a:(b > c ?b:c);
		int min = a > (b > c ?c:b) ?(b > c ?c:b):a;
		if(a <= max && a >= min)
			System.out.println("这三个数从小到大依次为： "+ min+" "+a+" "+max);
		else if(b <= max && b >= min)
			System.out.println("这三个数从小到大依次为： "+ min+" "+b+" "+max);
		else if(c <= max && c >= min)
			System.out.println("这三个数从小到大依次为： "+ min+" "+a+" "+max);
		else
			System.out.println("程序存在异常！");
		
		scan.close();

	}

}
