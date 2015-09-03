package com.lyl.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {

	/**
	 * 线程池的基本操作
	 * @param ExecutorService threadpool 
	 */
	public static void main(String[] args) {
		
		//创建一个含有10个线程数的线程池
		ExecutorService threadpool = Executors.newFixedThreadPool(10);
		//新建两个线程 
		MyThread mt1 = new MyThread("线程1");
		MyThread mt2 = new MyThread("线程2");
		
		//提交两个线程并执行
		threadpool.submit(mt1);
		threadpool.submit(mt2);

	}

}

class MyThread implements Runnable{

	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	public void run() {
		
		for(int i = 0; i < 30; i++){
			System.out.println(name+"  "+ i);
		}
	}
	
}
