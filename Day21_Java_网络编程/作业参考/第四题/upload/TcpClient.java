package com.cskaoyan.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class TcpClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		 Socket socket = new Socket("192.168.3.31",10086);
		 
		 //客户端键盘录入,服务器输出到控制台

		 
		 BufferedInputStream bis = new BufferedInputStream(new FileInputStream("MM.jpg"));
 		 OutputStream outputStream = socket.getOutputStream();
		 BufferedOutputStream bos = new BufferedOutputStream( outputStream);

         byte[] buf = new byte[1024];
         int len=0;
		 
		 while ((len=bis.read(buf, 0, 1024))!=-1) {
			  bos.write(buf, 0, len);
		 } 
		 
		 bis.close();
		 bos.close();
		 socket.close();
		
	}

}
