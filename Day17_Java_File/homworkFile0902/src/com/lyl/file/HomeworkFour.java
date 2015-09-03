package com.lyl.file;

import java.io.File;
import java.io.IOException;

public class HomeworkFour {

	/**
	 * 批量修改文件名称
	 */

	private static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {

		// 在本目录创建一个photo文件夹
		File file = new File("photo");
		// print("创建文件夹："+file.mkdir());

		// 放入10张相片
		// for(int i = 0; i < 10; i++){
		// String str = "P102033" + i +".jpg";
		// File file2 = new File(file, str);
		// try {
		// file2.createNewFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }

		// 修改相片名称
		File[] files = file.listFiles(); // 获得photo文件夹下面的所有照片文件
		for (int i = 0; i < files.length; i++) {
			String str2 = "2015-4-15-" + (i + 1) + ".jpg";
			File file3 = new File(file, str2); // 目标文件名file实例
			files[i].renameTo(file3);
		}
		System.out.println("It is over");

	}

}
