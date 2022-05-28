package com.ty.food.services;

import java.util.List;


import com.ty.food.dao.FoodorderDao;
import com.ty.food.dto.Foodorder;
import com.ty.food.dto.Item;
import static com.ty.food.util.Tax.*;

public class FoodorderServices {
	public void saveOrder(Foodorder foodorder) {
		FoodorderDao foodorderDao = new FoodorderDao();
		double costSum = 0;
		List<Item> items = foodorder.getItem();
		for (Item item : items) {
			double quantity = item.getQuantity();
			item.setCost(MenuServices.itemCost(item.getItemId()));
			double cost = item.getCost();
			costSum = costSum + (quantity * (cost - (cost * (MenuServices.offer(item.getItemId()) / 100d))));
		}

		double toalCost = costSum + (costSum * (cgst + sgst) / 100);

		foodorder.setTotal(toalCost);

		foodorderDao.saveOrder(foodorder);

	}

	/*
	 * public Item getItemOrder(int id) { FoodorderDao foodorderDao = new
	 * FoodorderDao(); return foodorderDao.getItemOrder(id);
	 * 
	 * }
	 */

	public Foodorder getOrderItem(String name, long phone) {
		FoodorderDao foodorderDao = new FoodorderDao();
		return foodorderDao.getOrderItem(name, phone);

	}

	public List<Foodorder> getAllOrderItem() {
		FoodorderDao foodorderDao = new FoodorderDao();
		return foodorderDao.getAllOrderItem();

	}

	public void updateOrderItem(List<Item> items, int id) {
		FoodorderDao foodorderDao = new FoodorderDao();
		foodorderDao.updateOrderItem(items, id);

	}

	public void deleteOrderItem(int id) {
		FoodorderDao foodorderDao = new FoodorderDao();
		foodorderDao.deleteOrderItem(id);
	}

}
