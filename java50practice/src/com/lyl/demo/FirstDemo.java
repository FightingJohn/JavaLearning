package com.lyl.demo;

public class FirstDemo {

	/**
	 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
	 * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣� 
	 * ������ÿ�������ӵĶ���  �� 1�� 1�� 2�� 3�� 5�� 8�� 13
	 * ������쳲���������������f(n) = f(n-1) + f(n-2)(n>=2, n����������)
	 */
	public static void main(String[] args) {
		
		System.out.println("�� 10 ������Ӹ���Ϊ��" + fun(10));

	}

	private static int fun(int n) {
		
		if(n==1 || n==2){
			return 1;
		}
		else
			return fun(n-1) + fun(n-2);
	}

}
