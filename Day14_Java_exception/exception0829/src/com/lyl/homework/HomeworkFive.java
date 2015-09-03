package com.lyl.homework;

public class HomeworkFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HomeworkFive hf = new HomeworkFive();
		
		try {
			
//			hf.arithmeticE();					//抛出算术异常
//			hf.arrayIOBE();						//抛出数组下标越界异常
			hf.classCE();						//抛出类转型异常
			
		} catch (Exception e) {
			//打印异常信息
			e.printStackTrace();
			return;
			
		} finally {
			System.out.println("这是作业5(catch 内含有return)的finally");
		}
		
		System.out.println("this is over");

	}
	
	//异常1
	private  ArrayIndexOutOfBoundsException arrayIOBE(){
		
		throw new ArrayIndexOutOfBoundsException("数组下标越界异常");
	}
	
	//异常2
	private ArithmeticException arithmeticE(){
		
		throw new ArithmeticException("算术异常");
	}
	
	//异常3
	private ClassCastException classCE(){
		
		throw new ClassCastException("转型异常");
	}

}
