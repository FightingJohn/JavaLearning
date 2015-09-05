package com.lyl.homework1;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter {

	/**
	 * 使用文件过滤器查找D:\androidTraining\Day18_Java_IO_字节流\作业下面的txt文件
	 */
	public static void main(String[] args) {
		
		File file = new File("D:\\androidTraining\\Day18_Java_IO_字节流\\作业");
		
		//使用public String[] list(FilenameFilter filter)实现
		FilenameFilter filter = new FilenameFilter(){

			//寻找txt文件，找到返回true，否则返回false
			public boolean accept(File dir, String name) {
				
				if(name.endsWith(".txt"))
					return true;
				return false;
			}
		};
		
		//把搜索到的txt文件名放入String[]数组
		String[] fileStr = file.list(filter);
		for (String string : fileStr) {
			
			System.out.println(string);
		}

	}

}
