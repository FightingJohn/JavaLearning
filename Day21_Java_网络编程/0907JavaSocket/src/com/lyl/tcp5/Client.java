package com.lyl.tcp5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.OutputStream;
import java.net.Socket;
/**
 * TCP客户端
 */
public class Client implements Runnable{

	@Override
	public void run() {
		try {
			//创建一个套接字并把它链接到指定的端口上
			Socket socket = new Socket("192.168.3.35", 12345);
			
			//获得套接字的输出流,放入缓冲字节流内
			OutputStream os = socket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			//1.jpg图片写入输出流
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("1.jpg"));
			
			//向输出流中写入控制台输入的信息
			int len = 0;
			byte[] buf = new byte[1024];
			while((len = bis.read(buf, 0, 1024)) != -1){
				
				bos.write(buf, 0, len);
			}
			
			//关闭输出流
			os.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
