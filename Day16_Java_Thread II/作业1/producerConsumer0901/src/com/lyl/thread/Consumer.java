package com.lyl.thread;

//���Ѱ��ӵ��߳�
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
