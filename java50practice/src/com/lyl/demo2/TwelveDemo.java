package com.lyl.demo2;

import java.util.Scanner;

public class TwelveDemo {

	/**
	 * 企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
	 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
	 * 20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
	 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
	 * 从键盘输入当月利润I，求应发放奖金总数？ 
	 */
	public static void main(String[] args) {
		
		double sum = 0.0f;			//表示奖金的总数
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年收益：");
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
		
		System.out.println("当年收益为 "+ profit + " 万元时，奖金总数为："+ sum +" 万元");
			
		//释放资源
		scan.close();

	}

}
