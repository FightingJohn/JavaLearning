package com.lyl.homework;

import java.util.Random;

public class HomeworkThree {

	/**
	 * ������HomeworkTow�е������߳��޸ĳ��ػ��̣߳�����֤һ��main�����˳�������������ֹ��
	 */
	public static void main(String[] args) {
		
		//���3��1��10֮��������
//		int time1 = (int)(1 + Math.random() * 10);
//		int time2 = (int)(1 + Math.random() * 10);
//		int time3 = (int)(1 + Math.random() * 10);
		
		//���3��1��10������������
		Random r = new Random();
		int time1 = r.nextInt(9000) + 1000;
		int time2 = r.nextInt(9000) + 1000;
		int time3 = r.nextInt(9000) + 1000;
		
		
		MyThread1 mt1 = new MyThread1(time1);
		MyThread1 mt2 = new MyThread1(time2);
		MyThread1 mt3 = new MyThread1(time3);
		
		//����������3���߳�
		Thread thread1 = new Thread(mt1, "�߳�1");
		Thread thread2 = new Thread(mt2, "�߳�2");
		Thread thread3 = new Thread(mt3, "�߳�3");
		
		//�����߳�Ϊ�ػ��߳�
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

	private int time;				//˯��ʱ��
	
	public MyThread1(int time){
		this.time = time;
	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " ����˯��ʱ�䣺"+this.time +"����");
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ������");
		
	}
	
}
