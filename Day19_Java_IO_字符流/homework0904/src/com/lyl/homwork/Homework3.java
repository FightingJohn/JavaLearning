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
	 * 复制单级文件夹中指定文件到另一个盘符下的对应同名文件夹，
	 * 并修改文件名称（在复制的文件名后面加上_copy，如a.txt -->a_copy.txt）.
	 * 把E盘下的temp文件夹中的hello.txt拷贝靠D盘下的temp文件夹中
	 * 文件中含有汉字，所有采用字节输入输出（InputStreamReader和OutputStreamWriter）流解决
	 */
	public static void main(String[] args) {
		
		InputStreamReader isReader = null;
		OutputStreamWriter osWriter = null;
		
		try {
			//指定GBK编码写入
			isReader = 
					new InputStreamReader(new FileInputStream("E:\\temp\\hello.txt"), "GBK");
			
			//由于utf-8编码兼容GBK，所以采用utf-8解析
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
			if(osWriter != null)			//关闭输出流
				try {
					osWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(isReader != null)			//关闭输入流
				try {
					isReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		System.out.println("拷贝完成！");

	}

}
