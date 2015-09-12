package com.lyl.demo;

import java.util.Scanner;

public class EightDemo {

	/**
	 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
	 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 
	 */
	public static void main(String[] args) {
	
		long sum = 0;			//每个数
		long result = 0;		//和
		Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入两个整数：");
		int num = scan.nextInt();
		int cycleNum = scan.nextInt();
		for(int i = 1; i <= cycleNum; i++){
			sum += num;
			result += sum;
			
			if(i==cycleNum)
				System.out.print(sum+"=");
			else
				System.out.print(sum+"+");
			num *= 10;
		}
		System.out.println(result);
		
		//关闭流
		scan.close();
	}

}
