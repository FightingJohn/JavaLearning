package com.lyl.homework5;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class HomeworkFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����һ����ʱ��
		Timer timer = new Timer();

		// ����һ���µļ�ʱ������
		Mytask task = new Mytask();
		
		//  ������ָ����ʱ��ִ��ָ�������������ʱ���ѹ�ȥ����������ִ�и�����
		Date time = new Date(System.currentTimeMillis()+1000);		//��ϵͳʱ�俪ʼ
//		timer.schedule(task, time);
		

		// ����ָ����������ָ����ʱ�俪ʼ�����ظ��Ĺ̶��ӳ�ִ�С�
//		 timer.schedule(task, time, 2000); //2�����������Ȼ�����������һ��
		
		// ������ָ���ӳٺ�ִ��ָ�������� 
//		timer.schedule(task, 2000) ;
       
		// ����ָ���������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶��ӳ�ִ�С� 
//		timer.schedule(task, 2000, 2000);
       
		//  ����ָ����������ָ����ʱ�俪ʼ�����ظ��Ĺ̶�����ִ�С� 
		timer.scheduleAtFixedRate(task, time, 2000) ;
      //   ����ָ����������ָ�����ӳٺ�ʼ�����ظ��Ĺ̶�����ִ�С�
//		timer.scheduleAtFixedRate(task, 2000, 2000) ;
     
	}

}

class Mytask extends TimerTask {

	public void run() {

		System.out.println("�������˸����ˣ�");

	}

}
