package com.ty.food.controller;

import com.ty.food.services.FoodorderServices;

public class TestDeleteOrderItem {

	public static void main(String[] args) {
		FoodorderServices foodorderServices = new FoodorderServices();
		foodorderServices.deleteOrderItem(1);

	}

}
