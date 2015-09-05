package bufferIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIOStream {

	/**
	 * BufferedInputStream和BufferedOuputStream 练习
	 * 使用缓冲区字节输入和输出流copy一份音频文件
	 * 两种方式：单个字节copy，和块copy
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		
		//初始化输入输出流为null，防止为成功初始化时出现的关闭异常
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		long startTime = System.currentTimeMillis();
		
		copy1(bis,  bos);					//328 ms
		
//		copy2(bis,  bos);					//15 ms
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("拷贝耗时："+ (endTime - startTime));

	}

	//单个字节拷贝
	private static void copy1(BufferedInputStream bis, BufferedOutputStream bos)  {
		
		try {
			bis = new BufferedInputStream(new FileInputStream("byebye.mp3"));
			bos = new BufferedOutputStream(new FileOutputStream("byebye1.mp3"));
			
			int i = 0;
			//每次copy一个字节的内容
			while((i = bis.read()) != -1){
				
				bos.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bos != null)				//关闭输出流
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			
			if(bis != null)				//关闭输入流
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
		}
		
	}
	
	//块拷贝
	private static void copy2(BufferedInputStream bis, BufferedOutputStream bos)  {
		
		try {
			bis = new BufferedInputStream(new FileInputStream("byebye.mp3"));
			bos = new BufferedOutputStream(new FileOutputStream("byebye2.mp3"));
			
			byte[] b = new byte[1024];		//新建一个字符数组，以字符数组为单位进行拷贝
			int len = 0;
			//每次copy一个字节的内容
			while((len = bis.read(b, 0, 1024)) != -1){
				
				bos.write(b, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bos != null)				//关闭输出流
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			
			if(bis != null)				//关闭输入流
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
		}
	}

}
