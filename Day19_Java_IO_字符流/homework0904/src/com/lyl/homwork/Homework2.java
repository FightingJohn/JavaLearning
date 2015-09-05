package com.lyl.homwork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework2 {

	/**
	 * 请使用一种io流来完成入下功能，并计时：
		将E：\根目录下的某视频文件，copy到E:\video\下面。
		分析：使用今天学习的知识带有缓冲区的字节流来解决这个问题
		为了减少时间，将采用块拷贝  					拷贝耗时小视频： 188 ms
	 */
	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		long startTime = System.currentTimeMillis();	//拷贝开始时间
		try {
			//f盘下的视频文件pray.mp4
			bis = new BufferedInputStream(new FileInputStream("E:\\pray.mp4"));
			
			//拷贝到f盘的video文件下的test.mp4
			bos = new BufferedOutputStream(new FileOutputStream("E:\\video\\test.mp4"));
			
			int len = 0;
			byte[] b = new byte[1024];					//字节数组块
			while((len = bis.read(b, 0, 1024)) != -1){
				
				bos.write(b, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bos != null)			//关闭输出流
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(bis != null)			//关闭输入流
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		long endTime = System.currentTimeMillis();		//拷贝结束时间
		
		System.out.println("拷贝耗时小视频： "+ (endTime - startTime));

	}

}
