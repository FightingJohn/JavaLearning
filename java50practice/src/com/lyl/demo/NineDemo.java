package com.lyl.demo;

public class NineDemo {

	/**
	 * һ����Ȼ�����ǡ�õ�����������֮�ͣ������Ȼ���ͳ�Ϊ"����"��
	 * ����6=1��2��3.����ҳ�1000���ڵ�����������
	 */
	public static void main(String[] args) {
		
		System.out.print("1000���ڵ������У�1    ");
		//����1000���ڵ���
		for(int num = 1; num <= 1000; num++){
			//��һ����Ȼ����ȥ�����������֮��
			int sum = 0;				//һ���������������ӵĺ�
			for(int i = 1; i <= num/2; i++){
				if(num % i == 0)
					sum+=i;
			}
			if(sum == num)
				System.out.print(num+"\t");
		}

	}

}
