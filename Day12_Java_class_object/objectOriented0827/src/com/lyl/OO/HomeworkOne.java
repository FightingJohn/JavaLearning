package com.lyl.OO;

public class HomeworkOne {
	/**
	 * ���ô��ݺ�ֵ����
	 */
	public static void main(String[] args) {

		Demo demo1 = new Demo(1);
		Demo demo2 = new Demo(2);
		System.out.println("����ǰ--------------");
		System.out.println("demo1.a = "+ demo1.a);
		System.out.println("demo2.a = "+ demo2.a);
		//���÷���һ����
//		swap1(demo1, demo2);
		
		//���÷���������
		swap2(demo1, demo2);
		System.out.println("������--------------");
		System.out.println("demo1.a = "+ demo1.a);
		System.out.println("demo2.a = "+ demo2.a);
	}
	
	//����һ���������������г�Ա������ֵ
	public static void swap1(Demo d1, Demo d2){
		int temp = d1.a;
		d1.a = d2.a;
		d2.a = temp;
	}
	
	//���������������������ֵ
	public static void swap2(Demo d1, Demo d2){
		Demo temp = d1;
		d1 = d2;
		d2 = temp;
	}

}

//����һ��ȱʡ��
class Demo{
	
	//�����Ա����
	int a;
	//�вι��췽��
	public Demo(int a){
		this.a = a;
	}	
}
