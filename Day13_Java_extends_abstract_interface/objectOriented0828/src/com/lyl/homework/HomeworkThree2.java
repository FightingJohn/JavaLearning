package com.lyl.homework;

public class HomeworkThree2 {
	/**
	 * ∂‡Ã¨
	 */
	public static void main(String[] args) {

		B b = new B();
//		b.f();
		((A)b).f();
		
//		A a = new B();
//		a.f();
	}

}
class A {
	protected void f() { 
		System.out.println("A.f()");
		this.g(); 
	}
	protected void g() {
		System.out.println("A.g()"); 
	}
}
class B extends A {
	@Override 
	protected void g() {
		System.out.println("B.g()");
	}
}
