package bufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferRW {

	/**
	 * 带有缓冲区的字符输入流和字符输出流BufferedReader,BufferedWriter
	 * 使用3中方式拷贝ThreadSix.java
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		BufferedReader buffReader = null;
		BufferedWriter buffWriter = null;
		
		copy1(buffReader, buffWriter);
		copy2(buffReader, buffWriter);
		copy3(buffReader, buffWriter);
		
		System.out.println(" copy is over ！");

	}

	//方式1 单个字符拷贝
	private static void copy1(BufferedReader buffReader,
			BufferedWriter buffWriter) {
		
		try {
			buffReader = new BufferedReader(new FileReader("ThreadSix.java"));
			buffWriter = new BufferedWriter(new FileWriter("test2.java"));
			
			int i = 0;
			while((i = buffReader.read()) != -1){
				
				buffWriter.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(buffReader != null)		//关闭输出流
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//关闭输入流
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	//方式2 块拷贝
	private static void copy2(BufferedReader buffReader,
			BufferedWriter buffWriter) {
		
		try {
			buffReader = new BufferedReader(new FileReader("ThreadSix.java"));
			buffWriter = new BufferedWriter(new FileWriter("test3.java"));
			
			int len = 0;
			char[] c = new char[1024];
			while((len = buffReader.read(c, 0, 1024)) != -1){
				
				buffWriter.write(c, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(buffReader != null)		//关闭输出流
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//关闭输入流
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	//方式3 使用readline和newline方法
	private static void copy3(BufferedReader buffReader,
			BufferedWriter buffWriter) {
		
		try {
			buffReader = new BufferedReader(new FileReader("ThreadSix.java"));
			buffWriter = new BufferedWriter(new FileWriter("test4.java"));
			
			String str;
			while((str = buffReader.readLine()) != null){		//每次读取文本的一行，但是不读换行符
				
				buffWriter.write(str);							//写入一行
				buffWriter.newLine();							//写入换行符
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(buffReader != null)		//关闭输出流
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//关闭输入流
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
