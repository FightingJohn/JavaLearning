package com.lyl.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {

	/**
	 * �̳߳صĻ�������
	 * @param ExecutorService threadpool 
	 */
	public static void main(String[] args) {
		
		//����һ������10���߳������̳߳�
		ExecutorService threadpool = Executors.newFixedThreadPool(10);
		//�½������߳� 
		MyThread mt1 = new MyThread("�߳�1");
		MyThread mt2 = new MyThread("�߳�2");
		
		//�ύ�����̲߳�ִ��
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
