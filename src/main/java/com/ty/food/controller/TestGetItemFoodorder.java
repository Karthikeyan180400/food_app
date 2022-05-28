package com.ty.food.controller;

import com.ty.food.dto.Foodorder;
import com.ty.food.dto.Item;
import com.ty.food.services.FoodorderServices;

public class TestGetItemFoodorder {

	public static void main(String[] args) {
		FoodorderServices foodorderServices = new FoodorderServices();
		Item item = null;
		if (item == null) {
			System.out.println(" ");
			System.out.println("Item Name: " + item.getName());
			System.out.println("Item Quantity: " + item.getQuantity());
			System.out.println("Item Cost: " + item.getCost());
			System.out.println("------------------------------");
			Foodorder foodorder = item.getFoodorder();
			System.out.println("Order Id: " + foodorder.getId());
			System.out.println("Order Name: " + foodorder.getName());
			System.out.println("Order Phone Num: " + foodorder.getPhone());
		}

	}

}
