package com.my.dao;

import com.my.model.User;

public interface UserDao {

	public int addUser(User user);
	
	public int userExists(String username);
}
