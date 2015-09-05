package com.lyl.homework1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	/**
	 * ����ÿ�ζ�һ���ֽںͿ���룬��дtestFileIO.txt
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//������
		FileInputStream fis = new FileInputStream("testFileIO.txt");
		
		//�����,д��oneByte.txt
		FileOutputStream fos = new FileOutputStream("oneByte.txt");
//		FileOutputStream fos = new FileOutputStream("buffer.txt");
		//���뿪ʼǰʱ��
		long startTime = System.currentTimeMillis();
		
		int b;
		//ÿ�δӴ��̶����ڴ�һ��Byte			��ʱ  38ms
		while((b = fis.read()) != -1){
			//ÿ�δ��ڴ�д��oneByte.txtһ���ֽ�
			fos.write(b);
		}
		
//		int len;
//		//����������				��ʱ    1ms
//		byte[] buffer = new byte[1024];
//		//ÿ�δӴ��̶�����Ϣ�ȴ���buffer��
//		while((len = fis.read(buffer)) != -1){
//			//ÿ�δ��ڴ���buffer.txtд��buffer�ڵ���Ϣ
//			fos.write(buffer, 0, len);
//		}
		
		//�������ʱ��
		long endTime = System.currentTimeMillis();
		
		//�ر������
		fos.close();
		
		//�ر�������
		fis.close();
		
		System.out.println("д����ϣ���ʱ�� "+ (endTime - startTime));

	}

}
