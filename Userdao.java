package com.jsp.Spring_Boot_FoodApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.Spring_Boot_FoodApp.dto.User;
import com.jsp.Spring_Boot_FoodApp.repo.UserRepo;
import com.jsp.Spring_Boot_FoodApp.util.ResponseStructure;
@Repository
public class Userdao {
	@Autowired
	 private UserRepo userRepo;
	
	 public User saveUser(User user)
	 {
		return userRepo.save(user);
		 
	 }
	 public List<User> getAll()
	 {
		return userRepo.findAll();
		 
	 }
	 public User updateUser(int id,String userName)
	 {
         Optional<User> user2=userRepo.findById(id);
         if(user2.isPresent()) {
        	 User user=userRepo.findById(id).get();
        user.setUserId(id);
        user.setUserName(userName);
        return user;
	 }
         else {
        	 return null;
         }
    }
	 public User deleteUser(int id)
	 {
		 User user=userRepo.findById(id).get();
		 userRepo.deleteById(id);
		return user;
		 
	 }
	 public User singleUser(int id)
	 {
		 Optional<User> user=userRepo.findById(id);
		 if(user.isPresent())
		 {
		  return userRepo.findById(id).get();
		 }
		 else {
			 return null;
		 }
	 }
}

