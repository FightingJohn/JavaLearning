package com.lyl.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {

	/**
	 * ��ӡ����������������������ͬ��PrintStream ��Զ�����׳� IOException
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// ��������ָ���ļ��Ҳ����Զ���ˢ�µ��´�ӡ����
//		PrintStream ps = new PrintStream("1.txt");
		
		//  �����µĴ�ӡ�����Զ�ˢ��
		PrintStream ps = new PrintStream(new FileOutputStream("2.txt"), true);
				
		ps.println(5);				//printд������ַ���
		ps.write(97);				//writeд�����asc����ж�Ӧ���ַ�ֵ
		ps.println(true);
		ps.println('f');
		ps.print("���");
		
		ps.close();

	}

}
