package com.lyl.demo2;

import java.util.Scanner;

public class Fourteen {

	/**
	 * 输入某年某月某日，判断这一天是这一年的第几天？程序分析：以3月5日为例，
	 * 应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，
	 * 闰年且输入月份大于3时需考虑多加一天
	 * 分析：闰年——1，能被4整除同时不能被100整除的年份。2，能被400整除
	 */
	public static void main(String[] args) {
		
		int result = 0;				//程序运行结果
		//代表平年第几个月时，对应的第几天
		int[] months = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("输入年份：");
		int year = scan.nextInt();
		System.out.print("输入年份：");
		int month = scan.nextInt();
		System.out.print("输入年份：");
		int day = scan.nextInt();
		
		//判断是否为闰年
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			result = 1;
		result = result + months[month] + day;
		
		System.out.println(year +"年"+ month +"月"+ day +"日 是本年的第 "+ result +" 天");
		
		scan.close();

	}

}
