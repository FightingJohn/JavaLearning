package com.lyl.demo;

public class ThreeDemo {

	/**
	 * ��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
	 * ���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
	 */
	public static void main(String[] args) {
		
		//100��999��ˮ�ɻ���
		for(int i = 100; i <= 999; i++){
			int first = i % 10;
			int secend = i / 10 % 10;
			int third = i / 100;
			
			int temp = (int) (Math.pow(first, 3) + Math.pow(secend, 3) + Math.pow(third, 3));
			if(temp == i)
				System.out.print(i + "\t");
		}

	}

}
