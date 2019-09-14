package com.cruiser;

public class User {

	private int userid;
	private String username;
	private String userpass;
	private String usercat;
	
	public User(int userid, String username, String userpass, String usercat) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpass = userpass;
		this.usercat = usercat;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getUsercat() {
		return usercat;
	}

	public void setUsercat(String usercat) {
		this.usercat = usercat;
	}
	
	
	
}
