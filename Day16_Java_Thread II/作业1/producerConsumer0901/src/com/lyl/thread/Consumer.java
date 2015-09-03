package com.lyl.thread;

//消费包子的线程
public class Consumer implements Runnable{
	
	private Baozi bun;

	public Consumer(Baozi bun){
		this.bun = bun;
	}
	
	public void run() {
		while(bun.getNum() < 10){
			bun.getBaozi();
		}
	}

}
