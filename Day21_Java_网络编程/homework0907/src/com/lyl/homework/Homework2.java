package com.lyl.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Homework2 {

	/**
	 * 根据今天上课的内容，模拟实现一个ping命令，仅用于检测某服务器http服务是否有打开。
	 * （提示：http服务默认端口为80。可以用tcp socket的特性）
	 */
	public static void main(String[] args) {
		
		//测试用例百度
		
		String host = "www.baidu.com";
		int timeout = 3000;				//超时应该在3秒以上
		InetAddress ia;
		try {
			ia = InetAddress.getByName(host);
			
			//测试是否可以达到该地址
			boolean status = ia.isReachable(timeout);
			if(status){
				System.out.println("来自 "+ia.getHostAddress()+" 回复：连接可用！");
			}
			else{
				System.out.println("来自 "+ia.getHostAddress()+" 回复：无法访问目标主机！");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
