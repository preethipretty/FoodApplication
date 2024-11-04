package com.jsp.Spring_Boot_FoodApp.exception;

public class UserIdNotFound  extends RuntimeException{

	private String message="User id not found";

	public String getMessage() {
		return message;
	}

	public UserIdNotFound()
	{
		
	}
}
