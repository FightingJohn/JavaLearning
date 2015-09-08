package com.lyl.homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 客服端
 */
class Send implements Runnable{
	
	private DatagramPacket dpacket;
	private DatagramSocket dsocket;
    public Send(DatagramSocket dsocket)
    {
    	this.dsocket=dsocket;
    }
    
	public void run() {
		
		try {
			BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(System.in));//从键盘读取数据
			String string;
			while ((string=bufferedreader.readLine())!=null) {//循环读取
				if (string.equals("bye")) 
				{
					System.err.println("我下线了");
					System.exit(0);
				
				}
				//将输入的字符串转换为字节数组
				byte []buf=string.getBytes();
				
				//获取本机IP，然后从本机端口号为18888的端口发送出去
				String ip=InetAddress.getLocalHost().getHostAddress().toString();
				dpacket=new DatagramPacket(buf, buf.length, InetAddress.getByName(ip), 18888);
				dsocket.send(dpacket);
			}
		} catch (Exception e) {
			System.err.println("发送数据失败");
			e.printStackTrace();
		}
	}
	
}
