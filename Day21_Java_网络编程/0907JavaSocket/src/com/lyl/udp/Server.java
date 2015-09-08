package com.lyl.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//udpͨ�ŷ����
public class Server implements Runnable {

	private int port;				//ͨ�Ŷ˿�
	
	public Server(int port){
		this.port = port;
	}
	
	public void run() {
			try {
				//�������ݱ��׽��ֲ��󶨵�ָ���Ķ˿�port
				DatagramSocket dgs = new DatagramSocket(port);
				
				//�����������ݵ����ݱ���
				byte[] buff = new byte[1024];
				DatagramPacket dgp = new DatagramPacket(buff, 1024);
				
				//�����һֱ���ڼ�����
				while(true){
					//��������
					dgs.receive(dgp);
					
					//���ؿͻ��˵�ip
					InetAddress ia = dgp.getAddress();
					
					//�������ݻ�����
					byte[] b = dgp.getData();
					int len = dgp.getLength();
					
					//�ѻ���������ת��Ϊ�ַ���
					String data = new String(b, 0, len);
					System.out.println(ia.getHostAddress()+" ˵��"+data);
				}	
				
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}

}
