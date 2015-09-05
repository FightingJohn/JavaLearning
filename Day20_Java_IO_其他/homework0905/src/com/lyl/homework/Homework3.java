package com.lyl.homework;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework3 {

	/**
	 *��һ���ļ���д��10�����֡�ʹ���ļ�����������10���������ڴ��У�Ȼ���������
	    ���ź���������������һ���ļ��С�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//��hw3.txt��д��0��50֮���10�������
		PrintStream ps1 = new PrintStream("hw3.txt");
		
		for(int i = 0; i < 10; i++){
			//0~50�����
			int temp = (int)(Math.random() * 50);
			ps1.write(temp);
		}
		
		ps1.close();
		
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream("hw3.txt"));
		//���ź�˳���10������д��sorthw3.txt
		PrintStream ps2 = new PrintStream("sorthw3.txt");
		
		int i = 0;
		int j = 0;						//�����±�
		int[] arr = new int[10];		//��Ŵ��ļ���������10����
		while((i = bis.read()) != -1){
			arr[j] = i;
			j++;
		}
		sortArr(arr, ps2);					//����������򲢷���Ŀ���ļ�
		
		//�ر����������
		ps2.close();
		bis.close();
		
		System.out.println("copy is over!");

	}
	
	//�����������򡪡�����
	private static void sortArr(int[] arr, PrintStream ps){
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] < arr[j]){
					//����ֵ
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			//������õ��������sorthw3.txt
			ps.println(arr[i]);
		}
	}

}
