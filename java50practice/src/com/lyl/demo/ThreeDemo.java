package com.lyl.demo;

public class ThreeDemo {

	/**
	 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
	 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
	 */
	public static void main(String[] args) {
		
		//100到999的水仙花数
		for(int i = 100; i <= 999; i++){
			int first = i % 10;
			int secend = i / 10 % 10;
			int third = i / 100;
			
			int temp = (int) (Math.pow(first, 3) + Math.pow(secend, 3) + Math.pow(third, 3));
			if(temp == i)
				System.out.print(i + "\t");
		}

	}

}
