package com.lyl.thread;

//���������߳�
public class Producer implements Runnable{
	
	private Baozi bun;

	public Producer(Baozi bun){
		this.bun = bun;
	}
	
	public void run() {
		
		while(bun.getNum() < 10){
			bun.setBaozi();
		}

	}
	
}
