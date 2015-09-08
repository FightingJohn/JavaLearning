package com.lyl.tcp4;

public class MainDemo {

	/**
	 *客户端键盘录入，服务器输出到控制台
	 */
	public static void main(String[] args) {
		
		Client client = new Client();
		Server server = new Server();
		
		new Thread(client).start();
		new Thread(server).start();
		System.out.println("读取文件，存到文件中");

	}

}
