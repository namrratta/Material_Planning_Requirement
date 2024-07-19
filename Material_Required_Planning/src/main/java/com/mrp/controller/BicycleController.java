package com.mrp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mrp.model.BicycleModel;
import com.mrp.service.BicycleService;

@RestController
@RequestMapping("/bluemingo")
public class BicycleController {

	@Autowired
	BicycleService service;

// 1--> to get all available inventory present in database

	@GetMapping("/get-all-inventory")
	public ResponseEntity<BicycleModel> getAllInventory() {

		BicycleModel model = service.getAllInventory();

		return new ResponseEntity<BicycleModel>(model, HttpStatus.OK);

	}

	
// 2--> total no of material required for given quantity

	@GetMapping("/material-required/{id}")
	public ResponseEntity<Map<String, Integer>> materialRequired(@PathVariable("id") int number) {

		Map<String, Integer> materialRequired = service.materialRequired(number);

		return new ResponseEntity<Map<String, Integer>>(materialRequired, HttpStatus.OK);

	}

	
//3--> maxium bycycles can be maid using available inventory

	@GetMapping("/max-count")
	public ResponseEntity<Map<String, Integer>> maxCount() {

		int count = service.maxCount();
		Map<String, Integer> response = new HashMap<>();
        response.put("Maximum bycycles can be made using inventory", count);

		return new ResponseEntity<Map<String, Integer>>(response, HttpStatus.OK);

	}

//4--> proquired quantity for given no of bycycles

	@GetMapping("/proqured-quantity/{id}")
	public ResponseEntity<Map<String, Integer>> proquredQuantity(@PathVariable("id") int number1) {

		Map<String, Integer> proqured = service.proquredQuantity(number1);

		return new ResponseEntity<Map<String, Integer>>(proqured, HttpStatus.OK);

	}

//5--> Testing purpose only 

	@GetMapping("/test")
	public ResponseEntity<Map<String, Integer>> test() {

		Map<String, Integer> test = service.test();

		return new ResponseEntity<Map<String, Integer>>(test, HttpStatus.OK);

	}

}
