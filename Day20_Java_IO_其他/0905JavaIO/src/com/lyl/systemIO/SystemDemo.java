package com.lyl.systemIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SystemDemo {

	/**
	 * System.in �� System.out��׼�������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
//		PrintStream ps = System.out;		//ָ�����̨�Ĵ�ӡ���������
//
//		ps.println(false);
//		ps.println(97);
//		ps.println("����");
//		
//		ps.close();
		
		
		BufferedReader buffReader= 
				new BufferedReader(new InputStreamReader(System.in));//ָ�����̨��������
		
		String str = buffReader.readLine();
		int i = Integer.parseInt(str);			//���ַ�������ת��Ϊint����
		
		System.out.println(str);
		System.out.println(i/10);
	}

}
