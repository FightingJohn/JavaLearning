package com.lyl.homework;

public class HomeworkOne {

	/**
	 * 模拟多窗口卖票
	 * 一共100张票，3个售票窗口，售完为止
	 */
	public static void main(String[] args) {
		
		SellTicket st = new SellTicket();
		
		Thread window1 = new Thread(st, "窗口1");
		Thread window2 = new Thread(st, "窗口2");
		Thread window3 = new Thread(st, "窗口3");
		System.out.println("一共 100 张票");
		
		window1.start();
		window2.start();
		window3.start();

	}

}

class SellTicket implements Runnable{

	int tickets = 100;			//100张票
	
	public void run() {

		//判断票数有没有完
		while(tickets > 0){
			synchronized (this) {				//同步锁
				tickets--;						//表示卖了一张票
				if(tickets >= 0)				//避免出现剩余负数票
					System.out.println(Thread.currentThread().getName()+" 卖出一张票，剩余票数："+ tickets);
			}
		}
		
	}
	
}
