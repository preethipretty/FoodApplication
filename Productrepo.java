package com.jsp.Spring_Boot_FoodApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Spring_Boot_FoodApp.dto.Product;

public interface Productrepo extends JpaRepository<Product, Integer> {

}
