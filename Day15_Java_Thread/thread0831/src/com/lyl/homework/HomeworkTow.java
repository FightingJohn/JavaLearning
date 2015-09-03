package com.lyl.homework;

import java.util.Random;

public class HomeworkTow {

	/**
	 * ����һ����������˯��1��10��֮������������ʱ�䣬Ȼ����ʾ����˯��ʱ�䲢�˳�
	 * ���������ж����������
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
		
		
		MyThread mt1 = new MyThread(time1);
		MyThread mt2 = new MyThread(time2);
		MyThread mt3 = new MyThread(time3);
		
		//����������3���߳�
		new Thread(mt1, "�߳�1").start();
		new Thread(mt2, "�߳�2").start();
		new Thread(mt3, "�߳�3").start();
		
		System.out.println("mainThread is over");

	}

}

class MyThread implements Runnable{

	private int time;				//˯��ʱ��
	
	public MyThread(int time){
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
