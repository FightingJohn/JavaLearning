package com.lyl.homework;

import java.io.IOException;
import java.io.PrintStream;

public class Homework2 {

	/*
	 * ���һ�����򣬽��ó�������ʱʹ��system.out.println��ӡ�������еĶ������浽һ���ļ��С�
	 */
	public static void main(String[] args) throws IOException{
		
		
		System.out.println("hello world");
		//ָ��hw2.txt�Ĵ�ӡ�ֽ������
		PrintStream ps = new PrintStream("hw2.txt");
		
		//��system.out.println��ӡ������д��hw2.txt
		ps.println("hello world");
		
		ps.close();
		
	}
}
