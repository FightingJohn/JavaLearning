package com.lyl.homework5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeworkFive {

	/**
	 * 找出你的myeclipse的workspace里的所有java文件。
	      并将找到的这些文件名输出到一个文本文件里。
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		File file = new File("D:\\java");
		searchJavaFile(file);
		System.out.println(" 个java文件写入java.txt完成！");

	}

	private static void searchJavaFile(File file) throws IOException{
		
		File[] files = file.listFiles();
		
		//输出流，将结果写入到此文件夹的java.txt中
		FileOutputStream fos = new FileOutputStream("java.txt",true);
		for (File file2 : files) {
			//判断是否是文件
			if(file2.isFile()){
				//如果是txt文件，打印其绝对路径
				if(file2.getName().endsWith(".java")){
					
					//将符合要的文件名写入java.txt
					byte[] b = file2.getName().getBytes();		//把文件名字符串转化为byte数组
					fos.write(b);
					fos.write("\r\n".getBytes());				//写入一个换行
				}
			}
			else{//如果是文件夹，继续searchFile
				searchJavaFile(file2);
			}
		}
		
		//关闭输出流
		fos.close();
	}
}

