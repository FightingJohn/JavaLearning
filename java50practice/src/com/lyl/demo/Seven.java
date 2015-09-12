package com.lyl.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Seven {

	/**
	 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
	 */
	public static void main(String[] args) {
		
		int letter = 0;			//中英文字母个数
		int space = 0;			//空格的个数
		int number = 0;			//数字的个数
		int other = 0;			//其他字符的个数
		
		//输入一串字符
//		Scanner scan = new Scanner(System.in);		//注意：这里不能采用scanner，因为这是空格是默认的结束符
//		String str = scan.next();
		
		System.out.print("请输入一个字符串： ");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = buff.readLine();
			//把字符串转化为字符数组
			char[] ch = str.toCharArray();
			//比较统计中英文字母，空格，数组和其他字符的个数
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
			//关闭流，释放资源
			try {
				if(buff != null)
					buff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//打印结果
		System.out.println("中英文字母的个数："+ letter);
		System.out.println("数字的个数为："+ number);
		System.out.println("空格的个数为："+ space);
		System.out.println("其他字符的个数为："+ other);

	}

}
