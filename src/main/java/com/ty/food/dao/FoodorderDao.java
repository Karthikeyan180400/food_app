package com.ty.food.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.Foodorder;
import com.ty.food.dto.Item;

public class FoodorderDao {
	public void saveOrder(Foodorder foodorder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		/*
		 * List<Item> items2 = new ArrayList<Item>(); for (Item item : items) {
		 * item.setFoodorder(foodorder); items2.add(item); } foodorder.setItem(items2);
		 */
		entityTransaction.begin();
		entityManager.persist(foodorder);
		entityTransaction.commit();

	}

	/*
	 * public Item getItemOrder(int id) { EntityManagerFactory entityManagerFactory
	 * = Persistence.createEntityManagerFactory("vikas"); EntityManager
	 * entityManager = entityManagerFactory.createEntityManager(); return
	 * entityManager.find(Item.class, id);
	 * 
	 * }
	 * 
	 * 
	 * public Foodorder getOrderItem(int id) { EntityManagerFactory
	 * entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	 * EntityManager entityManager = entityManagerFactory.createEntityManager();
	 * return entityManager.find(Foodorder.class, id);
	 * 
	 * }
	 */

	public Foodorder getOrderItem(String name, long phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select f from Foodorder f where name=?1 and phone=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, phone);
		List<Foodorder> foodorders = query.getResultList();
		if (foodorders.size() > 0) {
			for (Foodorder foodorder : foodorders) {
				return foodorder;
			}
		}
		return null;

	}

	public List<Foodorder> getAllOrderItem() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "select f from Foodorder f";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();

	}

	public void updateOrderItem(List<Item> items, int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Foodorder foodorder1 = entityManager.find(Foodorder.class, id);
		List<Item> items2 = new ArrayList<Item>();
		for (Item item : items) {
			item.setFoodorder(foodorder1);
			items2.add(item);
		}

		foodorder1.setItem(items2);
		entityTransaction.begin();
		entityManager.merge(foodorder1);
		entityTransaction.commit();

	}

	public void deleteOrderItem(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Foodorder foodorder = entityManager.find(Foodorder.class, 1);

		entityTransaction.begin();
		for (Item item : foodorder.getItem()) {
			entityManager.remove(item);
		}
		entityManager.remove(foodorder);
		entityTransaction.commit();
	}

}
