package com.lyl.demo;

public class SecondDemo {

	/**
	 *�ж�101-200֮���ж��ٸ����������������������������������������1�����������ⲻ��������������
	 *��    ��		 2��3��5��7��11��13
	 *�����ж������ķ�������������γ���2���������ƽ����ȡ���������һ���������˾Ͳ�������������Ϊ����
	 */
	public static void main(String[] args) {
		
		int count = 100;				//����101��200֮������ָ���
		for(int num=100; num <= 200; num++){
			for(int i=2; i<=(int)Math.sqrt(num); i++){
				if(num % i == 0){
					count--;
					break;
				}
			}
		}
		
		System.out.println("101-200֮����: "+ count + "������");

	}

}
