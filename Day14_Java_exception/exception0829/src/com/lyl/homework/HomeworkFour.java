package com.lyl.homework;

public class HomeworkFour {

	/**
	 * 使用while循环建立一个类似“恢复模型”的异常处理行为
	 */
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			
			boolean flag = true;
			try {
				if(i < 3){
					i++;
					throw new Exception("循环异常" + i);
				}
					
			} catch (Exception e) {
				e.printStackTrace();
				flag = false;

			} finally {
				if(flag == true)
					break;

			}

		}
		
		System.out.println("It is over");

	}
}
