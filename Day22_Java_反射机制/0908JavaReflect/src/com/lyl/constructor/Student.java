package com.lyl.constructor;

public class Student {
	
	public String name;				//����
	protected int age;				//����
	private String gender;			//�Ա�
	
	public Student(){
		
	}
	//˽�й��췽��
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
	
	//˽�г�Ա����
	private void setName(String name){
		this.name = name;
	}
	
	//�����ĳ�Ա����
	public String getGender(){
		return gender;
	}
	
	//��ӡ��Ϣ
	public String toString() {
		return "Student [���� = " + name + ", ���� = " + age + ", �Ա� = " + gender
				+ "]";
	}
}
