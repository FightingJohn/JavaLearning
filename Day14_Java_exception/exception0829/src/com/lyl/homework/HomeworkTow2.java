package com.lyl.homework;

public class HomeworkTow2 {

	/**
	 * ��ת���쳣����ClassCastException��
	 */
	public static void main(String[] args) {
		
		Father f = new Father();
		Child c = null;
		try {
			
			c = (Child)f;		//����ȫ������ת��
			return;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			c = new Child();
		} finally {
			
			System.out.println("������ҵ2-2(try �ں���return)��finally");
			
		}
		
		c.print();
		System.out.println("over");
	}
}

//����
class Father{
	
	void print(){
		System.out.println("���Ǹ��� ");
	}
}

//����
class Child extends Father{
	
	void print(){
		System.out.println("��������  ");
	}
}