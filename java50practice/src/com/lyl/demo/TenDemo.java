package com.lyl.demo;

public class TenDemo {

	/**
	 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�
	 * ������ ��10�����ʱ�������������ף���10�η�����ߣ�
	 */
	public static void main(String[] args) {
		
		float high = 100f;			//����ÿһ�ο�ʼ����ʱ�ĸ߶ȣ���ʼֵ��ʾ��һ�εĸ߶�
		float distance = 0;			//�򾭹��ľ���
		
		System.out.print("��ʮ����أ��򾭹��ľ���Ϊ�� ");
		for(int i = 2; i <= 10; i++){
			//�ӵ�һ��������򾭹��ľ���
			high /= 2;
			distance += (high * 2);
			
		}
		
		System.out.println(distance+100);		//���ϵ�һ�������¾����ľ���
		System.out.println("��ʮ���򷴵��ĸ߶�Ϊ�� " + high/2);
	}

}
