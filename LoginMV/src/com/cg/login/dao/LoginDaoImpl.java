package com.cg.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import com.cg.login.bean.LoginBean;
import com.cg.login.util.DbConnection;

public class LoginDaoImpl implements ILoginDao {

	@Override
	public boolean verifyLogin(LoginBean loginBean) throws LoginException, SQLException {
		boolean result = false;
		Connection connection = DbConnection.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		preparedStatement = connection.prepareStatement("select username, password from user where username = ? and password = ?");
		preparedStatement.executeUpdate();
		preparedStatement.setString(1, loginBean.getUsername());
		preparedStatement.setString(2, loginBean.getPassword());
		
		while(resultSet.next())
		{
			resultSet.getString(1);
			resultSet.getString(2);
		}
		
		return result;
	}

}
