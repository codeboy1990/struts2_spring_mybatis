package com.my.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.ThrowsAdvice;

import com.my.model.manager.RegistationStatus;
import com.my.model.vo.UserRegistation;
import com.my.util.TextUtils;


public class RegistationAop implements ThrowsAdvice{

	public Object checkParameter(ProceedingJoinPoint pjp, UserRegistation registation) throws Throwable{
		Object result = null;
		if(TextUtils.isEmpty(registation.getUsername()) ||
				TextUtils.isEmpty(registation.getPassword()) ||
				TextUtils.isEmpty(registation.getPasswordConfirm())){
			result = RegistationStatus.CREATE_USER_FAIL;
		}else{
			result = pjp.proceed();
		}
		System.out.println(result);
		return result;
	}
	
	
}
