package com.my.model.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.my.dao.UserDao;
import com.my.dao.UserDaoImpl;
import com.my.model.User;
import com.my.model.service.UserService;
import com.my.model.vo.UserRegistation;

@Component
public class RegistationManager {
	

	public boolean isPasswordMatch(UserRegistation registation){
		return registation.getPassword().equals(registation.getPasswordConfirm());
	}
	
	public boolean isUserExists(User user){
		return userDaoImpl.userExists(user.getUsername()) > 0;
	}
	
	private UserDaoImpl userDaoImpl;
	
	public UserDaoImpl getUserDaoImpl() {
		return userDaoImpl;
	}

	@Resource
	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public int createUser(UserRegistation registation){
		if(!isPasswordMatch(registation)) return RegistationStatus.PASSWORD_NOT_MATCH;
		User user = registation.extractUser();
		if(isUserExists(user)) return RegistationStatus.USER_EXISTS;
		if(userDaoImpl.addUser(user) > 0){
			return RegistationStatus.CREATE_USER_SUCCESS;
		}
		return RegistationStatus.CREATE_USER_FAIL;
	}
}
