package com.lyl.demo2;

import java.util.Scanner;

public class Fifteen {

	/**
	 * ��Ŀ��������������x,y,z���������������С���������
		���������������취����С�����ŵ�x�ϣ��Ƚ�x��y���бȽϣ�
		���x>y��x��y��ֵ���н�����Ȼ������x��z���бȽϣ�
		���x>z��x��z��ֵ���н�����������ʹx��С��
	 */
	public static void main(String[] args) {
		
		System.out.print("������������");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = a > (b > c ?b:c) ?a:(b > c ?b:c);
		int min = a > (b > c ?c:b) ?(b > c ?c:b):a;
		if(a <= max && a >= min)
			System.out.println("����������С��������Ϊ�� "+ min+" "+a+" "+max);
		else if(b <= max && b >= min)
			System.out.println("����������С��������Ϊ�� "+ min+" "+b+" "+max);
		else if(c <= max && c >= min)
			System.out.println("����������С��������Ϊ�� "+ min+" "+a+" "+max);
		else
			System.out.println("��������쳣��");
		
		scan.close();

	}

}
