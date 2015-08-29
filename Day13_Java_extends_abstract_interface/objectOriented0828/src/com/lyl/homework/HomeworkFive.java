package com.lyl.homework;

public class HomeworkFive {

	/**
	 * ������
	 */
	public static void main(String[] args) {

		Graphics gr = new Rectangular(3, 4);		//ʵ����������
		Graphics gt = new Triangle(3, 4, 5);		//ʵ����������
		Graphics gc = new Circle1(4);				//ʵ����Բ
		
		print(gr);
		print(gt);
		print(gc);
		
	}
	
	public static void print(Graphics g){
		
		g.area();
		g.perimeter();
	}

}
//������
abstract class Graphics{
	
	abstract void area();			//���
	abstract void perimeter();		//�ܳ�
}


//����
class Rectangular extends Graphics{
	
	private int width;		//��
	private int length;   	//��
	
	public Rectangular(int width, int length){
		
		this.width = width;
		this.length = length;
	}

	void area() {
		
		System.out.println("�������Ϊ��"+ (width * length));
	}

	void perimeter() {
		
		System.out.println("�����ܳ�Ϊ��"+ ((width + length) * 2));
	}
	
}
//������
class Triangle extends Graphics{
	
	//���������ߵĳ�
	private int a;
	private int b;
	private int c;
	
	public Triangle(int a, int b, int c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void area() {
		
		//ʹ�ú��ס����ؾ��ѹ�ʽ �����
		float p = (float)(a + b + c)/2;
		System.out.println("���������Ϊ��"+ Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		
	}

	void perimeter() {

		System.out.println("�������ܳ�Ϊ"+ (a + b + c));
		
	}
	
}

//Բ
class Circle1 extends Graphics{
	
	private double radius;			//�뾶
	final double PI = 3.1415;
	
	public Circle1(double radius){
		
		this.radius = radius;
	}

	void area() {

		System.out.println("Բ���Ϊ��"+ (PI * radius * radius));
		
	}

	void perimeter() {
		
		System.out.println("Բ�ܳ�Ϊ"+ (2 * PI * radius));
		
	}
	
}
