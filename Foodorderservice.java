package com.jsp.Spring_Boot_FoodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Spring_Boot_FoodApp.dao.Foodorderdao;
import com.jsp.Spring_Boot_FoodApp.dto.Foodorder;
import com.jsp.Spring_Boot_FoodApp.dto.Item;

@Service
public class Foodorderservice {
    @Autowired
	private Foodorderdao foodorderdao;
    
    public Foodorder saveFoodorderdao(Foodorder foodorder)
    {
		List<Item> list=foodorder.getItems();
		double totalprice=0;
		for(Item item:list) {
			totalprice=totalprice+item.getItemPrice()*item.getItemQuantity();
		}
    	foodorder.setItems(list);
    	return foodorderdao.saveFoodorder(foodorder);
    }
    public Foodorder getFoodorder(int id)
    {
		return foodorderdao.getFoodorder(id);
    	
    }
    public Foodorder deleteFoodorder(int id) 
    {
		return foodorderdao.deleteFoodorder(id);
    }																											
}
