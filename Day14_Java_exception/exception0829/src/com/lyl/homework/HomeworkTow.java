package com.lyl.homework;

public class HomeworkTow {

	/**
	 * ���������±�Խ���쳣(ArrayIndexOutOfBoundsException)
	 */
	public static void main(String[] args) {
		
		int [] arr = new int[3];			//����һ������Ϊ3����������
		
		try {
			
			arr[3] = 4;						//���±�Ϊ3��Ԫ�ظ�ֵ4
		} catch (Exception e) {
			e.printStackTrace();
			
			arr[2] = 4;						
		} finally{
			
			System.out.println("������ҵ2��finally");
		}
		
		System.out.println("arr[2] = "+ arr[2]);
		
		System.out.println("over");

	}

}
