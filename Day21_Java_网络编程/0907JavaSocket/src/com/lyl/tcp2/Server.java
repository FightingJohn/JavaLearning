package com.lyl.tcp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端
 */
public class Server implements Runnable{

	@Override
	public void run() {
		try {
			//创建绑定特定端口的服务端套接字
			ServerSocket serverSocket = new ServerSocket(12345);
			
			//侦听并接受到此套接字的连接
			Socket socket = serverSocket.accept();
			
			//获得输入流，放入字符缓冲输入流
			InputStream is = socket.getInputStream();
			BufferedReader buffR = new BufferedReader(new InputStreamReader(is));
			
			//打印读出的信息
			String str;
			//套接字连接的地址
			InetAddress ia = socket.getInetAddress();
			while((str = buffR.readLine()) != null){
				
				System.out.println(ia.getHostAddress()+" : "+str);
			}
			
			//测试读操作有没有结束		
			System.out.println("read is over");
			
			//关闭流和套接字
			is.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
