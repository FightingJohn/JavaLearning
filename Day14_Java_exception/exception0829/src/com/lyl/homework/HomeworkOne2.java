package com.lyl.homework;

public class HomeworkOne2 {

	/**
	 * ���Կ�ָ���쳣
	 */
	public static void main(String[] args) {

		try {
			String str = null;
			str.toString();
			return;
		} catch (Exception e) {
			//��ӡ�쳣��Ϣ
			e.printStackTrace();
			
			return;
		} finally {
			System.out.println("������ҵ1-2(try��catch�ڶ�����return)��finally");
		}
		
	//	System.out.println("over");

	}

}
