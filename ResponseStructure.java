package com.jsp.Spring_Boot_FoodApp.util;

import java.util.List;

import com.jsp.Spring_Boot_FoodApp.dto.Menu;
import com.jsp.Spring_Boot_FoodApp.dto.User;

public class ResponseStructure <T> {
 
	private int status;
	private String message;
	private T data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
