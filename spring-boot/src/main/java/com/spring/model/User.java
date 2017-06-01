package com.spring.model;

public class User {

	private int userId;
	private String userName;
	private String userpassword;
	
	public User() {
		
	}
	
	public User(int userId, String userName, String userpassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userpassword = userpassword;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
}
