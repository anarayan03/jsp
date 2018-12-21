package com.cg.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import com.cg.login.exception.ExceptionMessage;

public class DbConnection {

	public static Connection connection = null;

	public static Connection getConnection() throws LoginException {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl", "trg706",
						"training706");
			} catch (SQLException e) {
				throw new LoginException(ExceptionMessage.MESSAGE1);
			}
			return connection;
		}
		return connection;
	}
}
