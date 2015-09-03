package com.lyl.homework5;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class HomeworkFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建一个计时器
		Timer timer = new Timer();

		// 创建一个新的计时器任务
		Mytask task = new Mytask();
		
		//  安排在指定的时间执行指定的任务，如果此时间已过去，则安排立即执行该任务
		Date time = new Date(System.currentTimeMillis()+1000);		//从系统时间开始
//		timer.schedule(task, time);
		

		// 安排指定的任务在指定的时间开始进行重复的固定延迟执行。
//		 timer.schedule(task, time, 2000); //2秒后，闹钟响起，然后隔两秒在响一次
		
		// 安排在指定延迟后执行指定的任务。 
//		timer.schedule(task, 2000) ;
       
		// 安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。 
//		timer.schedule(task, 2000, 2000);
       
		//  安排指定的任务在指定的时间开始进行重复的固定速率执行。 
		timer.scheduleAtFixedRate(task, time, 2000) ;
      //   安排指定的任务在指定的延迟后开始进行重复的固定速率执行。
//		timer.scheduleAtFixedRate(task, 2000, 2000) ;
     
	}

}

class Mytask extends TimerTask {

	public void run() {

		System.out.println("闹钟响了该起床了！");

	}

}
