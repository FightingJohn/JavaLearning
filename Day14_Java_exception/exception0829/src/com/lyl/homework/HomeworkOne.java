package com.lyl.homework;

public class HomeworkOne {

	/**
	 * Exception练习
	 */
	public static void main(String[] args) {

		try {
			
			//抛出一个Exception类型的对象，传递一个参数给这个Exception对象的构造函数
			throw new Exception("抛出Exception异常！");
			
		} catch (Exception e) {
			
			//捕获此异常对象，并打印出字符串参数
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("这是作业1的finally");
		}
		
		System.out.println("over");

	}

}
