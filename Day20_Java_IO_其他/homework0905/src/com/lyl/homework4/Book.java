package com.lyl.homework4;

import java.io.Serializable;

//图书馆书类
public class Book implements Serializable{

	//默认版本号
	private static final long serialVersionUID = 1L;
	
	private String idNum;		//书号
	private String name;		//书名
	private int number;			//有多少本
	
	//有参构造函数
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
	
	//输出内容
	public String toString() {
		return "Book [idNum=" + idNum + ", name=" + name + ", number=" + number
				+ "]";
	}
}
