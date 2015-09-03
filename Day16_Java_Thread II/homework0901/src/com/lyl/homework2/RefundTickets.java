package com.lyl.homework2;

public class RefundTickets implements Runnable {

	private Ticket ticket;
	
	public RefundTickets(Ticket tic){
		this.ticket = tic;
	}
	
	public void run() {
		
		while(true){
			ticket.refundTicket();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
