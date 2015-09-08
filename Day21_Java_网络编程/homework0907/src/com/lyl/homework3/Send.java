package com.lyl.homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * �ͷ���
 */
class Send implements Runnable{
	
	private DatagramPacket dpacket;
	private DatagramSocket dsocket;
    public Send(DatagramSocket dsocket)
    {
    	this.dsocket=dsocket;
    }
    
	public void run() {
		
		try {
			BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));//�Ӽ��̶�ȡ����
			String string;
			while ((string=bufferedreader.readLine())!=null) {//ѭ����ȡ
				if (string.equals("bye")) 
				{
					System.err.println("��������");
					System.exit(0);
				
				}
				//��������ַ���ת��Ϊ�ֽ�����
				byte []buf=string.getBytes();
				
				//��ȡ����IP��Ȼ��ӱ����˿ں�Ϊ18888�Ķ˿ڷ��ͳ�ȥ
				String ip=InetAddress.getLocalHost().getHostAddress().toString();
				dpacket=new DatagramPacket(buf, buf.length, InetAddress.getByName(ip), 18888);
				dsocket.send(dpacket);
			}
		} catch (Exception e) {
			System.err.println("��������ʧ��");
			e.printStackTrace();
		}
	}
	
}
