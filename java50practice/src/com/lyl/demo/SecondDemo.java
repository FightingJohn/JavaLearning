package com.lyl.demo;

public class SecondDemo {

	/**
	 *判断101-200之间有多少个素数，并输出所有素数（质数）——该数除了1和它本身以外不再有其他的因数
	 *例    子		 2、3、5、7、11、13
	 *快速判断素数的方法，这个数依次除以2到这个数的平方根取整，如果有一个数整除了就不是素数；否则为素数
	 */
	public static void main(String[] args) {
		
		int count = 100;				//代表101到200之间的数字个数
		for(int num=100; num <= 200; num++){
			for(int i=2; i<=(int)Math.sqrt(num); i++){
				if(num % i == 0){
					count--;
					break;
				}
			}
		}
		
		System.out.println("101-200之间有: "+ count + "个素数");

	}

}
