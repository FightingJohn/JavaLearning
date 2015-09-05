package fileReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

	/**
	 * 字符输入输出流—— 两种方式拷贝含有汉字的java文档
	 * 使用FileReader 继承OutputStreamReader 和 FileWriter 继承InputStreamWriter实现
	 * 注意：当规定一种编码写入时，在读出的时候，一定要使用这种编码或者兼容这种编码的编码
	 * @throws IOException 
	 */
	public static void main(String[] args) {

		//把本文件夹下面的ThreadSix.java拷贝到test.java或者test1.java
		FileReader fReader = null;
		FileWriter fWriter = null;
		
		copy1(fReader, fWriter);
		copy2(fReader, fWriter);
		System.out.println("copy is over!");

	}

	//单个字符进行拷贝
	private static void copy1(FileReader fReader, FileWriter fWriter) {
		
		try {
			fReader = new FileReader("ThreadSix.java");
			fWriter = new FileWriter("test.java");
			
			int i = 0;
			while((i = fReader.read()) != -1){				//读取单个字符
				
				fWriter.write(i);
				fWriter.flush();							//刷新该流的缓冲
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fWriter != null)		//关闭输出流
				try {
					fWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(fReader != null)		//关闭输入流
				try {
					fReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
		}
			
	}
	
	//块拷贝
	private static void copy2(FileReader fReader, FileWriter fWriter) {
		
		try {
			fReader = new FileReader("ThreadSix.java");
			fWriter = new FileWriter("test1.java");
			
			int len = 0;
			char[] c = new char[1024];
			while((len = fReader.read(c, 0, 1024)) != -1){
				
				fWriter.write(c, 0, len);
				fWriter.flush();							//刷新该流的缓冲
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fWriter != null)		//关闭输出流
				try {
					fWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(fReader != null)		//关闭输入流
				try {
					fReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
		}
			
	}

}
