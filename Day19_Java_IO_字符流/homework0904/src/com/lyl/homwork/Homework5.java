package com.lyl.homwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework5 {

	/**
	 * ��Ŀ���Ӵ����϶�ȡһ���ı��ļ�����ĳ��javaԴ���룩��
	 * �ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֵĸ�����
	 * ������ʹ���ַ���������ÿ�ζ�һ���ֽڣ�Ȼ�������Ӣ����ĸ��asc�������
	 * �ո�ĵ�asc�룬�����ֵ�asc������бȽϣ��ĸ�ƥ����ȷ���ͼ�1   
	 */
	public static void main(String[] args) {

		//��ʼ����Ӣ����ĸ�ĸ������ո�ĸ��������ֵĸ���Ϊ0
		long letter = 0;
		long number = 0;
		long space = 0;
		BufferedReader buffReader = null;

		try {
			buffReader = new BufferedReader(new FileReader("ThreadSix.java"));
			int i = 0;
			while((i = buffReader.read()) != -1){		//���������ı�
				//��Ӣ�Ĵ�Сд��ĸ��Ӧ��asc������
				if(i >= 65 && i <= 90 || i >= 97 && i <= 122){
					letter++;
				}
				
				//���ֶ�Ӧ��asc������
				if(i >= 48 && i <= 58)
					number++;
				
				//�ո��Ӧ��asc��
				if(i == 32)
					space++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(buffReader != null)
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("��ThreadSix.java�ĵ���");
		System.out.println("��Ӣ�Ĵ�Сд��ĸ����Ϊ��" + letter);		//870
		System.out.println("���ֵĸ���Ϊ��" + number);				//15
		System.out.println("�ո�ĸ���Ϊ��" + space);				//78
		
	}

}
