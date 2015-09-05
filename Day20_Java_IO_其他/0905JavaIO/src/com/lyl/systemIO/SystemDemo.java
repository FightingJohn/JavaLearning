package com.lyl.systemIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SystemDemo {

	/**
	 * System.in 和 System.out标准输入输出
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
//		PrintStream ps = System.out;		//指向控制台的打印输出流对象
//
//		ps.println(false);
//		ps.println(97);
//		ps.println("哈哈");
//		
//		ps.close();
		
		
		BufferedReader buffReader= 
				new BufferedReader(new InputStreamReader(System.in));//指向控制台的输入流
		
		String str = buffReader.readLine();
		int i = Integer.parseInt(str);			//把字符串类型转化为int类型
		
		System.out.println(str);
		System.out.println(i/10);
	}

}
