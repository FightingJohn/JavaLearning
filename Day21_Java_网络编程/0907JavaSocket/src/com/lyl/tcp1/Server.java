package com.lyl.tcp1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * TCP服务端
	 */
	public static void main(String[] args) {
		
		try {
			//创建绑定特定端口的服务端套接字
			ServerSocket serverSocket = new ServerSocket(12345);
			
			//侦听并接受到此套接字的连接
			Socket socket = serverSocket.accept();
			
			//获得输入流
			InputStream is = socket.getInputStream();
			//获得输入流中的内容
			int i = is.read();
			System.out.println(i);
			
			//关闭流和套接字
			is.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
