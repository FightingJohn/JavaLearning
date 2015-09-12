package com.lyl.demo;

public class TenDemo {

	/**
	 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
	 * 求它在 第10次落地时，共经过多少米？第10次反弹多高？
	 */
	public static void main(String[] args) {
		
		float high = 100f;			//代表每一次开始落下时的高度，初始值表示第一次的高度
		float distance = 0;			//球经过的距离
		
		System.out.print("第十次落地，球经过的距离为： ");
		for(int i = 2; i <= 10; i++){
			//从第一次落地起，球经过的距离
			high /= 2;
			distance += (high * 2);
			
		}
		
		System.out.println(distance+100);		//加上第一次球落下经过的距离
		System.out.println("第十次球反弹的高度为： " + high/2);
	}

}
