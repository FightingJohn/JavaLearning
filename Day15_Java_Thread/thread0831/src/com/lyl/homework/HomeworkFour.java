package com.lyl.homework;

import java.util.Scanner;

public class HomeworkFour {

	/**
	 * ��ʵ��һ���࣬�̳���Thread����ʵ��ģ��Ѹ�׶��߳����س���
 	Ҫ��Ѹ��ÿ���߳̿�������1M����Դ����һ���ļ���СΪx M����Դ���������أ�
 	��̬���������̵߳ĸ������������������ص���Դ �� ϣ�������������̸߳�������
       ���������ʱ����ʾ�û�����������ɡ��������������������ʾ�� 
	 */
	public static void main(String[] args) {

		//����������Դ�����������߳�
		Scanner scan = new Scanner(System.in);
		System.out.print("���������ص���Դ��");
		int res = scan.nextInt();
		System.out.print("�����������������߳�����");
		int threadNum = scan.nextInt();
		

		ThunderThread.setRes(res);
		
		for(int i = 1; i <= threadNum; i++){
			new ThunderThread("�߳�"+ i).start();
			
		}
	}

}

class ThunderThread extends Thread{
	
	private static int resources = 0;			//������Դ�Ĵ�С
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
			synchronized (ThunderThread.class) {		//ͬ����
				resources--;
				if(resources >= 0)
					System.out.println(this.getName() 
							+ "����1M����ʣ�� "+ resources +" M");
				if(resources == 0)
					System.out.println("����������ɣ�����");
			}
		}
		
	}
}
