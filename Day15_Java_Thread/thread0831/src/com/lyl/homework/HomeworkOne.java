package com.lyl.homework;

public class HomeworkOne {

	/**
	 * ģ��ര����Ʊ
	 * һ��100��Ʊ��3����Ʊ���ڣ�����Ϊֹ
	 */
	public static void main(String[] args) {
		
		SellTicket st = new SellTicket();
		
		Thread window1 = new Thread(st, "����1");
		Thread window2 = new Thread(st, "����2");
		Thread window3 = new Thread(st, "����3");
		System.out.println("һ�� 100 ��Ʊ");
		
		window1.start();
		window2.start();
		window3.start();

	}

}

class SellTicket implements Runnable{

	int tickets = 100;			//100��Ʊ
	
	public void run() {

		//�ж�Ʊ����û����
		while(tickets > 0){
			synchronized (this) {				//ͬ����
				tickets--;						//��ʾ����һ��Ʊ
				if(tickets >= 0)				//�������ʣ�ฺ��Ʊ
					System.out.println(Thread.currentThread().getName()+" ����һ��Ʊ��ʣ��Ʊ����"+ tickets);
			}
		}
		
	}
	
}
