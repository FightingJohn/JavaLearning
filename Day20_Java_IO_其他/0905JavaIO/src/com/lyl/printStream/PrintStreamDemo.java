package com.lyl.printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {

	/**
	 * 打印输出流——与其他输出流不同，PrintStream 永远不会抛出 IOException
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// 创建具有指定文件且不带自动行刷新的新打印流。
//		PrintStream ps = new PrintStream("1.txt");
		
		//  创建新的打印流，自动刷新
		PrintStream ps = new PrintStream(new FileOutputStream("2.txt"), true);
				
		ps.println(5);				//print写入的是字符串
		ps.write(97);				//write写入的是asc码表中对应的字符值
		ps.println(true);
		ps.println('f');
		ps.print("你好");
		
		ps.close();

	}

}
