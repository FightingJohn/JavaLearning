package com.lyl.homwork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework2 {

	/**
	 * ��ʹ��һ��io����������¹��ܣ�����ʱ��
		��E��\��Ŀ¼�µ�ĳ��Ƶ�ļ���copy��E:\video\���档
		������ʹ�ý���ѧϰ��֪ʶ���л��������ֽ���������������
		Ϊ�˼���ʱ�䣬�����ÿ鿽��  					������ʱС��Ƶ�� 188 ms
	 */
	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		long startTime = System.currentTimeMillis();	//������ʼʱ��
		try {
			//f���µ���Ƶ�ļ�pray.mp4
			bis = new BufferedInputStream(new FileInputStream("E:\\pray.mp4"));
			
			//������f�̵�video�ļ��µ�test.mp4
			bos = new BufferedOutputStream(new FileOutputStream("E:\\video\\test.mp4"));
			
			int len = 0;
			byte[] b = new byte[1024];					//�ֽ������
			while((len = bis.read(b, 0, 1024)) != -1){
				
				bos.write(b, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bos != null)			//�ر������
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(bis != null)			//�ر�������
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		long endTime = System.currentTimeMillis();		//��������ʱ��
		
		System.out.println("������ʱС��Ƶ�� "+ (endTime - startTime));

	}

}
