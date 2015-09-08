package com.lyl.homework4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
	
	private int port;		//�˿�
	public Server(int port){
		this.port= port;
	}
	public void run() {
		try {
			//�������ض��˿ڵķ�����׽���
			ServerSocket serverSocket = new ServerSocket(port);
			
			//���������ܵ����׽��ֵ�����
			Socket socket = serverSocket.accept();
			
			//����������������ַ�����������
			InputStream is = socket.getInputStream();
			BufferedReader buffR = new BufferedReader(new InputStreamReader(is));
			
			//�����Ϣ��Ŀ���ļ�tcp3.txt
			BufferedWriter buffW = 
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tcp4.txt", true)));
			
			//��ӡ��������Ϣ
			String str;
			//�׽������ӵĵ�ַ
			InetAddress ia = socket.getInetAddress();
			while((str = buffR.readLine()) != null){
				
				buffW.write(str);			//���¼����������ӵ����е����ݺ��棬�����Ϳ��Ա�֤����ļ�����ͬʱ��ӵ�ָ���ļ�
				buffW.newLine();			//д�뻻��
				buffW.flush();
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
