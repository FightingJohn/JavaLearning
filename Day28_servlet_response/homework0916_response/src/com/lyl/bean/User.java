package com.lyl.bean;

public class User {
	
	private String username;		//�û���
	private String password;		//����
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	

}
