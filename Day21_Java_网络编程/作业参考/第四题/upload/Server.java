package com.cskaoyan.upload;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] a) throws IOException   {
	  
	  ServerSocket serverSocket = new ServerSocket(10086);
		
	  while (true) {
		   Socket accept = serverSocket.accept();
		   SeverThread sThread = new SeverThread(accept) ;
		   new Thread(sThread).start();
	  }
	
  }
 
}
