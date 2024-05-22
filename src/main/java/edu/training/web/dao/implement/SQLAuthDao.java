package edu.training.web.dao.implement;

import java.sql.Connection;
import java.sql.DriverManager;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;
import edu.training.web.dao.AuthDao;
import edu.training.web.dao.DaoException;

public class SQLAuthDao implements AuthDao {
	
	public static void main(String[] args) {
		Connection connection = null;
		
		try {connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost3307/usersdatabase");
		if(connection != null) {
			System.out.println("++++");
		}
		
				}catch(Exception e) {
					System.out.println("----");
	
				}		
	}

	@Override
	public User checkToken(String token) throws DaoException {
		/*
		try {
			
		}catch(SQLException e) {
			throw new DaoException(e);
		}
		*/
		return new User("Olga", "admin");
	}

	@Override
	public User logIn(AuthInfo info) throws DaoException {
		if ("user111@mail.ru".equals(info.getLogin()) && "111".equals(info.getPassword())) {
			return new User("admin", "001");
		}
		if ("jokermc@mail.ru".equals(info.getLogin()) && "222".equals(info.getPassword())) {
			return new User("user", "002");
		}
		if ("user333@mail.ru".equals(info.getLogin()) && "333".equals(info.getPassword())) {
			return new User("editor", "003");
		}
		if ("user444@mail.ru".equals(info.getLogin()) && "444".equals(info.getPassword())) {
			return new User("user", "004");
		}
		if ("user555@mail.ru".equals(info.getLogin()) && "555".equals(info.getPassword())) {
			return new User("user", "005");
		}

		return null;
		
	}

}
