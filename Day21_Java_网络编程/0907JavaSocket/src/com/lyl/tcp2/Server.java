package com.lyl.tcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			BufferedReader buffR = new BufferedReader(new InputStreamReader(is));
			
			//��ӡ��������Ϣ
			String str;
			//�׽������ӵĵ�ַ
			InetAddress ia = socket.getInetAddress();
			while((str = buffR.readLine()) != null){
				
				System.out.println(ia.getHostAddress()+" : "+str);
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
