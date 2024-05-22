package edu.training.web.service.implement;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;
import edu.training.web.bean.UserProfile;
import edu.training.web.dao.AuthDao;
import edu.training.web.dao.DaoException;
import edu.training.web.dao.DaoProvider;
import edu.training.web.service.ServiceException;
import edu.training.web.service.UserService;

public class UserServiceImplement implements UserService {
	private final AuthDao authDao = DaoProvider.getInstance().getAuthDao();

	@Override
	public User logIn(AuthInfo authInfo) throws ServiceException {

		try {
			User user = authDao.logIn(authInfo);
			return user;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	public User rememberMe(String token) throws ServiceException {

		try {
			User user = authDao.checkToken(token);
			return user;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public User editProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteAccount(User logIn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveNews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User hideNews() {
		// TODO Auto-generated method stub
		return null;
	}

}