package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.User;
import com.ty.food.services.UserServices;

public class TestValidateUser {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		List<User> user = userServices.validateUser("karthi@mail.com", "12212");
		if (user.size() > 0) {
			System.out.println("Validated User");
		} else {
			System.out.println("Email or Password is Incorrect");
		}

	}

}
