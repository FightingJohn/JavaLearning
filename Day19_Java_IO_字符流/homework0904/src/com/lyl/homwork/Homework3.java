package com.lyl.homwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Homework3 {

	/**
	 * ���Ƶ����ļ�����ָ���ļ�����һ���̷��µĶ�Ӧͬ���ļ��У�
	 * ���޸��ļ����ƣ��ڸ��Ƶ��ļ����������_copy����a.txt -->a_copy.txt��.
	 * ��E���µ�temp�ļ����е�hello.txt������D���µ�temp�ļ�����
	 * �ļ��к��к��֣����в����ֽ����������InputStreamReader��OutputStreamWriter�������
	 */
	public static void main(String[] args) {
		
		InputStreamReader isReader = null;
		OutputStreamWriter osWriter = null;
		
		try {
			//ָ��GBK����д��
			isReader = 
					new InputStreamReader(new FileInputStream("E:\\temp\\hello.txt"), "GBK");
			
			//����utf-8�������GBK�����Բ���utf-8����
			osWriter = 
					new OutputStreamWriter(new FileOutputStream("D:\\temp\\hello_copy.txt"));
			
			int len = 0;
			char[] c = new char[1024];
			while((len = isReader.read(c, 0, 1024)) != -1){
				
				osWriter.write(c, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(osWriter != null)			//�ر������
				try {
					osWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(isReader != null)			//�ر�������
				try {
					isReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		System.out.println("������ɣ�");

	}

}
