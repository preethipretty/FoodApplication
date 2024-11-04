package com.jsp.Spring_Boot_FoodApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Spring_Boot_FoodApp.dto.User;
import com.jsp.Spring_Boot_FoodApp.service.Userservice;
import com.jsp.Spring_Boot_FoodApp.util.ResponseStructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class Usercontroller {
   @Autowired
	private Userservice userservice;
   
   
    @ApiOperation(value="api is used for saving",notes="api used for saving")
    @ApiResponses({@ApiResponse(code = 200,message = "user save succesfully"),
    @ApiResponse(code=400,message="fields cannot be null or blank")})
	@PostMapping("/saveuser")
	public ResponseStructure<User> saveUser(@RequestBody User user)
	{
		return userservice.saveUser(user);	
	}
    
    
    @ApiOperation(value="api is used for fetch",notes="api used for fetched")
    @ApiResponses({@ApiResponse(code = 200,message = "user fetched succesfully"),
    @ApiResponse(code=400,message="fields cannot be null or blank")})
	@GetMapping("/getall")
	public List<User> getallList()
	{
		return userservice.getAll();
		
	}
     
    
    @ApiOperation(value="api is used for update",notes="api used for update")
    @ApiResponses({@ApiResponse(code = 200,message = "user updated succesfully"),
    @ApiResponse(code=400,message="fields cannot be null or blank")})
	@PutMapping("/update1")
	public ResponseEntity<ResponseStructure<User>> updateuser(@RequestParam int id,@RequestParam String userName)
	{
		return userservice.updateUser(id, userName);
	}
    
    @ApiOperation(value="api is used for delete",notes="api used for delete")
    @ApiResponses({@ApiResponse(code = 200,message = "user deleted succesfully"),
    @ApiResponse(code=400,message="fields cannot be null or blank")})
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<User>> deleteUser(@RequestParam int id)
	{
		return userservice.deleteUser(id);
		
	}
    
    @ApiOperation(value="api is used to get single user",notes="api used for fetch single user")
    @ApiResponses({@ApiResponse(code = 200,message = "user fetch succesfully"),
    @ApiResponse(code=400,message="fields cannot be null or blank")})
	@GetMapping("/singleuser")
	public ResponseEntity<ResponseStructure<User>> singleuUser(@RequestParam int id)
	{
		return userservice.singleUser(id);
		
	}
}
