package com.lyl.demo;

import java.util.Scanner;

public class EightDemo {

	/**
	 * ��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
	 * ����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ� 
	 */
	public static void main(String[] args) {
	
		long sum = 0;			//ÿ����
		long result = 0;		//��
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����������������");
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
		
		//�ر���
		scan.close();
	}

}
