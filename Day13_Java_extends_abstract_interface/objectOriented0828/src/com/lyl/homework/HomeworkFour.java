package com.lyl.homework;

public class HomeworkFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AA a = new BB();			//向上转型1
		a.g();
		
		BB b = (BB)a;				//向下转型1
		b.g();
		
		AA a2 = new CC();			//向上转型2
		a2.g();
		
		CC c2 = (CC)a2;
		c2.g();						//向下转型2
		
		AA a3 = new AA();
		BB b3 = (BB)a3;				//向下转型3  不安全，运行时会报错java.lang.ClassCastException:
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

