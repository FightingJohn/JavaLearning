package com.lyl.homework4;


public class HomeworkFour {

	/**
	 * 3、采用Java 多线程技术，设计实现一个符合生产者和消费者问题的程序。 对一个对象（枪膛）进行操作，其最大容量是1颗子弹。
	 * 生产者线程是一个压入线程，它不断向枪膛中压入子弹；消费者线程是一个射出线程，它不断从枪膛中射出子弹。 要求： 
	 * （1）给出分析过程说明。
	 * （提示：这是个生产者与消费者问题，也是线程的同步问题， 为了防止两个线程访问一个资源时出现忙等待，
	 * 要使用的wait-notify函数，是两个线程交替执行; ） 
	 * （2）程序输出，要模拟体现对枪膛的压入和射出操作；
	 * （3）设计程序时应考虑到两个线程的同步问题。
	 */
	public static void main(String[] args) {

		Bullet bullet = new Bullet();

		Thread in = new Thread(new Input(bullet));
		Thread out = new Thread(new Output(bullet));

		in.start();
		out.start();
	}
}

//子弹夹类
class Bullet {
	
	protected int num = 0;		//子弹夹中子弹的数量，最大为1
	boolean flag = false;		// 用于不让存取同时进行
	
}

//装入子弹类
class Input implements Runnable {
	private Bullet bullet;

	Input(Bullet b) {
		this.bullet = b;
	}

	public void run() {
		int i = 0;
		while (i < 10) {
			// System.out.println(i % 2);
			synchronized (bullet) {
				if (bullet.flag)
					try {
						bullet.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				bullet.num++;				//装入一发
				System.out.println(">>> 装入一发子弹");
				bullet.flag = true;
				bullet.notify();
			}
			i++;
		}
	}
}

//发射子弹
class Output implements Runnable {
	private Bullet bullet;

	Output(Bullet b) {
		this.bullet = b;
	}

	public void run() {
		int i = 0;
		while (i < 10) {
			synchronized (bullet) {
				if (!bullet.flag)
					try {
						bullet.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				bullet.num--;
				System.out.println("射出一发子弹 >>>");
				bullet.flag = false;
				bullet.notify();
				i++;
			}
		}
	}
}