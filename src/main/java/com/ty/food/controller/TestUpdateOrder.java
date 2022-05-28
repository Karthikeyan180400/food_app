package com.ty.food.controller;


import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.Item;
import com.ty.food.services.FoodorderServices;

public class TestUpdateOrder {

	public static void main(String[] args) {
		FoodorderServices foodorderServices = new FoodorderServices();

		Item item1 = new Item();
		item1.setName(" Burger");
		item1.setQuantity(1);
		item1.setCost(150);
		
		Item item2 = new Item();
		item2.setName("CHiiiiicken Burger");
		item2.setQuantity(1);
		item2.setCost(150);
		
		List<Item> items = new ArrayList<Item>();
		items.add(item1);
		items.add(item2);

		foodorderServices.updateOrderItem(items, 1);

	}

}
