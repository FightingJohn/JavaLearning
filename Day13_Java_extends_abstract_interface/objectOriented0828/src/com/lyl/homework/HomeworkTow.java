package com.lyl.homework;

public class HomeworkTow {

	/**
	 * �̳й�ϵ
	 */
	public static void main(String[] args) {
		//ʵ����Բ������
		Cylinder cy = new Cylinder();
		cy.setXY(4, 5);					//���õ���Բ������
		cy.setRadius(3);				//���õ���Բ�뾶
		cy.setHight(5);					//����Բ����߶�
		
		System.out.print("��������Ϊ��");
		cy.getXY();
		System.out.println("����Բ�뾶Ϊ��"+ cy.getRadius());
		System.out.println("Բ����߶�Ϊ��"+ cy.getHight());
		System.out.print("Բ�������Ϊ��");
		cy.showVolume();

	}

}

//��ʾƽ���
class Point{
	
	protected int x;		//������
	protected int y;		//������
	
	//���ú�������
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	//��ú�������
	public void getXY(){
		
		System.out.println("(" + x +", "+ y +")");
	}
}

//����Բ��
class Circle extends Point{
	
	protected double radius ;			//�뾶
	final double PI = 3.1415;			//Բ����
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//����Բ�����
	public double getArea(){
		
		return PI * radius * radius;
	}
}

//Բ������
class Cylinder extends Circle{
	
	protected int height;

	public int getHight() {
		return height;
	}

	public void setHight(int hight) {
		this.height = hight;
	}
	
	public void showVolume(){
		
		System.out.println("Բ�������Ϊ��"+ getArea() * height);
	}
}