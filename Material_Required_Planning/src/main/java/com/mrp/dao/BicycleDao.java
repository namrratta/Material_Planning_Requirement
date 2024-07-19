package com.mrp.dao;

import com.mrp.entity.Bicycle;

public interface BicycleDao {

	public Bicycle getAllInventory();

	public Bicycle materialRequired(int number);

	public Bicycle maxCount();

	public Bicycle proquredQuantity(int number1);

	public Bicycle test();
	

}
