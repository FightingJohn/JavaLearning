package com.lyl.file;

import java.io.File;
import java.io.IOException;

public class HomerworkThree {

	/**
	 * File下面常用的api
	 */
	public static void main(String[] args) {

		// 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
		// File file = new File("D://fileTest"); //1，创建一个fileTest文件夹
		// file.mkdir();

		// 在fileTest中创建一个test.txt
		// File file = new File("D:\\fileTest\\test.txt"); //形式1

		// File file = new File("D:\\fileTest", "test2.txt"); //形式2

		// File file1 = new File("D:\\fileTest");
		// File file = new File(file1, "test3.txt"); //形式3

		// try {
		// file.createNewFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// 在文件夹下建立文件夹
		// File file = new File("D:\\fileTest\\haha\\hehe");
		// file.mkdirs();

		// 删除hehe文件夹
		// file.delete();

		// File file = new File("D:\\fileTest\\test4.txt");
		// System.out.println(file.getPath()); //创建文件路径
		// System.out.println(file.getAbsolutePath()); //输出绝对路径

		// 返回此抽象路径名的绝对路径名形式。
		// File file2 = file.getAbsoluteFile();
		// System.out.println(file2.getName()); //返回文件名
		// System.out.println(file2.getParent());
		// //返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null
		//
		// System.out.println(file.length()); //文件的长度
		// System.out.println(file.isAbsolute()); //测试抽象路径名是否为绝对路径

		// 重新命名此抽象路径名表示的文件。如果两个文件不在同一个文件夹下面，相当为剪切
		File file = new File("test4.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file3 = new File("D:\\fileTest\\test9.txt");
		System.out.println(file.renameTo(file3));

		System.out.println("It is over");

	}

}
