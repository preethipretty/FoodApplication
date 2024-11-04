package com.jsp.Spring_Boot_FoodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.Spring_Boot_FoodApp.dao.Menudao;
import com.jsp.Spring_Boot_FoodApp.dto.Menu;
import com.jsp.Spring_Boot_FoodApp.dto.Product;
import com.jsp.Spring_Boot_FoodApp.util.ResponseStructure;

@Service
public class Menuservice {
    @Autowired
	private Menudao menudao;
	
    public ResponseEntity<ResponseStructure<Menu>> savemenu(Menu menu)
    {
    	ResponseStructure<Menu> responseStructure=new ResponseStructure<Menu>();
    	responseStructure.setStatus(HttpStatus.CREATED.value());
    	responseStructure.setMessage("Successfully created");
    	responseStructure.setData(menudao.saveMenu(menu));
    	
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.CREATED);
    	
    }
    public List<Menu> getAll()
    {
		return menudao.getAll();
    	
    }
    public ResponseEntity<ResponseStructure<Menu>> updateMenu(int id,Menu menu)
    {
    	ResponseStructure<Menu> responseStructure=new ResponseStructure<Menu>();
    	responseStructure.setStatus(HttpStatus.FOUND.value());
    	responseStructure.setMessage("successfully updated");
    	responseStructure.setData(menudao.updatemenu(menu, id));
    	
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.FOUND);
    	
    }
    public ResponseEntity<ResponseStructure<Menu>> deleteMenu(int id)
    {
    	ResponseStructure<Menu> responseStructure=new ResponseStructure<Menu>();
    	responseStructure.setStatus(HttpStatus.OK.value());
    	responseStructure.setMessage("successfully deleted");
    	responseStructure.setData(menudao.deleteMenu(id));
		return new ResponseEntity<ResponseStructure<Menu>>(responseStructure,HttpStatus.OK);
    	
    }
}
