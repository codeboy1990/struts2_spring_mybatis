package com.my.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.actions.RegistationAction;
import com.my.model.vo.UserRegistation;

public class RegistationTest {

	@Test
	public void test() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		UserRegistation registation = new UserRegistation();
		registation.setUsername("a");
		registation.setPassword("c");
		registation.setPasswordConfirm("c");
		
		RegistationAction action = context.getBean("registationAction", RegistationAction.class);
		action.setUserRegistation(registation);
		action.register();
	}

}
