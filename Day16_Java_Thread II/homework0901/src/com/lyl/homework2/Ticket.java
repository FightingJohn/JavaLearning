package com.lyl.homework2;

//电影票类
public class Ticket {

	private int tickets = 100;			//电影票数，一共100张

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	
	//卖票
	synchronized public void sellTicket(){
		
		//票卖完的时候，售票窗口等待退票窗口退票
		if(tickets == 0){
			System.out.println("票已经售完");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tickets--;
		System.out.println("卖出一张票，剩余 "+ tickets +"张票");

		if(tickets == 99)
			notify();							//如果退票窗口处于等待状态，唤醒它
	}
	
	//退票
	synchronized public void refundTicket(){
		if(tickets == 100)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		tickets++;
		System.out.println("有人退票一张，目前有 "+ tickets +"张票");
		
		if(tickets == 1 )
			notify();							//唤醒卖票窗口
	}
}
