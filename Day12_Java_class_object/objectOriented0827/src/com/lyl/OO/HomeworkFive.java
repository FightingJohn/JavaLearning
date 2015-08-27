package com.lyl.OO;

public class HomeworkFive {

	/**
	 * 测试成员变量的默认值
	 */
	
	//定义所有数据类型为此数据成员，以及一个自己的引用类型
	private boolean boolean_i;
	private byte byte_i;
	private char char_i;
	private short short_i;
	private  int int_i;
	private long long_i;
	private float float_i;
	private double double_i;
	private HomeworkFive hwf;
	
	//成员方法定义所有基本数据类型和指向自己的引用类型
	public static void  print(){
		byte pbyte_i;
		char pchar_i;
		short pshort_i;
		int pint_i;
		long plong_i;
		float pfloat_i;
		double pdouble_i;
		boolean b_i;
//		System.out.print(b_i);
	}
	public static void main(String[] args) {
		HomeworkFive hf = new HomeworkFive();
		System.out.println("boolean: " + hf.boolean_i);
		System.out.println("byte: " + hf.byte_i);
		System.out.println("char: " + hf.char_i);
		System.out.println("short: " + hf.short_i);
		System.out.println("int: " + hf.int_i);
		System.out.println("long: " + hf.long_i);
		System.out.println("float: " + hf.float_i);
		System.out.println("double: " + hf.double_i);
		System.out.println("HomeworkFive: " + hf.hwf);
		System.out.println("调用方法体内的--------------");
//		hf.print();
		
		
	}

}
