package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbook.biz.user.UserVO;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
