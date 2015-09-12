package com.lyl.demo;

import java.util.Scanner;

public class FourDemo {

	/**
	 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个大于2的正整数：");
		int i = scan.nextInt();
		
		String str = "";			//存放输出结果
		//获得某个数的所有质因数
		for(int j = 2; j <= i; j++){
			
			if(i % j == 0){
				str = str + j + "*";
				i = i / j;
				j=2;
			}
		}
		
		//截取str字符串，从开始到倒数第二位 
		String result = str.substring(0, str.length()-1);
		System.out.println(result);
		scan.close();		//释放资源

	}


}
