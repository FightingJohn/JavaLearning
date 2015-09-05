package com.lyl.homework;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework3 {

	/**
	 *在一个文件中写入10个数字。使用文件输入流将这10个数读到内存中，然后进行排序。
	    将排好序的数字输出到另一个文件中。
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//向hw3.txt内写入0到50之间的10个随机数
		PrintStream ps1 = new PrintStream("hw3.txt");
		
		for(int i = 0; i < 10; i++){
			//0~50随机数
			int temp = (int)(Math.random() * 50);
			ps1.write(temp);
		}
		
		ps1.close();
		
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream("hw3.txt"));
		//将排好顺序的10个数字写到sorthw3.txt
		PrintStream ps2 = new PrintStream("sorthw3.txt");
		
		int i = 0;
		int j = 0;						//数组下标
		int[] arr = new int[10];		//存放从文件读出来的10个数
		while((i = bis.read()) != -1){
			arr[j] = i;
			j++;
		}
		sortArr(arr, ps2);					//数组进行排序并放入目标文件
		
		//关闭输入输出流
		ps2.close();
		bis.close();
		
		System.out.println("copy is over!");

	}
	
	//整型数组排序——降序
	private static void sortArr(int[] arr, PrintStream ps){
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] < arr[j]){
					//交换值
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			//将排序好的数组放入sorthw3.txt
			ps.println(arr[i]);
		}
	}

}
