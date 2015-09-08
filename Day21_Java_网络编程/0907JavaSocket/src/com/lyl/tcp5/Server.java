package com.lyl.tcp5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP�����
 */
public class Server implements Runnable{

	@Override
	public void run() {
		try {
			//�������ض��˿ڵķ�����׽���
			ServerSocket serverSocket = new ServerSocket(12345);
			
			//���������ܵ����׽��ֵ�����
			Socket socket = serverSocket.accept();
			
			//����������������ַ�����������
			InputStream is = socket.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			
			//�����Ϣ��Ŀ���ļ�2.jpg
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("2.jpg"));
			
			//�������ֽ�������Ϣ������
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = bis.read(buf, 0, 1024)) != -1){
				
				bos.write(buf, 0, len);
			}
			
			//���Զ�������û�н���		
			System.out.println("read is over");
			
			//�ر������׽���
			is.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
