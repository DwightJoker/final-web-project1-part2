package edu.training.web.service;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;
import edu.training.web.bean.UserProfile;

public interface UserService {

	User logIn(AuthInfo authInfo) throws ServiceException;

	User editProfile(UserProfile userProfile) throws ServiceException;

	User deleteAccount(User logIn);

	User saveNews();

	User hideNews();
	
	User rememberMe(String token) throws ServiceException;

}
