package com.lgm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lgm.dao.FoodDao;
import com.lgm.model.Food;
import com.lgm.service.FoodService;

@Service("foodService")
public class FoodServiceImpl implements FoodService{

	@Autowired
	@Qualifier("foodDao")
	private FoodDao foodDao;

	@Override
	public boolean addFood(Food food) {
		boolean result =false;
		if(foodDao.addFood(food)!=0){
			result = true;
		}
		return result;
	}

	@Override
	public List<Food> getFood() {
		return foodDao.getFood();
	}


}
