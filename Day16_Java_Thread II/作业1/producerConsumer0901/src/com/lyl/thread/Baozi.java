package com.lyl.thread;

public class Baozi {
	
	private String name;			//包子名称
	private int price;				//包子价格
	private int num = 0;			//包子个数
	
	public boolean flag = false;	//有包子时为true，没有包子时为false
	
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

	//设置包子的名称和价格
	synchronized public void setBaozi(){
		if(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("生产 了一个肉包子");
		setName("天津狗不理");
		setPrice(5);
		
		notify();
		flag = true;
		this.num++;
	}
	
	//获得包子的名称和价格
	synchronized public void getBaozi(){
		if(!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("消费 "+ getName() + "  价格："+getPrice()); 
		
		notify();
		flag = false;
	}
}
