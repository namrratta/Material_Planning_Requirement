package com.mrp.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mrp.dao.BicycleDao;
import com.mrp.entity.Bicycle;
import com.mrp.exception.ResourceNotExistException;
import com.mrp.exception.SomethingWentWrongException;

@Component
public class BicycleDaoImpl implements BicycleDao {

	@Autowired
	private SessionFactory sf;

//1--> to get all available inventory	

	@Override
	public Bicycle getAllInventory() {

		Session session = sf.openSession();
		Bicycle bicycle = null;
		try {
			Criteria criteria = session.createCriteria(Bicycle.class);
			List<Bicycle> list = criteria.list();

			if (!list.isEmpty()) {
				bicycle = list.get(0);

				return bicycle;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new SomethingWentWrongException("Something went wrong");
		}
		throw new ResourceNotExistException("No inventory found");

	}

// 2 -->  method to find material required for given no	
	@Override
	public Bicycle materialRequired(int number) {

		Bicycle allInventory = getAllInventory();
		return allInventory;
	}

//3--> maxium bycycles can be maid using available inventory

	@Override
	public Bicycle maxCount() {
		Bicycle allInventory = getAllInventory();
		return allInventory;
	}

//4--> proquired quantity for given no of bycycles	

	@Override
	public Bicycle proquredQuantity(int number1) {
		Bicycle allInventory = getAllInventory();
		return allInventory;
	}

//5--> Testing purpose only 	

	@Override
	public Bicycle test() {
		Bicycle allInventory = getAllInventory();
		return allInventory;
	}

}
