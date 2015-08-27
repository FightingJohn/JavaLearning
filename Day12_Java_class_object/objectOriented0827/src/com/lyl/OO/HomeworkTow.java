package com.lyl.OO;

public class HomeworkTow {

	/**
	 * 类的继承
	 */
	public static void main(String[] args) {
//		Circle circle = new Circle(4);
//		circle.show();
		
		Cylinder cylinder = new Cylinder(3, 4);
		cylinder.show();
		cylinder.showVolume();

	}
}

//定义一个圆类
class Circle{
	
	private double radius;			//半径
	final double PI = 3.14159;		//π的值
	
	public Circle(){
		this.radius = 0;
	}
	
	public Circle(double r){
		this.radius = r;
	}
	
	//获得圆的面积
	public double getArea(){
		return PI * radius * radius;
	}
	
	//获得圆的周长
	public double getPerimeter(){
		return 2 * PI * radius;
	}
	
	//打印圆的半径，周长，面积
	public void show(){
		System.out.println("圆的半径、周长、面积为："+ radius +"\t"+ getArea() +"\t"+ getPerimeter());
	}
}

//定义圆柱体类并继承上面圆类
class Cylinder extends Circle{
	
	private double hight;				//高
	
	public Cylinder(double r, double h){
		super(r);
		this.hight = h;	
	}
	
	//获得圆柱体的体积
	public double getVolume(){
		return getArea() * hight;
	}
	
	//打印圆柱体的体积
	public void showVolume(){
		System.out.println("圆柱体体积为："+ getVolume());
	}
}

