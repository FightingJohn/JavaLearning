package com.cskaoyan.upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class SeverThread implements Runnable {
	
	Socket socket;
	
    //默认Server端只处理 同类型文件 
	
	public SeverThread(Socket socket) {
		super();
		this.socket = socket;
	}

    //
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			InputStream inputStream = socket.getInputStream();
			
			String name = System.currentTimeMillis()+".jpg";
			
			BufferedInputStream bis =new BufferedInputStream(inputStream);
			BufferedOutputStream  bos = new BufferedOutputStream(new FileOutputStream(name));
	 	
	        byte[] buf = new byte[1024];
	        int len=0;
			while ( (len=bis.read(buf, 0, 1024))!=-1) {
				  bos.write(buf, 0, len);
			}
			
			 bis.close();
			 bos.close();
			 
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		

	}

}
