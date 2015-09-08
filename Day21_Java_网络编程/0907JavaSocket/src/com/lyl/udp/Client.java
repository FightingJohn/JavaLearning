package com.lyl.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//udp通信客户端
public class Client implements Runnable {

	private String address; 			// 服务端的ip地址
	private int port; 					// 通信端口号

	//构造方法，输入服务端ip和通信接口
	public Client(String address, int port) {
		this.address = address;
		this.port = port;
	}

	public void run() {
			try {
				// 构造数据包套接字
				DatagramSocket dgs = new DatagramSocket();
				// 键盘录入要发送数据
				BufferedReader buffR = new BufferedReader(new InputStreamReader(System.in));
				String str;
				while((str = buffR.readLine()) != null){
					
					DatagramPacket dgp = new DatagramPacket
							(str.getBytes(), str.getBytes().length, InetAddress.getByName(address), port);
					//发送到服务端
					dgs.send(dgp);
				}
				
				//关闭流释放资源
				buffR.close();
				dgs.close();

			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
	}

}
