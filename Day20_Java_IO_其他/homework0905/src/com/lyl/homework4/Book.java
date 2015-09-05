package com.lyl.homework4;

import java.io.Serializable;

//ͼ�������
public class Book implements Serializable{

	//Ĭ�ϰ汾��
	private static final long serialVersionUID = 1L;
	
	private String idNum;		//���
	private String name;		//����
	private int number;			//�ж��ٱ�
	
	//�вι��캯��
	public Book(String idNum, String name, int number) {
		super();
		this.idNum = idNum;
		this.name = name;
		this.number = number;
	}
	
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	//�������
	public String toString() {
		return "Book [idNum=" + idNum + ", name=" + name + ", number=" + number
				+ "]";
	}
}
