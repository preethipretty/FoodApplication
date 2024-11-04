package com.jsp.Spring_Boot_FoodApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.Spring_Boot_FoodApp.util.ResponseStructure;

@RestControllerAdvice
public class ApplicationExceptionHandling {
     @ExceptionHandler
	  public ResponseEntity<ResponseStructure<String>> UserIdNotFound(UserIdNotFound userIdNotFound)
	 {
    	ResponseStructure<String>responseStructure=new ResponseStructure<>();
    	responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
    	responseStructure.setMessage("user id not found");
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
		 
	 }
      
	}
