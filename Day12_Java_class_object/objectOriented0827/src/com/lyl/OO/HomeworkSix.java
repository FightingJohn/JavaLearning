package com.lyl.OO;

public class HomeworkSix {

	/**
	 * ֵ���ݺ����ô��ݵ�����
	 */
	public static void main(String[] args) {
		//��ʼ��int�ͱ����������һ����Ϊ0
		int a = 0;
		int[] arr = {0};
		
		System.out.println("���ú���֮ǰ��");
		System.out.println("a = " + a);
		System.out.println("arr[0] = "+ arr[0]);
		
		passValue(a);					//ֵ����
		passRefrence(arr);				//���ô���
		
		System.out.println("���ú���֮��");
		System.out.println("ֵ���ݣ�a = " + a);
		System.out.println("���ô��ݣ�arr[0] = "+ arr[0]);

	}
	
	//ֵ���ݲ��Ժ���
	public static void passValue(int a){
		a = 20;
	}
	
	//�������ô���
	public static void passRefrence(int[] arr){
		arr[0] = 20;
	}

}
