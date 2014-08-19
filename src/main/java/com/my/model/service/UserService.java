package com.my.model.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.my.dao.UserDao;
import com.my.model.User;

@Component
public class UserService{
	
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}


	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean isUserExists(String username){
		return userDao.userExists(username) > 0;
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

}
