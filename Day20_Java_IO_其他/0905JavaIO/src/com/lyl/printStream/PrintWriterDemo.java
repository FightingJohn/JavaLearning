package com.lyl.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	/**
	 * ��ӡ�ַ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		// ʹ��ָ���ļ������������Զ���ˢ�µ��� PrintWriter��
//		PrintWriter pw = new PrintWriter("3.txt");
		
		//ͨ�����е� OutputStream �����µ� PrintWriter���Զ�ˢ��
//		PrintWriter pw = new PrintWriter(new FileOutputStream("4.txt"), true);
		
		// ���������Զ���ˢ�µ��� PrintWriter
		PrintWriter pw = new PrintWriter(new FileWriter("5.txt"));
		
		pw.print(false);
		pw.println();
		pw.println("���ǳ���Գ");
		pw.write(98);
		
		pw.close();

	}

}
