package com.lyl.OO;

public class HomeworkThree {

	/**
	 * ��������
	 */
	public static void main(String[] args) {
		
		String str1 = "1234";
		String str2 = "5678";
		System.out.println("���Դ����ַ�����");
		connect(str1, str2);
		System.out.println("���Դ���������");
		connect(Integer.parseInt(str1), Integer.parseInt(str2));
		System.out.println("���Դ��븡������");
		connect(Float.parseFloat(str1), Float.parseFloat(str2));
		

	}
	
	//����1���β�Ϊ�ַ�������
	public static void connect(String str1, String str2){
		
		System.out.println(str1 + str2);
	}
	
	//����2���β�Ϊ����
	public static void connect(int i1, int i2){
		
		System.out.println(i1 + i2 + "");
	}
	
	//����3���β�Ϊ����
	public static void connect(float f1, float f2){
		
		System.out.println(f1 + f2 + "");
	}

}
