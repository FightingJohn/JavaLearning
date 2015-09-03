package com.lyl.homework3;

public class HomeworkThree {

	/**
	 * ���Ǵ���2���̣߳�ÿ���̶߳���ӡ��0��99��100�����֣�����ϣ���߳�֮�䲻����ֽ��������ӡ������˳��ش�ӡ��
	 */
	public static void main(String[] args) {

		MyThread mt1 = new MyThread("�߳� 1");
		MyThread mt2 = new MyThread("�߳� 2");
		
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
