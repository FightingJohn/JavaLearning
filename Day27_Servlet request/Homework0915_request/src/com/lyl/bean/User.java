package com.lyl.bean;

public class User {

	private String userName;
	private String gender;
	private int age;
	private String school;
	private String address;
	
	public User(String userName, String gender, int age, String school,
			String address) {
		super();
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.school = school;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [姓名：" + userName + ", 性别：" + gender + ", 年龄："
				+ age + ", 学校：" + school + ", 所在地：" + address + "]";
	}
	
	
}
