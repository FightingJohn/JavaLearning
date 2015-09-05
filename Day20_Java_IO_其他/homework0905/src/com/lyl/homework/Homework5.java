package com.lyl.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework5 {

	/**
	 * 1��Java��Scanner������˺ܶ�����������ͷ�������ο�API�ĵ�������ʹ�ø���Ĳ�ͬ����ʵ�����롣
	   2. Java��PrintStream��һ���Զ�ˢ�¹��ܣ�����һ�²ο��ĵ��������ϣ�ʵ��PrintStream���Զ�ˢ�¡�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
//		test1();
//		test2();
		
//		PrintStream ps = new PrintStream(System.out, true);			//�Զ�ˢ�£���ӡ������̨
		PrintStream ps = new PrintStream(new FileOutputStream("hk5.txt"), true);			//�Զ�ˢ�£�д���ı���
		
		ps.println("����һ������Գ��");
		ps.println(23);
		ps.write(97);
		
		//ps.close();
	}

	private static void test2() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("hw5.txt"));
		
		int i = scan.nextInt();
//		double d = scan.nextDouble();
		String str = scan.nextLine();
		double d = scan.nextDouble();
		
		print(i);
		print(d);
		print(str);
		
		scan.close();
	}

	private static void test1() {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();				//����int��
		double d = scan.nextDouble();		//double����
//		
//		String str = scan.next();			//string����
		
		String str2 = scan.next("haha");	//������������Ϣ
		

		print(i);
		print(d);
//		print(str);
		print(str2);
		
		scan.close();
	}
	
	private static void print(Object obj){
		
		System.out.println(obj);
	}

}
