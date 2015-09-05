package com.lyl.homework1;

import java.io.File;

public class Recursion2 {

	/**
	 * 搜寻D:\androidTraining下面所有的txt文件，有递归实现
	 */
	public static void main(String[] args) {

		File file = new File("D:\\androidTraining");
		searchFile(file);

	}

	private static void searchFile(File file){
		
		File[] files = file.listFiles();
		for (File file2 : files) {
			//判断是否是文件
			if(file2.isFile()){
				//如果是txt文件，打印其绝对路径
				if(file2.getName().endsWith(".txt"))
					System.out.println(file2.getAbsolutePath());
			}
			else{//如果是文件夹，继续searchFile
				searchFile(file2);
			}
		}
	}
}
