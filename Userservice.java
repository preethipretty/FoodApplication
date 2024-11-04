package com.jsp.Spring_Boot_FoodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.Spring_Boot_FoodApp.dao.Userdao;
import com.jsp.Spring_Boot_FoodApp.dto.User;
import com.jsp.Spring_Boot_FoodApp.exception.UserIdNotFound;
import com.jsp.Spring_Boot_FoodApp.util.ResponseStructure;

@Service
public class Userservice {
	 @Autowired
      public Userdao userdao;
	 
      public ResponseStructure<User> saveUser(User user)
      {
    	  ResponseStructure<User> responseStructure=new ResponseStructure<User>();
    	  responseStructure.setStatus(HttpStatus.CREATED.value());
    	  responseStructure.setMessage("succesfully inserted");
    	  responseStructure.setData(userdao.saveUser(user));
		return responseStructure; 
      }
      
      public List<User> getAll()
      {
    	return userdao.getAll();
      }
      
      public ResponseEntity<ResponseStructure<User>> updateUser(int id,String userName)
      {
    	ResponseStructure<User> responseStructure=new ResponseStructure<>();
    	User user=userdao.updateUser(id, userName);
    	if(user!=null)
    	{
    	responseStructure.setStatus(HttpStatus.OK.value());
    	responseStructure.setMessage("Succesfully updated");
    	responseStructure.setData(userdao.updateUser(id,userName));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
    	}
    	else {
    		throw new UserIdNotFound();
    	}
      } 
      
      public ResponseEntity<ResponseStructure<User>> deleteUser(int id) {
    	  ResponseStructure<User> responseStructure=new ResponseStructure<>();
    	  responseStructure.setStatus(HttpStatus.OK.value());
    	  responseStructure.setMessage("succesfully deleted");
    	  responseStructure.setData(userdao.deleteUser(id));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
    	  
      }
      
      public ResponseEntity<ResponseStructure<User>> singleUser(int id)
      {
    	  ResponseStructure<User> responseStructure=new ResponseStructure<User>();
    	  User user=userdao.singleUser(id);
    	  if(user!=null){
    		  responseStructure.setStatus(HttpStatus.FOUND.value());
        	  responseStructure.setMessage("Succesfully fetched 1 user");
        	  responseStructure.setData(userdao.singleUser(id));
        	  return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.NOT_FOUND);
       	  }
       	  else {
   		  throw new UserIdNotFound();
         }
      }
}
