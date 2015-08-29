package com.lyl.homework;

import com.lyl.dao.impl.Demo;

public class HomeworkSix1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//实例化实现接口的Demo的类
		Demo demo = new Demo();
		demo.printA();
		demo.printB();
		demo.printC();		//在不同包内的类的成员方法可以访问到，说明它是public的访问权限

	}

}
