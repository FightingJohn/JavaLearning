package com.lyl.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Seven {

	/**
	 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
	 */
	public static void main(String[] args) {
		
		int letter = 0;			//��Ӣ����ĸ����
		int space = 0;			//�ո�ĸ���
		int number = 0;			//���ֵĸ���
		int other = 0;			//�����ַ��ĸ���
		
		//����һ���ַ�
//		Scanner scan = new Scanner(System.in);		//ע�⣺���ﲻ�ܲ���scanner����Ϊ���ǿո���Ĭ�ϵĽ�����
//		String str = scan.next();
		
		System.out.print("������һ���ַ����� ");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = buff.readLine();
			//���ַ���ת��Ϊ�ַ�����
			char[] ch = str.toCharArray();
			//�Ƚ�ͳ����Ӣ����ĸ���ո�����������ַ��ĸ���
			for(int i = 0; i < ch.length; i++){
				System.out.print(ch[i]+" ");
				
				if((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z'))
					letter++;
				else if(ch[i] >= '0' && ch[i] <= '9')
					number++;
				else if(ch[i] == 32)
					space++;
				else 
					other++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//�ر������ͷ���Դ
			try {
				if(buff != null)
					buff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//��ӡ���
		System.out.println("��Ӣ����ĸ�ĸ�����"+ letter);
		System.out.println("���ֵĸ���Ϊ��"+ number);
		System.out.println("�ո�ĸ���Ϊ��"+ space);
		System.out.println("�����ַ��ĸ���Ϊ��"+ other);

	}

}
