package com.lyl.homework;

import java.io.IOException;
import java.sql.SQLException;

public class HomeworkSeven {

	/**
	 * 编写一段demo程序，尝试证明如下结论：
		1，子类在覆盖父类的方法时，子类方法必须抛出相同的异常，或者该异常的子类。
		2，如果子类在该方法中抛出不同的异常或非父类异常的子类，会怎么样？
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		
		Demo d = new Price();
		d.print1();
		d.print2();
		d.print3();
		d.print4();

	}

}

//含有抛出算术异常方法的父类
class Demo {

	protected void print1() throws ArithmeticException{
		
		System.out.println("父-print1()---父类抛出ArithmeticException");//第一种情况测试
	}
	
	protected void print2() throws RuntimeException{
		
		System.out.println("父-print2()---父类抛出RuntimeException");	//第一种情况测试
	}
	
	protected void print3() throws IOException{
		
		System.out.println("父-print3()---父类抛出IOException");//第二种情况测试
	}

	protected void print4() throws IOException{
		
		System.out.println("父-print4()---父类抛出IOException");//第二种情况测试
	}
	
}


//子类
class Price extends Demo{
	
	protected void print1() throws RuntimeException{
		
		System.out.println("子-print1()---子类抛出RuntimeException");	//第一种情况测试
	}
	
	protected void print2() throws ClassCastException{				
		
		System.out.println("子-print2()---子类抛出ClassCastException");//第一种情况测试
	}
	
	protected void print3() throws RuntimeException{				
		
		System.out.println("子-print3()---子类抛出RuntimeException");//第一种情况测试
	}	
	
//	protected void print4() throws SQLException{					//报错		
//		
//		System.out.println("子-print4()---子类抛出ClassCastException");//第一种情况测试
//	}	
	
	
}