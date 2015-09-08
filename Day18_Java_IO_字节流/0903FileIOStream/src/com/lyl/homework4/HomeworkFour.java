package com.lyl.homework4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeworkFour {

	/**
	 * ���Ͽν�������copy�ļ������ӷ�װ���ĸ�������
		��������������copy���¼������������ĵ�ʱ�䡣
		1.һ��java�ļ�(31kb)			copy1--205ms    copy2--1ms      
		2.һ����Ƭ(6412kb)			copy1--62624ms    copy2--86ms
		3.һ��mp3(3509kb)			copy1--34039ms    copy2--47ms
		4.һ��С����Ƶ
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//������
		FileInputStream fis = new FileInputStream("D:\\fileTest\\Bon Jovi - It's My Life.mp3");
		
		//�����
		FileOutputStream fos = new FileOutputStream("D:\\fileTest\\copy2.mp3");
		
		long startTime = System.currentTimeMillis();
		
		copy2(fis, fos);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		
		//�ر������
		fos.close();
		
		//�ر�������
		fis.close();

	}
	
	private static void copy1(FileInputStream fis, FileOutputStream fos) throws IOException{
		
		int b;
		//ÿ�δӴ��̶����ڴ�һ��Byte			
		while((b = fis.read()) != -1){
			//ÿ�δ��ڴ�д��oneByte.txtһ���ֽ�
			fos.write(b); 
		}
	}
	
	private static void copy2(FileInputStream fis, FileOutputStream fos) throws IOException{

		int len;
		//����������				
		byte[] buffer = new byte[1024];
		
		//ÿ�δӴ��̶�����Ϣ�ȴ���buffer��
		while((len = fis.read(buffer)) != -1){
			//ÿ�δ��ڴ���buffer.txtд��buffer�ڵ���Ϣ
			fos.write(buffer, 0, len);
		}
	}

}
