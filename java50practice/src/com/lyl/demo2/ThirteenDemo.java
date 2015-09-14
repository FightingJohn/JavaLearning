package com.lyl.demo2;

public class ThirteenDemo {

	/**
	 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
	 */
	public static void main(String[] args) {
		
		boolean flag = false;
		//遍历10000以内的数
		for(int num = 0; num < 10000; num++){
			int temp1 = (int)Math.sqrt(num+100);
			int temp2 = (int)Math.sqrt(num+168+100);
			if((Math.sqrt(num+100) - temp1) == 0 && (Math.sqrt(num+168+100) - temp2) == 0){
				System.out.print(num + " ");
				flag = true;
			}
		}
		
		if(flag == false)
			System.out.print("10000以内没有要找的数");
	}

}
