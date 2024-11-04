package com.jsp.Spring_Boot_FoodApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Spring_Boot_FoodApp.dto.Item;
import com.jsp.Spring_Boot_FoodApp.dto.Menu;

public interface Menurepo extends JpaRepository<Menu, Integer>{

}
