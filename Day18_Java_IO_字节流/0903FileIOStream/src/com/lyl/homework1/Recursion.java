package com.lyl.homework1;

public class Recursion {

	/**
	 * �ݹ飬��ӡĳ�������Ľ׳�
	 */
	public static void main(String[] args) {

		//��ӡ5�Ľ׳�
		System.out.print("5�Ľ׳�Ϊ��" + function(5));

	}
	
	//�׳˺���
	private static int function(int i){
		
		//�ݹ�ĳ���
		if(i == 1){
			return 1;
		}
		
		return i * function(i-1);
	}

}
