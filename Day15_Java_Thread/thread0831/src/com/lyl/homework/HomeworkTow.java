package com.lyl.homework;

import java.util.Random;

public class HomeworkTow {

	/**
	 * 创建一个任务，它将睡眠1到10秒之间的随机数量的时间，然后显示它的睡眠时间并退出
	 * 创建并运行多个这种任务
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
		
		
		MyThread mt1 = new MyThread(time1);
		MyThread mt2 = new MyThread(time2);
		MyThread mt3 = new MyThread(time3);
		
		//创建并启动3个线程
		new Thread(mt1, "线程1").start();
		new Thread(mt2, "线程2").start();
		new Thread(mt3, "线程3").start();
		
		System.out.println("mainThread is over");

	}

}

class MyThread implements Runnable{

	private int time;				//睡眠时间
	
	public MyThread(int time){
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
