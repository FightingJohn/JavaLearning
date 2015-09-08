package com.lyl.tcp1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	/**
	 * TCP客户端
	 */
	public static void main(String[] args) {
		
		try {
			//创建一个套接字并把它链接到指定的端口上
			Socket socket = new Socket("192.168.3.35", 12345);
			
			//获得套接字的输出流
			OutputStream os = socket.getOutputStream();
			
			//写入信息
			os.write(97);
			
			//关闭输出流
			os.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
