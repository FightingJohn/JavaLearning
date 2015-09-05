package com.lyl.homework3;

import java.io.File;

public class HomeworkThree {

	/**
	 * 使用递归程序，实现删除某个目录的功能。
	      注意，需要删除该目录里面所有的子文件和文件夹。
	   删除d盘下的0819_DOM文件，及其它下面的的所有文件
	 */
	public static void main(String[] args) {

		File file = new File("D:\\0819_DOM");
		deleteFile(file);

	}

	private static void deleteFile(File file){
		
		File[] files = file.listFiles();
		for (File file2 : files) {
			//判断是否是文件
			if(file2.isFile()){
				//如果是文件，删除
				file2.delete();
				System.out.println(file2.getParent()+"下的  "+file2.getName()+"  被删除");
				
			}
			else{//如果是文件夹，递归
				deleteFile(file2);
				//删除空文件夹
				file2.delete();
				System.out.println(file2.getParent()+"下的  "+file2.getName()+"空文件夹   被删除");
			}
		}
	}
}