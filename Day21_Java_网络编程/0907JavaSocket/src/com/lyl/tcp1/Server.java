package com.lyl.tcp1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * TCP�����
	 */
	public static void main(String[] args) {
		
		try {
			//�������ض��˿ڵķ�����׽���
			ServerSocket serverSocket = new ServerSocket(12345);
			
			//���������ܵ����׽��ֵ�����
			Socket socket = serverSocket.accept();
			
			//���������
			InputStream is = socket.getInputStream();
			//����������е�����
			int i = is.read();
			System.out.println(i);
			
			//�ر������׽���
			is.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
