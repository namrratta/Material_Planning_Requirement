package com.mrp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mrp.dao.BicycleDao;
import com.mrp.dao.impl.BicycleDaoImpl;
import com.mrp.entity.Bicycle;
import com.mrp.model.BicycleModel;
import com.mrp.service.BicycleService;

@Component
public class BicycleServiceImpl implements BicycleService {
	
	@Autowired
	BicycleDao dao = new BicycleDaoImpl(); 

	@Autowired
	private ModelMapper mapper;
	
	private Map<String, Integer> recipe=new HashMap<>();
	private Map<String, Integer> inventory=new HashMap<>();
	private Map<String, Integer> totalRequirement = new HashMap<>();
	private Map<String, Integer> procuredQuantities = new HashMap<>();
	  int maxBicycles = Integer.MAX_VALUE;

	  int no;
	 
	public Map<String, Integer> bicycleMRP() {
        recipe = new HashMap<>();
   
        recipe.put("seat", 1);
        recipe.put("frame", 1);
        recipe.put("brakeSet", 2);
        recipe.put("handleBar", 1);
        recipe.put("wheels", 2);
        recipe.put("tires", 2);
        recipe.put("chain", 1);
        recipe.put("crankset", 1);
        recipe.put("padels", 2);
        
        recipe.put("brakePaddel", 2); 
        recipe.put("brakeCable", 2);  
        recipe.put("brakeLaver", 2);    
        recipe.put("brakeShoe", 4);  
		return recipe;
    }
	
	
//1--> to get all available inventory
	
	@Override
	public BicycleModel getAllInventory() {
	
		  Bicycle BicycleEntity = dao.getAllInventory();
		  
		BicycleModel bicycleModel = mapper.map(BicycleEntity, BicycleModel.class);
		
		
		inventory.put("seat", bicycleModel.getSeat());
		inventory.put("frame", bicycleModel.getFrame());
		inventory.put("brakeSet", bicycleModel.getBrakeSet());
		inventory.put("handleBar", bicycleModel.getHandleBar());
		inventory.put("wheels", bicycleModel.getWheels());
		inventory.put("tires", bicycleModel.getTires());
		inventory.put("chain", bicycleModel.getChain());
		inventory.put("crankset", bicycleModel.getCrankset());
		inventory.put("padels", bicycleModel.getPadels());
		inventory.put("brakePaddel", bicycleModel.getPadels());
		inventory.put("brakeCable", bicycleModel.getBrakeCable());
		inventory.put("brakeLaver", bicycleModel.getBrakeLaver());
		inventory.put("brakeShoe", bicycleModel.getBrakeShoe());
		
		for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
			
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }
		
		 return bicycleModel;
	}

	
// 2 -->  method to find material required for given no
	
	@Override
	public Map<String, Integer> materialRequired(int number) {

	//Bicycle BicycleEntity = dao.materialRequired(number);
	//BicycleModel bicycleModel = mapper.map(BicycleEntity, BicycleModel.class);
	//System.out.println(bicycleModel);

	 Map<String, Integer> recipe1 = bicycleMRP();
	 totalRequirement = new HashMap<>();
		
     for (Map.Entry<String, Integer> entry : recipe1.entrySet()) {
			
         totalRequirement.put(entry.getKey(), entry.getValue() * number);
         
         System.out.println(entry);
         
     }
     return totalRequirement;
 	
	}



//3--> maxium bycycles can be maid using available inventory
	
	@Override
	public int maxCount() {
		
		Map<String, Integer> recipe1 = bicycleMRP(); 
		getAllInventory();
		
		
		 Bicycle bicycle = dao.maxCount();
		
		      
		        for (Map.Entry<String, Integer> entry : recipe1.entrySet()) {
		            String part = entry.getKey();
		            int requiredPerBicycle = entry.getValue();
		            int availableQty = inventory.getOrDefault(part, 0);
		            maxBicycles = Math.min(maxBicycles, availableQty / requiredPerBicycle);
		        }
		        return maxBicycles;
		    	
	}

	 
//4--> proquired quantity for given no of bycycles
	
	@Override
	public Map<String, Integer> proquredQuantity(int number1) {
		no=number1;
		dao.test();
		
		bicycleMRP() ;
		getAllInventory();
		materialRequired(no);

		procuredQuantities = new HashMap<>();
		for (Map.Entry<String, Integer> entry : totalRequirement.entrySet()) {
			 for (Map.Entry<String, Integer> two : inventory.entrySet()) {
				 if(entry.getKey()==two.getKey()) {
	            int requiredQty = entry.getValue(); //10
	            int onHandQty = two.getValue();   //8
	            int procuredQty = Math.max(0, requiredQty - onHandQty);//2
	            procuredQuantities.put(entry.getKey(), procuredQty);
				 }
	        }
		 }
		return procuredQuantities;
		 
		 
		
		
	}

//5--> Testing purpose only 
	@Override
	public Map<String, Integer> test() {
	dao.test();
	
		bicycleMRP() ;
		getAllInventory();
		materialRequired(55);

		procuredQuantities = new HashMap<>();
		for (Map.Entry<String, Integer> entry : totalRequirement.entrySet()) {
			 for (Map.Entry<String, Integer> two : inventory.entrySet()) {
				 if(entry.getKey()==two.getKey()) {
	            int requiredQty = entry.getValue(); //10
	            int onHandQty = two.getValue();
	            int procuredQty = Math.max(0, requiredQty - onHandQty);//2
	            procuredQuantities.put(entry.getKey(), procuredQty);
				 }
	        }
		 }
		return procuredQuantities;
	
	}


}
