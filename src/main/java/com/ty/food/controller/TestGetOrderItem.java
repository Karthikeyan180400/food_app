package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.Foodorder;
import com.ty.food.dto.Item;
import com.ty.food.services.FoodorderServices;

public class TestGetOrderItem {

	public static void main(String[] args) {
		FoodorderServices foodorderServices = new FoodorderServices();
		Foodorder foodorder = foodorderServices.getOrderItem("Karthi",1244412);
		if (foodorder != null) {
			System.out.println(" ");
			System.out.println("Order Id: " + foodorder.getId());
			System.out.println("Order Name: " + foodorder.getName());
			System.out.println("Order Phone Num: " + foodorder.getPhone());
			System.out.println("----------------------------------------------");
			List<Item> items = foodorder.getItem();
			for (Item item : items) {
				System.out.println("Item Name: " + item.getName());
				System.out.println("Item Quantity: " + item.getQuantity());
				System.out.println("Item Cost: " + item.getCost());
				System.out.println("----------------------------------------------");
			}
		} else {
			System.out.println("No Order is Exists for given Id");
		}

	}

}
