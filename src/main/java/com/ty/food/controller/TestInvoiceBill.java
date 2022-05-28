package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.Foodorder;
import com.ty.food.dto.Item;
import com.ty.food.services.FoodorderServices;

public class TestInvoiceBill {

	public static void main(String[] args) {
		FoodorderServices foodorderServices = new FoodorderServices();
		Foodorder foodorder = foodorderServices.getOrderItem("Karthi", 127702);
		if (foodorder != null) {
			String list[][] = new String[3][foodorder.getItem().size()];
			List<Item> items1 = new ArrayList<Item>();
			List<Item> items2 = foodorder.getItem();
			for(Item item:items2){
				Item item2 = new Item();
				item2.setName(item.getName());
				item2.setQuantity(item.getQuantity());
				item2.setCost(item.getCost());
				items2.add(item2);
			}
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < list[0].length; j++) {
					if (i == 0 && j == 0) {
						list[i][j] = "Item";
					} else if (i == 0 && j == 1) {
						list[i][j] = "Quantity";
					} else if (i == 0 && j == 2) {
						list[i][j] = "Cost";
					}
					else {
						list[i][j] = 
					}

				}

			}

		}

	}

}
