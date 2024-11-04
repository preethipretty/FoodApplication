package com.jsp.Spring_Boot_FoodApp.dao;

import java.util.List;
import java.util.Optional;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Spring_Boot_FoodApp.dto.Menu;
import com.jsp.Spring_Boot_FoodApp.dto.Product;
import com.jsp.Spring_Boot_FoodApp.repo.Menurepo;

@Repository
public class Menudao {
    @Autowired
	private Menurepo menurepo;
    
   public Menu saveMenu(Menu menu)
   {
	return menurepo.save(menu);
	   
   }
   public List<Menu> getAll()
   {
	return menurepo.findAll();
	   
   }
   public Menu updatemenu(Menu menu,int id)
   {
	   Menu menu2=menurepo.findById(id).get();
	   menu.setMenuId(id);
	   menu.setProducts(menu.getProduct());
	return menurepo.save(menu);
	   
   }
   public Menu deleteMenu(int id)
   {
	 Menu menu=menurepo.findById(id).get();
	 menurepo.delete(menu);
	return menu;
	   
   }
   
}
