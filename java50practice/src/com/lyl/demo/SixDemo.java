package com.lyl.demo;

import java.util.Scanner;

public class SixDemo {

	/**
	 * ��������������m��n���������Լ������С��������
	 * ��������շת������������������Լ�����������ĳ˻��������Լ���õ���С������
	 */
	public static void main(String[] args) {
		
		int res ;
		System.out.println("����������������");
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
		System.out.println(one + "��" + tow +"�����Լ��Ϊ��"+min);
		System.out.println(one + "��" + tow +"����С������Ϊ��"+one*tow/min);
		
		scan.close();

	}

}
