package com.lyl.homework;


public class HomeworkOne {

	/**
	 * �̳��У�����͸���Ĺ��췽��
	 */
	public static void main(String[] args) {
		
		new Son();

	}

}

//����
class Father{
	
	//�����޲ι��췽��
	public Father(){
		System.out.println("Father()");
	}
	
	//�����вι��췽��
	public Father(int i, int j){
		System.out.println("Father(int i, int j)");
	}
}

//����
class Son extends Father{
	
	private int k ;
	
	//�����޲ι��췽��
	public Son(){
//		k = 0;
//		super(0, 0);
		 k = 0;
		System.out.println("Son()" + k);
	}
}