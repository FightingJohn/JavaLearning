package com.lyl.file;

import java.io.File;
import java.io.IOException;

public class HomeworkFour {

	/**
	 * �����޸��ļ�����
	 */

	private static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {

		// �ڱ�Ŀ¼����һ��photo�ļ���
		File file = new File("photo");
		// print("�����ļ��У�"+file.mkdir());

		// ����10����Ƭ
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

		// �޸���Ƭ����
		File[] files = file.listFiles(); // ���photo�ļ��������������Ƭ�ļ�
		for (int i = 0; i < files.length; i++) {
			String str2 = "2015-4-15-" + (i + 1) + ".jpg";
			File file3 = new File(file, str2); // Ŀ���ļ���fileʵ��
			files[i].renameTo(file3);
		}
		System.out.println("It is over");

	}

}
