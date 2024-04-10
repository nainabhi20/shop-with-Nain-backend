package com.abhishek.service;

import java.util.List;

import com.abhishek.exception.UserException;
import com.abhishek.modal.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException;

	public User findUserProfileByJwt(String jwt) throws UserException;

	public List<User> findAllUsers();

}
