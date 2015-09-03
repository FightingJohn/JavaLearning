package com.lyl.homework3;

public class HomeworkThree {

	/**
	 * 就是创建2个线程，每个线程都打印从0到99这100个数字，我们希望线程之间不会出现交叉乱序打印，而是顺序地打印。
	 */
	public static void main(String[] args) {

		MyThread mt1 = new MyThread("线程 1");
		MyThread mt2 = new MyThread("线程 2");
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}

class MyThread implements Runnable{

	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	public void run() {
		
		for(int i = 0; i < 100; i++){
			System.out.println(name + " ----- " + i);
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
