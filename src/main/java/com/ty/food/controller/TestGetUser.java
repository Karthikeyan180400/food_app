package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.services.UserServices;

public class TestGetUser {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		User user = userServices.getUser(3);
		if (user != null) {
			System.out.println("ID is: " + user.getId());
			System.out.println("Name: " + user.getName());
			System.out.println("Email: " + user.getEmail());
			System.out.println("Phone: " + user.getPhone());
		} else {
			System.out.println("No User Exists for Given Id");
		}

	}

}
