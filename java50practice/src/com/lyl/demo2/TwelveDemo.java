package com.lyl.demo2;

import java.util.Scanner;

public class TwelveDemo {

	/**
	 * ��ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%��
	 * �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��
	 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
	 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
	 * �Ӽ������뵱������I����Ӧ���Ž��������� 
	 */
	public static void main(String[] args) {
		
		double sum = 0.0f;			//��ʾ���������
		Scanner scan = new Scanner(System.in);
		System.out.print("�����������棺");
		double profit = scan.nextDouble();
		if(profit <= 0){}
		else if(profit <= 10){
			sum = profit * 0.1;
		}else if(profit <= 20){
			sum = (profit - 10) * 0.075 + 1;
		}else if(profit <= 40){
			sum = (profit - 20) * 0.05 + 1.5 + 1;
		}else if(profit <= 60){
			sum = (profit - 40) * 0.03 + 1 + 1.5 + 1;
		}else if(profit <= 100){
			sum = (profit - 60) * 0.015 + 0.6 + 1 + 1.5 + 1;
		}else{
			sum = (profit - 100) * 0.01 + 0.6 + 0.6 + 1 + 1.5 + 1;
		}
		
		System.out.println("��������Ϊ "+ profit + " ��Ԫʱ����������Ϊ��"+ sum +" ��Ԫ");
			
		//�ͷ���Դ
		scan.close();

	}

}
