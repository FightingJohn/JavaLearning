package com.lyl.udp;

public class MainDemo {

	/**
	 * 
	 */
	public static void main(String[] args) {

		//±¾»ú²âÊÔ
		Client client = new Client("192.168.3.35", 10011);
		Server server = new Server(10011);
		
		new Thread(server).start();
		new Thread(client).start();

	}

}
