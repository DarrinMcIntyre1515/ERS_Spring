package com.mcintyre.ers.model;

public class LoginForm {
	private String username;
	private String password;
	
	public LoginForm(String name, String password) {
		super();
		this.username = name;
		this.password = password;
	}
	
	public LoginForm(){}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String name) {
		this.username = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", password=" + password + "]";
	}
}
