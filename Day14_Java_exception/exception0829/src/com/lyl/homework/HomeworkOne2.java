package com.lyl.homework;

public class HomeworkOne2 {

	/**
	 * 测试空指针异常
	 */
	public static void main(String[] args) {

		try {
			String str = null;
			str.toString();
			return;
		} catch (Exception e) {
			//打印异常信息
			e.printStackTrace();
			
			return;
		} finally {
			System.out.println("这是作业1-2(try和catch内都含有return)的finally");
		}
		
	//	System.out.println("over");

	}

}
