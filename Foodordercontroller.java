package com.jsp.Spring_Boot_FoodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Spring_Boot_FoodApp.dto.Foodorder;
import com.jsp.Spring_Boot_FoodApp.service.Foodorderservice;

@RestController
public class Foodordercontroller {
    @Autowired
	public Foodorderservice foodorderservice;
    @PostMapping("/foodorder")
    public Foodorder saveFoodorder(Foodorder foodorder)
    {
		return foodorderservice.saveFoodorderdao(foodorder);
    	
    }
    
    
}
