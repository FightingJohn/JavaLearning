package com.lyl.demo2;

import java.util.Scanner;

public class Fourteen {

	/**
	 * ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿�����������3��5��Ϊ����
	 * Ӧ���Ȱ�ǰ�����µļ�������Ȼ���ټ���5�켴����ĵڼ��죬���������
	 * �����������·ݴ���3ʱ�迼�Ƕ��һ��
	 * ���������ꡪ��1���ܱ�4����ͬʱ���ܱ�100��������ݡ�2���ܱ�400����
	 */
	public static void main(String[] args) {
		
		int result = 0;				//�������н��
		//����ƽ��ڼ�����ʱ����Ӧ�ĵڼ���
		int[] months = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ݣ�");
		int year = scan.nextInt();
		System.out.print("������ݣ�");
		int month = scan.nextInt();
		System.out.print("������ݣ�");
		int day = scan.nextInt();
		
		//�ж��Ƿ�Ϊ����
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			result = 1;
		result = result + months[month] + day;
		
		System.out.println(year +"��"+ month +"��"+ day +"�� �Ǳ���ĵ� "+ result +" ��");
		
		scan.close();

	}

}
