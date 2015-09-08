package com.lyl.tcp5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.OutputStream;
import java.net.Socket;
/**
 * TCP�ͻ���
 */
public class Client implements Runnable{

	@Override
	public void run() {
		try {
			//����һ���׽��ֲ��������ӵ�ָ���Ķ˿���
			Socket socket = new Socket("192.168.3.35", 12345);
			
			//����׽��ֵ������,���뻺���ֽ�����
			OutputStream os = socket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			//1.jpgͼƬд�������
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.jpg"));
			
			//���������д�����̨�������Ϣ
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = bis.read(buf, 0, 1024)) != -1){
				
				bos.write(buf, 0, len);
			}
			
			//�ر������
			os.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
