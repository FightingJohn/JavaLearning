package com.lyl.homework2;

public class SellTickets implements Runnable {

	private Ticket ticket;
	
	public SellTickets(Ticket tic){
		this.ticket = tic;
	}
	
	public void run() {
		
		while(true){
			ticket.sellTicket();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
