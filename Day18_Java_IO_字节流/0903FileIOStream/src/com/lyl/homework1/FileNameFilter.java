package com.lyl.homework1;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter {

	/**
	 * ʹ���ļ�����������D:\androidTraining\Day18_Java_IO_�ֽ���\��ҵ�����txt�ļ�
	 */
	public static void main(String[] args) {
		
		File file = new File("D:\\androidTraining\\Day18_Java_IO_�ֽ���\\��ҵ");
		
		//ʹ��public String[] list(FilenameFilter filter)ʵ��
		FilenameFilter filter = new FilenameFilter(){

			//Ѱ��txt�ļ����ҵ�����true�����򷵻�false
			public boolean accept(File dir, String name) {
				
				if(name.endsWith(".txt"))
					return true;
				return false;
			}
		};
		
		//����������txt�ļ�������String[]����
		String[] fileStr = file.list(filter);
		for (String string : fileStr) {
			
			System.out.println(string);
		}

	}

}
