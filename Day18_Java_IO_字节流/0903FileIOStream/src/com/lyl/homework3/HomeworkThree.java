package com.lyl.homework3;

import java.io.File;

public class HomeworkThree {

	/**
	 * ʹ�õݹ����ʵ��ɾ��ĳ��Ŀ¼�Ĺ��ܡ�
	      ע�⣬��Ҫɾ����Ŀ¼�������е����ļ����ļ��С�
	   ɾ��d���µ�0819_DOM�ļ�������������ĵ������ļ�
	 */
	public static void main(String[] args) {

		File file = new File("D:\\0819_DOM");
		deleteFile(file);

	}

	private static void deleteFile(File file){
		
		File[] files = file.listFiles();
		for (File file2 : files) {
			//�ж��Ƿ����ļ�
			if(file2.isFile()){
				//������ļ���ɾ��
				file2.delete();
				System.out.println(file2.getParent()+"�µ�  "+file2.getName()+"  ��ɾ��");
				
			}
			else{//������ļ��У��ݹ�
				deleteFile(file2);
				//ɾ�����ļ���
				file2.delete();
				System.out.println(file2.getParent()+"�µ�  "+file2.getName()+"���ļ���   ��ɾ��");
			}
		}
	}
}