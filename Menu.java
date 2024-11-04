package com.jsp.Spring_Boot_FoodApp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Menu {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int menuId;
	private String menuName;
	private String menuCategory;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product>product;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuCategory() {
		return menuCategory;
	}
	public void setMenuCategory(String menuCategory) {
		this.menuCategory = menuCategory;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProducts(List<Product> product) {
		this.product = product;
	}
	
}
