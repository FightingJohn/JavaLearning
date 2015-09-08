package com.lyl.homework4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
	
	private int port;		//端口
	public Server(int port){
		this.port= port;
	}
	public void run() {
		try {
			//创建绑定特定端口的服务端套接字
			ServerSocket serverSocket = new ServerSocket(port);
			
			//侦听并接受到此套接字的连接
			Socket socket = serverSocket.accept();
			
			//获得输入流，放入字符缓冲输入流
			InputStream is = socket.getInputStream();
			BufferedReader buffR = new BufferedReader(new InputStreamReader(is));
			
			//存放信息的目标文件tcp3.txt
			BufferedWriter buffW = 
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream("tcp4.txt", true)));
			
			//打印读出的信息
			String str;
			//套接字连接的地址
			InetAddress ia = socket.getInetAddress();
			while((str = buffR.readLine()) != null){
				
				buffW.write(str);			//把新加入的内容添加到已有的内容后面，这样就可以保证多个文件可以同时添加到指定文件
				buffW.newLine();			//写入换行
				buffW.flush();
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
