package com.lyl.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//udpͨ�ſͻ���
public class Client implements Runnable {

	private String address; 			// ����˵�ip��ַ
	private int port; 					// ͨ�Ŷ˿ں�

	//���췽������������ip��ͨ�Žӿ�
	public Client(String address, int port) {
		this.address = address;
		this.port = port;
	}

	public void run() {
			try {
				// �������ݰ��׽���
				DatagramSocket dgs = new DatagramSocket();
				// ����¼��Ҫ��������
				BufferedReader buffR = new BufferedReader(new InputStreamReader(System.in));
				String str;
				while((str = buffR.readLine()) != null){
					
					DatagramPacket dgp = new DatagramPacket
							(str.getBytes(), str.getBytes().length, InetAddress.getByName(address), port);
					//���͵������
					dgs.send(dgp);
				}
				
				//�ر����ͷ���Դ
				buffR.close();
				dgs.close();

			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
	}

}
