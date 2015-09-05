package com.lyl.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	/**
	 * 打印字符流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		// 使用指定文件创建不具有自动行刷新的新 PrintWriter。
//		PrintWriter pw = new PrintWriter("3.txt");
		
		//通过现有的 OutputStream 创建新的 PrintWriter，自动刷新
//		PrintWriter pw = new PrintWriter(new FileOutputStream("4.txt"), true);
		
		// 创建不带自动行刷新的新 PrintWriter
		PrintWriter pw = new PrintWriter(new FileWriter("5.txt"));
		
		pw.print(false);
		pw.println();
		pw.println("我是程序猿");
		pw.write(98);
		
		pw.close();

	}

}
