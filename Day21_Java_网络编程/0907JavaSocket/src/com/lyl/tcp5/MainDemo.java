package com.lyl.tcp5;

public class MainDemo {

	/**
	 *�ͻ��˼���¼�룬���������������̨
	 */
	public static void main(String[] args) {
		
		Client client = new Client();
		Server server = new Server();
		
		new Thread(client).start();
		new Thread(server).start();
		System.out.println("����ͼƬ");

	}

}
