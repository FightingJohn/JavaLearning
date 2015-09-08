package com.lyl.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//udp通信服务端
public class Server implements Runnable {

	private int port;				//通信端口
	
	public Server(int port){
		this.port = port;
	}
	
	public void run() {
			try {
				//创建数据报套接字并绑定到指定的端口port
				DatagramSocket dgs = new DatagramSocket(port);
				
				//创建接收数据的数据报包
				byte[] buff = new byte[1024];
				DatagramPacket dgp = new DatagramPacket(buff, 1024);
				
				//服务端一直处于监听中
				while(true){
					//接收数据
					dgs.receive(dgp);
					
					//返回客户端的ip
					InetAddress ia = dgp.getAddress();
					
					//返回数据缓冲区
					byte[] b = dgp.getData();
					int len = dgp.getLength();
					
					//把缓冲区内容转化为字符串
					String data = new String(b, 0, len);
					System.out.println(ia.getHostAddress()+" 说："+data);
				}	
				
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}

}
