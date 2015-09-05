package fileReaderWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {

	/**
	 * �ַ�������������� ���ַ�ʽ�������к��ֵ�java�ĵ�
	 * ʹ��FileReader �̳�OutputStreamReader �� FileWriter �̳�InputStreamWriterʵ��
	 * ע�⣺���涨һ�ֱ���д��ʱ���ڶ�����ʱ��һ��Ҫʹ�����ֱ�����߼������ֱ���ı���
	 * @throws IOException 
	 */
	public static void main(String[] args) {

		//�ѱ��ļ��������ThreadSix.java������test.java����test1.java
		FileReader fReader = null;
		FileWriter fWriter = null;
		
		copy1(fReader, fWriter);
		copy2(fReader, fWriter);
		System.out.println("copy is over!");

	}

	//�����ַ����п���
	private static void copy1(FileReader fReader, FileWriter fWriter) {
		
		try {
			fReader = new FileReader("ThreadSix.java");
			fWriter = new FileWriter("test.java");
			
			int i = 0;
			while((i = fReader.read()) != -1){				//��ȡ�����ַ�
				
				fWriter.write(i);
				fWriter.flush();							//ˢ�¸����Ļ���
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fWriter != null)		//�ر������
				try {
					fWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(fReader != null)		//�ر�������
				try {
					fReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
		}
			
	}
	
	//�鿽��
	private static void copy2(FileReader fReader, FileWriter fWriter) {
		
		try {
			fReader = new FileReader("ThreadSix.java");
			fWriter = new FileWriter("test1.java");
			
			int len = 0;
			char[] c = new char[1024];
			while((len = fReader.read(c, 0, 1024)) != -1){
				
				fWriter.write(c, 0, len);
				fWriter.flush();							//ˢ�¸����Ļ���
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fWriter != null)		//�ر������
				try {
					fWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			if(fReader != null)		//�ر�������
				try {
					fReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
		}
			
	}

}
