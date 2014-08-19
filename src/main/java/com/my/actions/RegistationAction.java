package com.my.actions;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.my.dao.UserDao;
import com.my.model.User;
import com.my.model.manager.RegistationManager;
import com.my.model.service.UserService;
import com.my.model.vo.UserRegistation;
import com.opensymphony.xwork2.ActionSupport;

public class RegistationAction extends ActionSupport {
	
	private UserRegistation userRegistation;
	
	private RegistationManager registationManager;
	
	public RegistationManager getRegistationManager() {
		return registationManager;
	}

	@Resource
	public void setRegistationManager(RegistationManager registationManager) {
		this.registationManager = registationManager;
	}

	public UserRegistation getUserRegistation() {
		return userRegistation;
	}
	

	public void setUserRegistation(UserRegistation userRegistation) {
		this.userRegistation = userRegistation;
	}

	public String register(){
		//User user = userDao.query(1);
		System.out.println("user name is "+userRegistation.getUsername());
		switch (registationManager.createUser(userRegistation)) {
		case 0:
			return SUCCESS;
		case 1:
			return "fail";
		case 2:
			return "exists";
		default:
			return "not_match";
		}
	}
}
