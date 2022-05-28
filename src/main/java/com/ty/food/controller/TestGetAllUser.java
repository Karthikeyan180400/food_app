package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.User;
import com.ty.food.services.UserServices;

public class TestGetAllUser {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		List<User> users = userServices.getAllUser();
		if (users.size() > 0) {
			for (User user : users) {
				System.out.println("Id: " + user.getId());
				System.out.println("Name:" + user.getName());
				System.out.println("Email: " + user.getEmail());
				System.out.println("Phone: " + user.getPhone());
				System.out.println("_____________________________________");
			}
		}

	}

}
