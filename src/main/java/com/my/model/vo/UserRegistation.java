package com.my.model.vo;

import org.springframework.stereotype.Component;

import com.my.model.User;

@Component
public class UserRegistation {

	private String username,password,passwordConfirm;
	
	public User extractUser(){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
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

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	
}
