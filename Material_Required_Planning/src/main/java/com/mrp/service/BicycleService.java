package com.mrp.service;

import java.util.Map;

import com.mrp.model.BicycleModel;

public interface BicycleService {

	public BicycleModel getAllInventory();

	public Map<String, Integer> materialRequired(int number);

	public int maxCount();

	public Map<String, Integer> proquredQuantity(int number1);

	public Map<String, Integer> test();
	
	
}
