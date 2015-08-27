package com.lyl.OO;

public class HomeworkTow {

	/**
	 * ��ļ̳�
	 */
	public static void main(String[] args) {
//		Circle circle = new Circle(4);
//		circle.show();
		
		Cylinder cylinder = new Cylinder(3, 4);
		cylinder.show();
		cylinder.showVolume();

	}
}

//����һ��Բ��
class Circle{
	
	private double radius;			//�뾶
	final double PI = 3.14159;		//�е�ֵ
	
	public Circle(){
		this.radius = 0;
	}
	
	public Circle(double r){
		this.radius = r;
	}
	
	//���Բ�����
	public double getArea(){
		return PI * radius * radius;
	}
	
	//���Բ���ܳ�
	public double getPerimeter(){
		return 2 * PI * radius;
	}
	
	//��ӡԲ�İ뾶���ܳ������
	public void show(){
		System.out.println("Բ�İ뾶���ܳ������Ϊ��"+ radius +"\t"+ getArea() +"\t"+ getPerimeter());
	}
}

//����Բ�����ಢ�̳�����Բ��
class Cylinder extends Circle{
	
	private double hight;				//��
	
	public Cylinder(double r, double h){
		super(r);
		this.hight = h;	
	}
	
	//���Բ��������
	public double getVolume(){
		return getArea() * hight;
	}
	
	//��ӡԲ��������
	public void showVolume(){
		System.out.println("Բ�������Ϊ��"+ getVolume());
	}
}

