package com.lyl.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework5 {

	/**
	 * 1，Java的Scanner类包含了很多其他的命令和方法，请参考API文档，尝试使用该类的不同方法实现输入。
	   2. Java的PrintStream有一个自动刷新功能，尝试一下参考文档查阅资料，实现PrintStream的自动刷新。
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
//		test1();
//		test2();
		
//		PrintStream ps = new PrintStream(System.out, true);			//自动刷新，打印到控制台
		PrintStream ps = new PrintStream(new FileOutputStream("hk5.txt"), true);			//自动刷新，写入文本中
		
		ps.println("我是一名程序猿！");
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
		
		int i = scan.nextInt();				//输入int型
		double d = scan.nextDouble();		//double类型
//		
//		String str = scan.next();			//string类型
		
		String str2 = scan.next("haha");	//限制了输入信息
		

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
