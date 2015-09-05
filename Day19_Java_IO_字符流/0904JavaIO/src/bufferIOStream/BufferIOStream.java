package bufferIOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIOStream {

	/**
	 * BufferedInputStream��BufferedOuputStream ��ϰ
	 * ʹ�û������ֽ�����������copyһ����Ƶ�ļ�
	 * ���ַ�ʽ�������ֽ�copy���Ϳ�copy
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		
		//��ʼ�����������Ϊnull����ֹΪ�ɹ���ʼ��ʱ���ֵĹر��쳣
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		long startTime = System.currentTimeMillis();
		
		copy1(bis,  bos);					//328 ms
		
//		copy2(bis,  bos);					//15 ms
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("������ʱ��"+ (endTime - startTime));

	}

	//�����ֽڿ���
	private static void copy1(BufferedInputStream bis, BufferedOutputStream bos)  {
		
		try {
			bis = new BufferedInputStream(new FileInputStream("byebye.mp3"));
			bos = new BufferedOutputStream(new FileOutputStream("byebye1.mp3"));
			
			int i = 0;
			//ÿ��copyһ���ֽڵ�����
			while((i = bis.read()) != -1){
				
				bos.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bos != null)				//�ر������
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			
			if(bis != null)				//�ر�������
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
		}
		
	}
	
	//�鿽��
	private static void copy2(BufferedInputStream bis, BufferedOutputStream bos)  {
		
		try {
			bis = new BufferedInputStream(new FileInputStream("byebye.mp3"));
			bos = new BufferedOutputStream(new FileOutputStream("byebye2.mp3"));
			
			byte[] b = new byte[1024];		//�½�һ���ַ����飬���ַ�����Ϊ��λ���п���
			int len = 0;
			//ÿ��copyһ���ֽڵ�����
			while((len = bis.read(b, 0, 1024)) != -1){
				
				bos.write(b, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bos != null)				//�ر������
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			
			if(bis != null)				//�ر�������
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}			
		}
	}

}
