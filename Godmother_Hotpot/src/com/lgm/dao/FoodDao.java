package com.lgm.dao;


import java.util.List;

import com.lgm.model.Food;

public interface FoodDao {
	
	public int addFood(Food food);
	
	public List<Food> getFood();
}
