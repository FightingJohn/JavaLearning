package com.lyl.demo;

import java.util.Scanner;

public class FiveDemo {

	/**
	 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
	 */
	public static void main(String[] args) {
		
		System.out.println("请输入学生成绩：");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		if(score > 100)
			System.out.println("输入成绩无效！");
		else if(score >= 90)
			System.out.println("成绩为 A");
		else if(score >= 60)
			System.out.println("成绩为 B");
		else if(score >= 0)
			System.out.println("成绩为 C");
		else
			System.out.println("输入成绩无效！");

		scan.close();
	}

}
