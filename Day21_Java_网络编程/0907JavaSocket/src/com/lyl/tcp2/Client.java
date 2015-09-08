package com.lyl.tcp2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
			
			//获得套接字的输出流,放入缓冲字符流内
			OutputStream os = socket.getOutputStream();
			BufferedWriter buffW = new BufferedWriter(new OutputStreamWriter(os));
			
			//获得控制台输入
			BufferedReader buffR = new BufferedReader(new InputStreamReader(System.in));
			
			//向输出流中写入控制台输入的信息
			String str;
			while((str = buffR.readLine()) != null){
				buffW.write(str);
				buffW.newLine();			//写入换行
				buffW.flush();				//刷新缓冲区
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
