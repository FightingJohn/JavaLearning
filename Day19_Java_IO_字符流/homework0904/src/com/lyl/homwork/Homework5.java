package com.lyl.homwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework5 {

	/**
	 * 题目：从磁盘上读取一个文本文件（如某个java源代码），
	 * 分别统计出其中英文字母、空格、数字的个数。
	 * 分析：使用字符输入流，每次读一个字节，然后根据中英文字母的asc码的区间
	 * 空格的的asc码，和数字的asc区间进行比较，哪个匹配正确，就加1   
	 */
	public static void main(String[] args) {

		//初始化中英文字母的个数，空格的个数，数字的个数为0
		long letter = 0;
		long number = 0;
		long space = 0;
		BufferedReader buffReader = null;

		try {
			buffReader = new BufferedReader(new FileReader("ThreadSix.java"));
			int i = 0;
			while((i = buffReader.read()) != -1){		//遍历整个文本
				//中英文大小写字母对应的asc码区间
				if(i >= 65 && i <= 90 || i >= 97 && i <= 122){
					letter++;
				}
				
				//数字对应的asc码区间
				if(i >= 48 && i <= 58)
					number++;
				
				//空格对应的asc码
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
		System.out.println("在ThreadSix.java文档中");
		System.out.println("中英文大小写字母个数为：" + letter);		//870
		System.out.println("数字的个数为：" + number);				//15
		System.out.println("空格的个数为：" + space);				//78
		
	}

}
