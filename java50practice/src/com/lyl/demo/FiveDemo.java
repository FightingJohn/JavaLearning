package com.lyl.demo;

import java.util.Scanner;

public class FiveDemo {

	/**
	 * ���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
	 */
	public static void main(String[] args) {
		
		System.out.println("������ѧ���ɼ���");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		if(score > 100)
			System.out.println("����ɼ���Ч��");
		else if(score >= 90)
			System.out.println("�ɼ�Ϊ A");
		else if(score >= 60)
			System.out.println("�ɼ�Ϊ B");
		else if(score >= 0)
			System.out.println("�ɼ�Ϊ C");
		else
			System.out.println("����ɼ���Ч��");

		scan.close();
	}

}
