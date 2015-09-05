package com.lyl.homework5;

import java.io.Serializable;

public class Cat implements Serializable {
	
	//默认版本号
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;			
	
	transient private String gender; 			//该属性不会被序列化
	
	public Cat(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//本领
	protected void skill(){
		System.out.println("很会捉老鼠！");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
}
