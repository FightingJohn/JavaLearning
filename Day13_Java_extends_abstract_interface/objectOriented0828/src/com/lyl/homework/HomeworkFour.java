package com.lyl.homework;

public class HomeworkFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AA a = new BB();			//����ת��1
		a.g();
		
		BB b = (BB)a;				//����ת��1
		b.g();
		
		AA a2 = new CC();			//����ת��2
		a2.g();
		
		CC c2 = (CC)a2;
		c2.g();						//����ת��2
		
		AA a3 = new AA();
		BB b3 = (BB)a3;				//����ת��3  ����ȫ������ʱ�ᱨ��java.lang.ClassCastException:
		b3.g();
		
		
		
		

	}

}

class AA {

	protected void g() {
		System.out.println("A.g()"); 
	}
}

class BB extends AA {
	
	protected void g() {
		System.out.println("B.g()");
	}
}

class CC extends BB{
	
	protected void g() {
		System.out.println("C.g()");
	}
}

