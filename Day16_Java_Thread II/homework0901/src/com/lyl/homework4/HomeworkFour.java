package com.lyl.homework4;


public class HomeworkFour {

	/**
	 * 3������Java ���̼߳��������ʵ��һ�����������ߺ�����������ĳ��� ��һ������ǹ�ţ����в����������������1���ӵ���
	 * �������߳���һ��ѹ���̣߳���������ǹ����ѹ���ӵ����������߳���һ������̣߳������ϴ�ǹ��������ӵ��� Ҫ�� 
	 * ��1��������������˵����
	 * ����ʾ�����Ǹ������������������⣬Ҳ���̵߳�ͬ�����⣬ Ϊ�˷�ֹ�����̷߳���һ����Դʱ����æ�ȴ���
	 * Ҫʹ�õ�wait-notify�������������߳̽���ִ��; �� 
	 * ��2�����������Ҫģ�����ֶ�ǹ�ŵ�ѹ������������
	 * ��3����Ƴ���ʱӦ���ǵ������̵߳�ͬ�����⡣
	 */
	public static void main(String[] args) {

		Bullet bullet = new Bullet();

		Thread in = new Thread(new Input(bullet));
		Thread out = new Thread(new Output(bullet));

		in.start();
		out.start();
	}
}

//�ӵ�����
class Bullet {
	
	protected int num = 0;		//�ӵ������ӵ������������Ϊ1
	boolean flag = false;		// ���ڲ��ô�ȡͬʱ����
	
}

//װ���ӵ���
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
				
				bullet.num++;				//װ��һ��
				System.out.println(">>> װ��һ���ӵ�");
				bullet.flag = true;
				bullet.notify();
			}
			i++;
		}
	}
}

//�����ӵ�
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
				System.out.println("���һ���ӵ� >>>");
				bullet.flag = false;
				bullet.notify();
				i++;
			}
		}
	}
}