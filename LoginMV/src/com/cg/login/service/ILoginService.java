package com.cg.login.service;

import com.cg.login.bean.LoginBean;

public interface ILoginService {

	boolean validate(LoginBean loginBean);

	boolean verifyLogin(LoginBean loginBean);

}
