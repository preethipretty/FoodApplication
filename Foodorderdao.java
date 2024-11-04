package com.jsp.Spring_Boot_FoodApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Spring_Boot_FoodApp.dto.Foodorder;
import com.jsp.Spring_Boot_FoodApp.repo.Foodorderrepo;

@Repository
public class Foodorderdao {
   @Autowired
	public Foodorderrepo foodorderrepo;
   
    public Foodorder saveFoodorder(Foodorder foodorder)
    {
		return foodorderrepo.save(foodorder);
    	
    }
    public Foodorder getFoodorder(int id)
    {
		return foodorderrepo.findById(id).get();
    	
    }
    public Foodorder deleteFoodorder(int id)
    {
    	Foodorder foodorder=foodorderrepo.findById(id).get();
		foodorderrepo.deleteById(id);
		return foodorder;
    	
    }
    public Foodorder updateFoodorder()
    {
		return null;
	}
}
