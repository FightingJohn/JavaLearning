package com.lyl.homwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework4 {

	/**
	 *  * 需求：复制多级文件夹
	 * 数据源：E:\code\demos\（随便选一个你的e盘下的某个文件夹，里面需要保护多个子文件夹及子文件）
	 * 目的地：E:\\   （将该多级文件夹整个复制到e盘根目录）
	 */
	public static void main(String[] args) {

		//数据源
		File origin = new File("E:\\temp\\demos");
		//目的地
		File destination = new File("E:\\");
		
		copy(origin, destination);
		
		System.out.println("拷贝成功！");

	}

	//拷贝目标文件及其下面的子文件夹和子文件
	private static void copy(File origin, File destination) {
		
		//判断数据源是否为文件夹
		if(origin.isDirectory()){
			//是，在目的地创建此文件夹
			File dir = new File(destination, origin.getName());
			dir.mkdir();
			
			//数据源文件夹下的所有文件
			File[] files = origin.listFiles();
			for (File file : files) {
				//如果是文件夹，递归
				if(file.isDirectory())
					copy(file, dir);
				else{					//是文件，拷贝
					//先把目标文件新建到目的地
					File targetFile = new File(dir, file.getName());
					//文件内容进行拷贝
					fileCopy(file, targetFile);
				}
			}
			
		}else{
			File targetFile = new File(destination, origin.getName());
			
			fileCopy(origin, targetFile);
		}
	}

	private static void fileCopy(File file, File targetFile) {
		
		//字符输入流
		BufferedReader buffReader = null;
		//字节输出流
		BufferedWriter buffWriter = null;
		
		try {
			buffReader = new BufferedReader(new FileReader(file));
			buffWriter = new BufferedWriter(new FileWriter(targetFile));
			
			String str;
			while((str = buffReader.readLine()) != null){		//每次读取文本的一行，但是不读换行符
				
				buffWriter.write(str);							//写入一行
				buffWriter.newLine();							//写入换行符
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(buffReader != null)		//关闭输出流
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//关闭输入流
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
