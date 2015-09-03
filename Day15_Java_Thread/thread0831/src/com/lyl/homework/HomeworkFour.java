package com.lyl.homework;

import java.util.Scanner;

public class HomeworkFour {

	/**
	 * 请实现一个类，继承自Thread，来实现模拟迅雷多线程下载程序。
 	要求：迅雷每个线程可以下载1M的资源。对一个文件大小为x M的资源，进行下载，
 	动态调整下载线程的个数（命令行输入下载的资源 和 希望启动的下载线程个数）。
       当下载完成时，提示用户下载任务完成。（可以再命令行输出提示） 
	 */
	public static void main(String[] args) {

		//输入下载资源和启动下载线程
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入下载的资源：");
		int res = scan.nextInt();
		System.out.print("请输入启动的下载线程数：");
		int threadNum = scan.nextInt();
		

		ThunderThread.setRes(res);
		
		for(int i = 1; i <= threadNum; i++){
			new ThunderThread("线程"+ i).start();
			
		}
	}

}

class ThunderThread extends Thread{
	
	private static int resources = 0;			//下载资源的大小
//	private String name;
	
	public ThunderThread(String name){
//		this.name = name;
		super(name);
	}

	
	public static int getRes(){
		return resources;
	}
	
	public static void setRes(int res){
		resources = res;
	}
	
	public void run(){
		while(resources > 0){
			synchronized (ThunderThread.class) {		//同步锁
				resources--;
				if(resources >= 0)
					System.out.println(this.getName() 
							+ "下载1M，还剩下 "+ resources +" M");
				if(resources == 0)
					System.out.println("下载任务完成！！！");
			}
		}
		
	}
}
