package com.sky.service;

import com.sky.exception.UserException;
import com.sky.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
