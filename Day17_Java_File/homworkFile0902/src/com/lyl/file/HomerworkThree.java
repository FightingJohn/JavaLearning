package com.lyl.file;

import java.io.File;
import java.io.IOException;

public class HomerworkThree {

	/**
	 * File���泣�õ�api
	 */
	public static void main(String[] args) {

		// ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ��
		// File file = new File("D://fileTest"); //1������һ��fileTest�ļ���
		// file.mkdir();

		// ��fileTest�д���һ��test.txt
		// File file = new File("D:\\fileTest\\test.txt"); //��ʽ1

		// File file = new File("D:\\fileTest", "test2.txt"); //��ʽ2

		// File file1 = new File("D:\\fileTest");
		// File file = new File(file1, "test3.txt"); //��ʽ3

		// try {
		// file.createNewFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// ���ļ����½����ļ���
		// File file = new File("D:\\fileTest\\haha\\hehe");
		// file.mkdirs();

		// ɾ��hehe�ļ���
		// file.delete();

		// File file = new File("D:\\fileTest\\test4.txt");
		// System.out.println(file.getPath()); //�����ļ�·��
		// System.out.println(file.getAbsolutePath()); //�������·��

		// ���ش˳���·�����ľ���·������ʽ��
		// File file2 = file.getAbsoluteFile();
		// System.out.println(file2.getName()); //�����ļ���
		// System.out.println(file2.getParent());
		// //���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null
		//
		// System.out.println(file.length()); //�ļ��ĳ���
		// System.out.println(file.isAbsolute()); //���Գ���·�����Ƿ�Ϊ����·��

		// ���������˳���·������ʾ���ļ�����������ļ�����ͬһ���ļ������棬�൱Ϊ����
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
