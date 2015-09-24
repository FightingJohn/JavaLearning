package com.lyl.demo2;

import java.util.Scanner;

public class Nineteen {

	/**
	 * 打印菱形
	 */
	public static void main(String[] args) {

		System.out.print("输入打印菱形的行数（奇数）：");
		Scanner scan = new Scanner(System.in);
		int rowSum = scan.nextInt();
		scan.close();

		// mothed1(rowSum);
		//打印上半部分
		for (int i = 0; i < rowSum; i++) {
			for (int j = 0; j < 2 * rowSum; j++) {
				if (j < rowSum - i)
					System.out.print(" ");
				if (j >= rowSum - i && j <= rowSum + i)
					System.out.print("*");
			}
			System.out.println();
		}
		// 打印下半部分
		for (int i = 1; i < rowSum; i++) {
			System.out.print(" ");
			for (int j = 0; j < 2 * rowSum - i; j++) {
				if (j < i)
					System.out.print(" ");
				if (j >= i && j < 2 * rowSum - i - 1)
					System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void mothed1(int rowSum) {
		// 表示菱形的上半部分
		int half = rowSum / 2 + 1;
		for (int i = 1; i <= rowSum; i++) {
			if (i <= half) {
				for (int j = 0; j < half - i; j++)
					System.out.print(" ");
				for (int j = 0; j < i; j++)
					System.out.print("* ");
			} else {
				for (int j = 0; j < (i - half); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * half - i); j++)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
