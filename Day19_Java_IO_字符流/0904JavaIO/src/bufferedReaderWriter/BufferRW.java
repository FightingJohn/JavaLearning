package bufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferRW {

	/**
	 * ���л��������ַ����������ַ������BufferedReader,BufferedWriter
	 * ʹ��3�з�ʽ����ThreadSix.java
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		BufferedReader buffReader = null;
		BufferedWriter buffWriter = null;
		
		copy1(buffReader, buffWriter);
		copy2(buffReader, buffWriter);
		copy3(buffReader, buffWriter);
		
		System.out.println(" copy is over ��");

	}

	//��ʽ1 �����ַ�����
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
			if(buffReader != null)		//�ر������
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//�ر�������
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	//��ʽ2 �鿽��
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
			if(buffReader != null)		//�ر������
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//�ر�������
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	//��ʽ3 ʹ��readline��newline����
	private static void copy3(BufferedReader buffReader,
			BufferedWriter buffWriter) {
		
		try {
			buffReader = new BufferedReader(new FileReader("ThreadSix.java"));
			buffWriter = new BufferedWriter(new FileWriter("test4.java"));
			
			String str;
			while((str = buffReader.readLine()) != null){		//ÿ�ζ�ȡ�ı���һ�У����ǲ������з�
				
				buffWriter.write(str);							//д��һ��
				buffWriter.newLine();							//д�뻻�з�
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(buffReader != null)		//�ر������
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(buffWriter != null)		//�ر�������
				try {
					buffReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
