package com.lyl.demo2;

import java.util.Scanner;

public class Nineteen {

	/**
	 * ��ӡ����
	 */
	public static void main(String[] args) {

		System.out.print("�����ӡ���ε���������������");
		Scanner scan = new Scanner(System.in);
		int rowSum = scan.nextInt();
		scan.close();

		// mothed1(rowSum);
		//��ӡ�ϰ벿��
		for (int i = 0; i < rowSum; i++) {
			for (int j = 0; j < 2 * rowSum; j++) {
				if (j < rowSum - i)
					System.out.print(" ");
				if (j >= rowSum - i && j <= rowSum + i)
					System.out.print("*");
			}
			System.out.println();
		}
		// ��ӡ�°벿��
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
		// ��ʾ���ε��ϰ벿��
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
