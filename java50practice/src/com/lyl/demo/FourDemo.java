package com.lyl.demo;

import java.util.Scanner;

public class FourDemo {

	/**
	 * ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ������2����������");
		int i = scan.nextInt();
		
		String str = "";			//���������
		//���ĳ����������������
		for(int j = 2; j <= i; j++){
			
			if(i % j == 0){
				str = str + j + "*";
				i = i / j;
				j=2;
			}
		}
		
		//��ȡstr�ַ������ӿ�ʼ�������ڶ�λ 
		String result = str.substring(0, str.length()-1);
		System.out.println(result);
		scan.close();		//�ͷ���Դ

	}


}
