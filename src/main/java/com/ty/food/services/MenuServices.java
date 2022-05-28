package com.ty.food.services;

import java.util.List;

import com.ty.food.dao.MenuDao;
import com.ty.food.dto.Menu;

public class MenuServices {
	public List<Menu> saveMenu(List<Menu> menus) {
		MenuDao menuDao = new MenuDao();
		return menuDao.saveMenu(menus);
	}

	public Menu getMenu(int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.getMenu(id);

	}

	public List<Menu> getAllMenu() {
		MenuDao menuDao = new MenuDao();
		return menuDao.getAllMenu();

	}

	public Menu updateMenu(Menu menu, int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.updateMenu(menu, id);

	}

	public boolean deleteMenu(int id) {
		MenuDao menuDao = new MenuDao();
		return menuDao.deleteMenu(id);

	}

	public static double offer(int itemId) {
		MenuDao menuDao = new MenuDao();
		String offer = menuDao.getItemOffer(itemId);
		if (offer == null) {
			offer = "0%";
		}
		String offer1 = offer.replace("%", "");
		double offerValue = (int) (Integer.parseInt(offer1));
		return offerValue;

	}

	public static double itemCost(int itemId) {
		MenuDao menuDao = new MenuDao();
		return menuDao.getItemCost(itemId);

	}

}
