package com.lyl.homework;

public class HomeworkFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HomeworkFive hf = new HomeworkFive();
		
		try {
			
//			hf.arithmeticE();					//�׳������쳣
//			hf.arrayIOBE();						//�׳������±�Խ���쳣
			hf.classCE();						//�׳���ת���쳣
			
		} catch (Exception e) {
			//��ӡ�쳣��Ϣ
			e.printStackTrace();
			return;
			
		} finally {
			System.out.println("������ҵ5(catch �ں���return)��finally");
		}
		
		System.out.println("this is over");

	}
	
	//�쳣1
	private  ArrayIndexOutOfBoundsException arrayIOBE(){
		
		throw new ArrayIndexOutOfBoundsException("�����±�Խ���쳣");
	}
	
	//�쳣2
	private ArithmeticException arithmeticE(){
		
		throw new ArithmeticException("�����쳣");
	}
	
	//�쳣3
	private ClassCastException classCE(){
		
		throw new ClassCastException("ת���쳣");
	}

}
