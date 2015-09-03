package com.lyl.homework2;

public class HomeworkTwo {

	/**
	 * 模拟卖票程序，一个窗口卖票，一个窗口退票，当票卖完了，只能有退票才能继续卖票
	 */
	public static void main(String[] args) {

		Ticket ticket = new Ticket();
		
		SellTickets st = new SellTickets(ticket);
		RefundTickets rt = new RefundTickets(ticket);
		
		new Thread(st).start();
		new Thread(rt).start();

	}

}
