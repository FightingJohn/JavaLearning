package com.lyl.homework1;

import java.io.File;

public class Recursion2 {

	/**
	 * ��ѰD:\androidTraining�������е�txt�ļ����еݹ�ʵ��
	 */
	public static void main(String[] args) {

		File file = new File("D:\\androidTraining");
		searchFile(file);

	}

	private static void searchFile(File file){
		
		File[] files = file.listFiles();
		for (File file2 : files) {
			//�ж��Ƿ����ļ�
			if(file2.isFile()){
				//�����txt�ļ�����ӡ�����·��
				if(file2.getName().endsWith(".txt"))
					System.out.println(file2.getAbsolutePath());
			}
			else{//������ļ��У�����searchFile
				searchFile(file2);
			}
		}
	}
}
