package com.lyl.homework;

public class HomeworkTow {

	/**
	 * 处理数组下标越界异常(ArrayIndexOutOfBoundsException)
	 */
	public static void main(String[] args) {
		
		int [] arr = new int[3];			//定义一个长度为3的整数数组
		
		try {
			
			arr[3] = 4;						//给下标为3的元素赋值4
		} catch (Exception e) {
			e.printStackTrace();
			
			arr[2] = 4;						
		} finally{
			
			System.out.println("这是作业2的finally");
		}
		
		System.out.println("arr[2] = "+ arr[2]);
		
		System.out.println("over");

	}

}
