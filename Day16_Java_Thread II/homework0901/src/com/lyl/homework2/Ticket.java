package com.lyl.homework2;

//��ӰƱ��
public class Ticket {

	private int tickets = 100;			//��ӰƱ����һ��100��

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	
	//��Ʊ
	synchronized public void sellTicket(){
		
		//Ʊ�����ʱ����Ʊ���ڵȴ���Ʊ������Ʊ
		if(tickets == 0){
			System.out.println("Ʊ�Ѿ�����");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tickets--;
		System.out.println("����һ��Ʊ��ʣ�� "+ tickets +"��Ʊ");

		if(tickets == 99)
			notify();							//�����Ʊ���ڴ��ڵȴ�״̬��������
	}
	
	//��Ʊ
	synchronized public void refundTicket(){
		if(tickets == 100)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		tickets++;
		System.out.println("������Ʊһ�ţ�Ŀǰ�� "+ tickets +"��Ʊ");
		
		if(tickets == 1 )
			notify();							//������Ʊ����
	}
}
