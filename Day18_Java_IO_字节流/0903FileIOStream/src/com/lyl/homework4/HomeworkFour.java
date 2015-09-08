package com.lyl.homework4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeworkFour {

	/**
	 * 将上课讲的两种copy文件的例子封装成四个函数。
		并测试两个函数copy如下几个东西锁消耗的时间。
		1.一个java文件(31kb)			copy1--205ms    copy2--1ms      
		2.一张照片(6412kb)			copy1--62624ms    copy2--86ms
		3.一首mp3(3509kb)			copy1--34039ms    copy2--47ms
		4.一个小的视频
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//输入流
		FileInputStream fis = new FileInputStream("D:\\fileTest\\Bon Jovi - It's My Life.mp3");
		
		//输出流
		FileOutputStream fos = new FileOutputStream("D:\\fileTest\\copy2.mp3");
		
		long startTime = System.currentTimeMillis();
		
		copy2(fis, fos);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		
		//关闭输出流
		fos.close();
		
		//关闭输入流
		fis.close();

	}
	
	private static void copy1(FileInputStream fis, FileOutputStream fos) throws IOException{
		
		int b;
		//每次从磁盘读入内存一个Byte			
		while((b = fis.read()) != -1){
			//每次从内存写入oneByte.txt一个字节
			fos.write(b); 
		}
	}
	
	private static void copy2(FileInputStream fis, FileOutputStream fos) throws IOException{

		int len;
		//建立缓冲区				
		byte[] buffer = new byte[1024];
		
		//每次从磁盘读入信息先存入buffer内
		while((len = fis.read(buffer)) != -1){
			//每次从内存向buffer.txt写入buffer内的信息
			fos.write(buffer, 0, len);
		}
	}

}
