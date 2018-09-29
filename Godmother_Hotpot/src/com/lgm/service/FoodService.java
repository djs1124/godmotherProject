package com.lgm.service;

import java.util.List;

import com.lgm.model.Food;

public interface FoodService {
	
	public boolean addFood(Food food);
	
	public List<Food> getFood();
}
