package com.lyl.tcp4;

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
			
			//����׽��ֵ������,���뻺���ַ�����
			OutputStream os = socket.getOutputStream();
			BufferedWriter buffW = new BufferedWriter(new OutputStreamWriter(os));
			
			//��FileDemo2.java��ȡ��Ϣд�������
			BufferedReader buffR = 
					new BufferedReader(new InputStreamReader(new FileInputStream("FileDemo2.java")));
			
			//���������д�����̨�������Ϣ
			String str;
			while((str = buffR.readLine()) != null){
				buffW.write(str);
				buffW.newLine();			//д�뻻��
				buffW.flush();				//ˢ�»�����
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
