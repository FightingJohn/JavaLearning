package com.lyl.tcp1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	/**
	 * TCP�ͻ���
	 */
	public static void main(String[] args) {
		
		try {
			//����һ���׽��ֲ��������ӵ�ָ���Ķ˿���
			Socket socket = new Socket("192.168.3.35", 12345);
			
			//����׽��ֵ������
			OutputStream os = socket.getOutputStream();
			
			//д����Ϣ
			os.write(97);
			
			//�ر������
			os.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
