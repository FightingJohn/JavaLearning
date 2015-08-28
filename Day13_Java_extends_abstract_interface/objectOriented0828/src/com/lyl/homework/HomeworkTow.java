package com.lyl.homework;

public class HomeworkTow {

	/**
	 * 继承关系
	 */
	public static void main(String[] args) {
		//实力还圆柱体类
		Cylinder cy = new Cylinder();
		cy.setXY(4, 5);					//设置地面圆心坐标
		cy.setRadius(3);				//设置地面圆半径
		cy.setHight(5);					//设置圆柱体高度
		
		System.out.print("轴心坐标为：");
		cy.getXY();
		System.out.println("底面圆半径为："+ cy.getRadius());
		System.out.println("圆柱体高度为："+ cy.getHight());
		System.out.print("圆柱体体积为：");
		cy.showVolume();

	}

}

//表示平面点
class Point{
	
	protected int x;		//横坐标
	protected int y;		//纵坐标
	
	//设置横纵坐标
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	//获得横纵坐标
	public void getXY(){
		
		System.out.println("(" + x +", "+ y +")");
	}
}

//定义圆类
class Circle extends Point{
	
	protected double radius ;			//半径
	final double PI = 3.1415;			//圆周率
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//计算圆的面积
	public double getArea(){
		
		return PI * radius * radius;
	}
}

//圆柱体类
class Cylinder extends Circle{
	
	protected int height;

	public int getHight() {
		return height;
	}

	public void setHight(int hight) {
		this.height = hight;
	}
	
	public void showVolume(){
		
		System.out.println("圆柱体面积为："+ getArea() * height);
	}
}