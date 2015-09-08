package com.lyl.tcp5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			BufferedInputStream bis = new BufferedInputStream(is);
			
			//存放信息的目标文件2.jpg
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("2.jpg"));
			
			//把输入字节流的信息读出来
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = bis.read(buf, 0, 1024)) != -1){
				
				bos.write(buf, 0, len);
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
