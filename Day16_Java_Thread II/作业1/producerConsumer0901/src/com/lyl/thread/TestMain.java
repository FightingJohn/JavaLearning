package com.lyl.thread;

public class TestMain {

	/**
	 * 测试生产包子和卖包子这个过程
	 */
	public static void main(String[] args) {

		Baozi bun = new Baozi();
		
		Producer pro = new Producer(bun);
		Consumer con = new Consumer(bun);
		
		new Thread(pro).start();
		new Thread(con).start();

	}

}
