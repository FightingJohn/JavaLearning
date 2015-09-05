package com.lyl.homwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework4 {

	/**
	 *  * ���󣺸��ƶ༶�ļ���
	 * ����Դ��E:\code\demos\�����ѡһ�����e���µ�ĳ���ļ��У�������Ҫ����������ļ��м����ļ���
	 * Ŀ�ĵأ�E:\\   �����ö༶�ļ����������Ƶ�e�̸�Ŀ¼��
	 */
	public static void main(String[] args) {

		//����Դ
		File origin = new File("E:\\temp\\demos");
		//Ŀ�ĵ�
		File destination = new File("E:\\");
		
		copy(origin, destination);
		
		System.out.println("�����ɹ���");

	}

	//����Ŀ���ļ�������������ļ��к����ļ�
	private static void copy(File origin, File destination) {
		
		//�ж�����Դ�Ƿ�Ϊ�ļ���
		if(origin.isDirectory()){
			//�ǣ���Ŀ�ĵش������ļ���
			File dir = new File(destination, origin.getName());
			dir.mkdir();
			
			//����Դ�ļ����µ������ļ�
			File[] files = origin.listFiles();
			for (File file : files) {
				//������ļ��У��ݹ�
				if(file.isDirectory())
					copy(file, dir);
				else{					//���ļ�������
					//�Ȱ�Ŀ���ļ��½���Ŀ�ĵ�
					File targetFile = new File(dir, file.getName());
					//�ļ����ݽ��п���
					fileCopy(file, targetFile);
				}
			}
			
		}else{
			File targetFile = new File(destination, origin.getName());
			
			fileCopy(origin, targetFile);
		}
	}

	private static void fileCopy(File file, File targetFile) {
		
		//�ַ�������
		BufferedReader buffReader = null;
		//�ֽ������
		BufferedWriter buffWriter = null;
		
		try {
			buffReader = new BufferedReader(new FileReader(file));
			buffWriter = new BufferedWriter(new FileWriter(targetFile));
			
			String str;
			while((str = buffReader.readLine()) != null){		//ÿ�ζ�ȡ�ı���һ�У����ǲ������з�
				
				buffWriter.write(str);							//д��һ��
				buffWriter.newLine();							//д�뻻�з�
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(buffReader != null)		//�ر������
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//�ر�������
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
