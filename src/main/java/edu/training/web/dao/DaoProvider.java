package edu.training.web.dao;

import edu.training.web.dao.implement.SQLAuthDao;

public class DaoProvider {
	
private static final DaoProvider instance = new DaoProvider();
	
	private AuthDao authDao = new SQLAuthDao();
	
	private DaoProvider() {}

	public AuthDao getAuthDao() {
		return authDao;
	}
	
	public static DaoProvider getInstance() {
		return instance;
	}

}
