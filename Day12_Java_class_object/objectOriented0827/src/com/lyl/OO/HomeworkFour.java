package com.lyl.OO;

public class HomeworkFour {

	/**
	 * ���캯��
	 */
	//�޲ι��췽��
	public HomeworkFour(){
		
		System.out.print("HomeworkFour()");
	}
	
	//����һ���������вι��캯��
	public HomeworkFour(String str){
		
		this();
		System.out.print(" " + str + " ");
	}
	
	//�������������Ĺ��췽��1
	public HomeworkFour(String str, int i){
		this();
		System.out.println(str + i);
	}
	
	//�������������Ĺ��췽��2
	public HomeworkFour(int i, String str){
		this("lalall");
		System.out.println(i + str);
	}
	
	public static void main(String[] args) {

//		new HomeworkFour();
//		new HomeworkFour("hello");
		new HomeworkFour("hahaha", 3);
		new HomeworkFour(4, "hehhehheh");

	}

}
