package com.lyl.homework3;

import java.net.DatagramSocket;
import java.net.SocketException;

public class MainDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			new Thread(new Send(new DatagramSocket())).start();
			new Thread(new Receive(new DatagramSocket(18888))).start();
			
		} catch (SocketException e) {
			e.printStackTrace();
		}
	    
	    

	}

}
