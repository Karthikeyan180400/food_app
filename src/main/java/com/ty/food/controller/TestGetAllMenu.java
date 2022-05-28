package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.Menu;
import com.ty.food.services.MenuServices;

public class TestGetAllMenu {

	public static void main(String[] args) {
		MenuServices menuServices = new MenuServices();
		List<Menu> menus = menuServices.getAllMenu();
		if (menus.size() > 0) {
			for (Menu menu : menus) {
				System.out.println(" ");
				System.out.println("Dish Name: " + menu.getName());
				System.out.println("Description: " + menu.getDescription());
				System.out.println("Cost: " + menu.getCost());
				System.out.println("Offer: " + menu.getOffer());
				System.out.println("Type: " + menu.getType());
				System.out.println("_______________________________________________");
			}
		}

	}

}
