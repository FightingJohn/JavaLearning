package com.lyl.thread;

public class Baozi {
	
	private String name;			//��������
	private int price;				//���Ӽ۸�
	private int num = 0;			//���Ӹ���
	
	public boolean flag = false;	//�а���ʱΪtrue��û�а���ʱΪfalse
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	//���ð��ӵ����ƺͼ۸�
	synchronized public void setBaozi(){
		if(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("���� ��һ�������");
		setName("��򹷲���");
		setPrice(5);
		
		notify();
		flag = true;
		this.num++;
	}
	
	//��ð��ӵ����ƺͼ۸�
	synchronized public void getBaozi(){
		if(!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("���� "+ getName() + "  �۸�"+getPrice()); 
		
		notify();
		flag = false;
	}
}
