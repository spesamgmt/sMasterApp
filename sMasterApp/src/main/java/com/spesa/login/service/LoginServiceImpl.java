package com.spesa.login.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.spesa.form.AppConfForm;
import com.spesa.form.LoginForm;

@Service@Transactional
public class LoginServiceImpl implements LoginService {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	//DAO to be autowired

	public LoginForm validateLoginDetails(LoginForm loginForm, AppConfForm appConfForm) throws Exception {
		logger.info("Inside validateLoginDetails for {}",loginForm.getUserName());
		return loginForm;
	}

}
