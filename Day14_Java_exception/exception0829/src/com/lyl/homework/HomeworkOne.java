package com.lyl.homework;

public class HomeworkOne {

	/**
	 * Exception��ϰ
	 */
	public static void main(String[] args) {

		try {
			
			//�׳�һ��Exception���͵Ķ��󣬴���һ�����������Exception����Ĺ��캯��
			throw new Exception("�׳�Exception�쳣��");
			
		} catch (Exception e) {
			
			//������쳣���󣬲���ӡ���ַ�������
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("������ҵ1��finally");
		}
		
		System.out.println("over");

	}

}
