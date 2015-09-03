package com.lyl.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TestMain {

	/**
	 * ��ʱ��
	 * ����һöը����ָ��ʱ�䱬ը
	 */
	public static void main(String[] args) {

		//����һ����ʱ��
		Timer timer = new Timer();
		
		//����һ���µļ�ʱ������
		Mytask task = new Mytask();
		
		//����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ��
//		timer.schedule(task, 2000, 2000);			//2���ը����ը��Ȼ������뱬ըһ��
		
		timer.scheduleAtFixedRate(task, 3000, 1000);//ͬ��
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("˯���ˣ�");
		
//		timer.cancel();
		//���ش��������ʵ��ִ�е��Ѱ���ִ��ʱ��
		long time = task.scheduledExecutionTime();
		
		System.out.println("ϵͳ���ڵ�ʱ�䣺"+ System.currentTimeMillis());
		System.out.println("time = "+ time);
		System.out.println("ϵͳʱ���ȥtime :"+ (System.currentTimeMillis() - time));
	}

}

class Mytask extends TimerTask{

	
	public void run() {
		
		System.out.println("ը����ը�ˣ�");
		
	}
	
}
