package com.lyl.homework4;

public class MainDemo {

	/**
	 *�ͻ��˼���¼�룬���������������̨
	 */
	public static void main(String[] args) {
		
		Client client1 = new Client(12345);
		Client client2 = new Client(12346);
		
		Server server1 = new Server(12345);
		Server server2 = new Server(12346);
		
		new Thread(client1).start();
		new Thread(client2).start();
		new Thread(server1).start();
		new Thread(server2).start();
		System.out.println("��ȡ�ļ����浽�ļ���");

	}

}
