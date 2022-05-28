package com.ty.food.controller;

import com.ty.food.services.MenuServices;

public class TestDeleteMenu {

	public static void main(String[] args) {
		MenuServices menuServices = new MenuServices();
		boolean res = menuServices.deleteMenu(3);
		if(res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("No deleted");
		}

	}

}
