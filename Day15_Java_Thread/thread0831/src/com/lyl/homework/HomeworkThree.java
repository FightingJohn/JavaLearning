package com.lyl.homework;

import java.util.Random;

public class HomeworkThree {

	/**
	 * 将任务HomeworkTow中的所有线程修改成守护线程，并验证一旦main函数退出，程序立刻终止。
	 */
	public static void main(String[] args) {
		
		//获得3个1到10之间的随机数
//		int time1 = (int)(1 + Math.random() * 10);
//		int time2 = (int)(1 + Math.random() * 10);
//		int time3 = (int)(1 + Math.random() * 10);
		
		//获得3个1到10秒的任意随机数
		Random r = new Random();
		int time1 = r.nextInt(9000) + 1000;
		int time2 = r.nextInt(9000) + 1000;
		int time3 = r.nextInt(9000) + 1000;
		
		
		MyThread1 mt1 = new MyThread1(time1);
		MyThread1 mt2 = new MyThread1(time2);
		MyThread1 mt3 = new MyThread1(time3);
		
		//创建并启动3个线程
		Thread thread1 = new Thread(mt1, "线程1");
		Thread thread2 = new Thread(mt2, "线程2");
		Thread thread3 = new Thread(mt3, "线程3");
		
		//设置线程为守护线程
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		thread3.setDaemon(true);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		System.out.println(Thread.currentThread().getPriority()+" mainThread is over");

	}

}

class MyThread1 implements Runnable{

	private int time;				//睡眠时间
	
	public MyThread1(int time){
		this.time = time;
	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " 进入睡眠时间："+this.time +"毫秒");
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 苏醒啦");
		
	}
	
}
