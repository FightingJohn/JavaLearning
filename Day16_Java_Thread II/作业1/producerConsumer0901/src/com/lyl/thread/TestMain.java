package com.lyl.thread;

public class TestMain {

	/**
	 * �����������Ӻ��������������
	 */
	public static void main(String[] args) {

		Baozi bun = new Baozi();
		
		Producer pro = new Producer(bun);
		Consumer con = new Consumer(bun);
		
		new Thread(pro).start();
		new Thread(con).start();

	}

}
