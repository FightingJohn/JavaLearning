package com.lyl.homework;

import java.io.IOException;
import java.sql.SQLException;

public class HomeworkSeven {

	/**
	 * ��дһ��demo���򣬳���֤�����½��ۣ�
		1�������ڸ��Ǹ���ķ���ʱ�����෽�������׳���ͬ���쳣�����߸��쳣�����ࡣ
		2����������ڸ÷������׳���ͬ���쳣��Ǹ����쳣�����࣬����ô����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		
		Demo d = new Price();
		d.print1();
		d.print2();
		d.print3();
		d.print4();

	}

}

//�����׳������쳣�����ĸ���
class Demo {

	protected void print1() throws ArithmeticException{
		
		System.out.println("��-print1()---�����׳�ArithmeticException");//��һ���������
	}
	
	protected void print2() throws RuntimeException{
		
		System.out.println("��-print2()---�����׳�RuntimeException");	//��һ���������
	}
	
	protected void print3() throws IOException{
		
		System.out.println("��-print3()---�����׳�IOException");//�ڶ����������
	}

	protected void print4() throws IOException{
		
		System.out.println("��-print4()---�����׳�IOException");//�ڶ����������
	}
	
}


//����
class Price extends Demo{
	
	protected void print1() throws RuntimeException{
		
		System.out.println("��-print1()---�����׳�RuntimeException");	//��һ���������
	}
	
	protected void print2() throws ClassCastException{				
		
		System.out.println("��-print2()---�����׳�ClassCastException");//��һ���������
	}
	
	protected void print3() throws RuntimeException{				
		
		System.out.println("��-print3()---�����׳�RuntimeException");//��һ���������
	}	
	
//	protected void print4() throws SQLException{					//����		
//		
//		System.out.println("��-print4()---�����׳�ClassCastException");//��һ���������
//	}	
	
	
}