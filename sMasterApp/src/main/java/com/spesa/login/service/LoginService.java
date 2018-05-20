package com.spesa.login.service;

import com.spesa.form.AppConfForm;
import com.spesa.form.LoginForm;

public interface LoginService {

	public LoginForm validateLoginDetails(LoginForm loginForm,AppConfForm appConfForm ) throws Exception;
	
}
