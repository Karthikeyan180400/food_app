package com.ty.food.services;

import java.util.List;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class UserServices {
	public User saveUser(User user) {
		UserDao userDao = new UserDao();
		return userDao.saveUser(user);

	}

	public User getUser(int id) {
		UserDao userDao = new UserDao();
		return userDao.getUser(id);

	}

	public List<User> getAllUser() {
		UserDao userDao = new UserDao();
		return userDao.getAllUser();

	}

	public User updateUser(User user, int id) {
		UserDao userDao = new UserDao();
		return userDao.updateUser(user, id);

	}

	public User deleteUser(int id) {
		UserDao userDao = new UserDao();
		return userDao.deleteUser(id);

	}
	public List<User> validateUser(String email,String password) {
		UserDao userDao = new UserDao();
		return userDao.validateUser(email, password);
		
	}

}
