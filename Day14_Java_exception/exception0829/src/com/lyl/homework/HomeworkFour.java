package com.lyl.homework;

public class HomeworkFour {

	/**
	 * ʹ��whileѭ������һ�����ơ��ָ�ģ�͡����쳣������Ϊ
	 */
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			
			boolean flag = true;
			try {
				if(i < 3){
					i++;
					throw new Exception("ѭ���쳣" + i);
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
