package com.lyl.constructor;

public class Student {
	
	public String name;				//姓名
	protected int age;				//年龄
	private String gender;			//性别
	
	public Student(){
		
	}
	//私有构造方法
	private Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//私有成员方法
	private void setName(String name){
		this.name = name;
	}
	
	//公共的成员方法
	public String getGender(){
		return gender;
	}
	
	//打印信息
	public String toString() {
		return "Student [姓名 = " + name + ", 年龄 = " + age + ", 性别 = " + gender
				+ "]";
	}
}
