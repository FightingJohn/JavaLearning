package com.lyl.homework2;

public class HomeworkTwo {

	/**
	 * ģ����Ʊ����һ��������Ʊ��һ��������Ʊ����Ʊ�����ˣ�ֻ������Ʊ���ܼ�����Ʊ
	 */
	public static void main(String[] args) {

		Ticket ticket = new Ticket();
		
		SellTickets st = new SellTickets(ticket);
		RefundTickets rt = new RefundTickets(ticket);
		
		new Thread(st).start();
		new Thread(rt).start();

	}

}
