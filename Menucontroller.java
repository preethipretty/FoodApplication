package com.jsp.Spring_Boot_FoodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Spring_Boot_FoodApp.dto.Menu;
import com.jsp.Spring_Boot_FoodApp.dto.Product;
import com.jsp.Spring_Boot_FoodApp.service.Menuservice;
import com.jsp.Spring_Boot_FoodApp.util.ResponseStructure;

@RestController
public class Menucontroller {
    @Autowired
	private Menuservice menuservice;
    @PostMapping("/saveMenu")
    public ResponseEntity<ResponseStructure<Menu>> saveMenu(@RequestBody Menu menu)
    {
		return menuservice.savemenu(menu);
    	
    }
    @GetMapping("/getall1")
    public List<Menu> getAll()
    {
		return menuservice.getAll();
    	
    }
    @PutMapping("/updateMenu")
    public ResponseEntity<ResponseStructure<Menu>> updateMenu(@RequestParam int id,Menu menu)
    {
		return menuservice.updateMenu(id, menu);
    	
    }
    @DeleteMapping("/deleteMenu")
    public ResponseEntity<ResponseStructure<Menu>> deleteMenu(@RequestParam int id)
    {
		return menuservice.deleteMenu(id);
    	
    }
}
