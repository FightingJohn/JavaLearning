package com.lyl.printStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CopyFileDemo {

	/**
	 *  π”√PrintStreamøΩ±¥ThreadSix.java
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream("ThreadSix.java"));
		
		PrintStream ps = new PrintStream("file1.txt");
//		BufferedOutputStream ps = new BufferedOutputStream(new FileOutputStream("file2.txt"));
		

		int len = 0;
		byte[] b = new byte[1024];
		while((len = bis.read(b, 0, 1024)) != -1){
			ps.write(b, 0, len);
		}
		
		ps.close();
		bis.close();

	}

}
