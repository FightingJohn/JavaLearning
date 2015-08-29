package com.lyl.homework;

public class HomeworkFive {

	/**
	 * 抽象类
	 */
	public static void main(String[] args) {

		Graphics gr = new Rectangular(3, 4);		//实例化长方形
		Graphics gt = new Triangle(3, 4, 5);		//实例化三角形
		Graphics gc = new Circle1(4);				//实例化圆
		
		print(gr);
		print(gt);
		print(gc);
		
	}
	
	public static void print(Graphics g){
		
		g.area();
		g.perimeter();
	}

}
//抽象类
abstract class Graphics{
	
	abstract void area();			//面积
	abstract void perimeter();		//周长
}


//矩形
class Rectangular extends Graphics{
	
	private int width;		//宽
	private int length;   	//长
	
	public Rectangular(int width, int length){
		
		this.width = width;
		this.length = length;
	}

	void area() {
		
		System.out.println("矩形面积为："+ (width * length));
	}

	void perimeter() {
		
		System.out.println("矩形周长为："+ ((width + length) * 2));
	}
	
}
//三角形
class Triangle extends Graphics{
	
	//三角形三边的长
	private int a;
	private int b;
	private int c;
	
	public Triangle(int a, int b, int c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void area() {
		
		//使用海伦——秦九昭公式 求面积
		float p = (float)(a + b + c)/2;
		System.out.println("三角形面积为："+ Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		
	}

	void perimeter() {

		System.out.println("三角形周长为"+ (a + b + c));
		
	}
	
}

//圆
class Circle1 extends Graphics{
	
	private double radius;			//半径
	final double PI = 3.1415;
	
	public Circle1(double radius){
		
		this.radius = radius;
	}

	void area() {

		System.out.println("圆面积为："+ (PI * radius * radius));
		
	}

	void perimeter() {
		
		System.out.println("圆周长为"+ (2 * PI * radius));
		
	}
	
}
