package com.lyl.homework2;

public class HomeworkTwo {

	/**
	 * �ݹ���쳲��������еĵ�n��ֵ.쳲������������У�0��1��1��2��3��5��8��13��21��34������
	 * �Եݹ�ķ������壺F��0��=0��F��1��=1��F��n��=F(n-1)+F(n-2)��n��2��n��N*��
	 */
	public static void main(String[] args) {
		
		//쳲��������еĵ�n��ֵ
		System.out.println("쳲��������еĵ� 30 ��ֵ�ǣ�" + FibonacciSeq(30-1));

	}
	
	//쳲��������к���
	private static int FibonacciSeq(int n){
		
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return FibonacciSeq(n-1) + FibonacciSeq(n-2);
	}

}
