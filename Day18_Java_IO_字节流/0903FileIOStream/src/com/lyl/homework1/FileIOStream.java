package com.lyl.homework1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	/**
	 * 测试每次读一个字节和块读入，读写testFileIO.txt
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//输入流
		FileInputStream fis = new FileInputStream("testFileIO.txt");
		
		//输出流,写入oneByte.txt
		FileOutputStream fos = new FileOutputStream("oneByte.txt");
//		FileOutputStream fos = new FileOutputStream("buffer.txt");
		//读入开始前时间
		long startTime = System.currentTimeMillis();
		
		int b;
		//每次从磁盘读入内存一个Byte			耗时  38ms
		while((b = fis.read()) != -1){
			//每次从内存写入oneByte.txt一个字节
			fos.write(b);
		}
		
//		int len;
//		//建立缓冲区				耗时    1ms
//		byte[] buffer = new byte[1024];
//		//每次从磁盘读入信息先存入buffer内
//		while((len = fis.read(buffer)) != -1){
//			//每次从内存向buffer.txt写入buffer内的信息
//			fos.write(buffer, 0, len);
//		}
		
		//读入结束时间
		long endTime = System.currentTimeMillis();
		
		//关闭输出流
		fos.close();
		
		//关闭输入流
		fis.close();
		
		System.out.println("写入完毕！耗时： "+ (endTime - startTime));

	}

}
