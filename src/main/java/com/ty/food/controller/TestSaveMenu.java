package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.Menu;

import com.ty.food.services.MenuServices;

public class TestSaveMenu {

	public static void main(String[] args) {
		MenuServices menuServices = new MenuServices();
		List<Menu> menus = new ArrayList<Menu>();
		Menu menu1 = new Menu();
		menu1.setName("Chicken Burger");
		menu1.setItemId(100);
		menu1.setDescription("Made up with chicken and bun with some spicy ingeredients");
		menu1.setCost(120);
		menu1.setType("non-veg");
		menu1.setOffer("10%");
		menu1.setImage("https://www.pexels.com/photo/brown-and-black-maple-leaf-12203460/");

		Menu menu2 = new Menu();
		menu2.setName("Cheese Burger");
		menu2.setItemId(101);
		menu2.setDescription("Made up with cheese and bun with some spicy ingeredients");
		menu2.setCost(100);
		menu2.setType("veg");
		menu2.setOffer("20%");
		menu2.setImage("https://www.pexels.com/photo/brown-and-black-maple-leaf-12203460/");

		Menu menu3 = new Menu();
		menu3.setName("Coke");
		menu3.setItemId(102);
		menu3.setDescription("Made up with water with chemicals");
		menu3.setCost(80);
		menu3.setType("drinks");
		menu3.setOffer("5%");
		menu3.setImage("https://www.pexels.com/photo/brown-and-black-maple-leaf-12203460/");

		menus.add(menu1);
		menus.add(menu2);
		menus.add(menu3);

		List<Menu> menus2 = menuServices.saveMenu(menus);
		if (menus2.size() > 0) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
