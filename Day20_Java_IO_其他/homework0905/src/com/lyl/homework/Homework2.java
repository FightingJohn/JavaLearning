package com.lyl.homework;

import java.io.IOException;
import java.io.PrintStream;

public class Homework2 {

	/*
	 * 设计一个程序，将该程序运行时使用system.out.println打印到命令行的东西保存到一个文件中。
	 */
	public static void main(String[] args) throws IOException{
		
		
		System.out.println("hello world");
		//指向hw2.txt的打印字节输出流
		PrintStream ps = new PrintStream("hw2.txt");
		
		//将system.out.println打印的内容写入hw2.txt
		ps.println("hello world");
		
		ps.close();
		
	}
}
