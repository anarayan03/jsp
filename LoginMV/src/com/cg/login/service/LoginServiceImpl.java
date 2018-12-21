package com.cg.login.service;

import com.cg.login.bean.LoginBean;

public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean validate(LoginBean loginBean) {
		
		boolean result  = false;
		if(loginBean.getUsername().length() >3 && loginBean.getPassword().length() > 3)
		{
			result = true;
		}
		
		return result;
		
	}

	@Override
	public boolean verifyLogin(LoginBean loginBean) {
		// TODO Auto-generated method stub
		return false;
	}

}
