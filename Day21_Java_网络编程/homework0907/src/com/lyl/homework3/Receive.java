package com.lyl.homework3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class Receive implements Runnable{
	private DatagramPacket dpacket;
	private DatagramSocket dsocket;
    public Receive(DatagramSocket dsocket)
    {
    	this.dsocket=dsocket;
    }
    
	public void run() {
		
		while (true) {
			byte[] buf=new byte[1024];
			dpacket=new DatagramPacket(buf, buf.length);
			try {
				
				dsocket.receive(dpacket);
				String ip=dpacket.getAddress().getHostAddress();
				String data=new String(dpacket.getData(), 0, dpacket.getLength());
				int portstring=dpacket.getPort();
				System.out.println("ip:"+ip+"¶Ë¿Ú:"+portstring+"\n"+data);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
					
		}
	}
	
}
