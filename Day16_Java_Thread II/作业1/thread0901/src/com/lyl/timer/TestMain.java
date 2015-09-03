package com.lyl.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TestMain {

	/**
	 * 定时器
	 * 放置一枚炸弹在指定时间爆炸
	 */
	public static void main(String[] args) {

		//创建一个计时器
		Timer timer = new Timer();
		
		//创建一个新的计时器任务
		Mytask task = new Mytask();
		
		//安排指定的任务从指定的延迟后开始进行重复的固定延迟执行
//		timer.schedule(task, 2000, 2000);			//2秒后，炸弹爆炸，然后隔两秒爆炸一次
		
		timer.scheduleAtFixedRate(task, 3000, 1000);//同上
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("睡醒了！");
		
//		timer.cancel();
		//返回此任务最近实际执行的已安排执行时间
		long time = task.scheduledExecutionTime();
		
		System.out.println("系统现在的时间："+ System.currentTimeMillis());
		System.out.println("time = "+ time);
		System.out.println("系统时间减去time :"+ (System.currentTimeMillis() - time));
	}

}

class Mytask extends TimerTask{

	
	public void run() {
		
		System.out.println("炸弹爆炸了！");
		
	}
	
}
