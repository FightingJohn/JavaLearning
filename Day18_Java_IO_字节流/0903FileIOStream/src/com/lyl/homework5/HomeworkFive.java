package com.lyl.homework5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeworkFive {

	/**
	 * �ҳ����myeclipse��workspace�������java�ļ���
	      �����ҵ�����Щ�ļ��������һ���ı��ļ��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		File file = new File("D:\\java");
		searchJavaFile(file);
		System.out.println(" ��java�ļ�д��java.txt��ɣ�");

	}

	private static void searchJavaFile(File file) throws IOException{
		
		File[] files = file.listFiles();
		
		//������������д�뵽���ļ��е�java.txt��
		FileOutputStream fos = new FileOutputStream("java.txt",true);
		for (File file2 : files) {
			//�ж��Ƿ����ļ�
			if(file2.isFile()){
				//�����txt�ļ�����ӡ�����·��
				if(file2.getName().endsWith(".java")){
					
					//������Ҫ���ļ���д��java.txt
					byte[] b = file2.getName().getBytes();		//���ļ����ַ���ת��Ϊbyte����
					fos.write(b);
					fos.write("\r\n".getBytes());				//д��һ������
				}
			}
			else{//������ļ��У�����searchFile
				searchJavaFile(file2);
			}
		}
		
		//�ر������
		fos.close();
	}
}

