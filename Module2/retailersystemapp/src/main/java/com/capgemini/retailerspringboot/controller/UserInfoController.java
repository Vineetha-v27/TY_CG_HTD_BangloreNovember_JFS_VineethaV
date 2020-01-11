package com.capgemini.retailerspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.retailerspringboot.dto.UserInfo;
import com.capgemini.retailerspringboot.dto.UserInfoResponce;
import com.capgemini.retailerspringboot.service.UserService;

@RestController
public class UserInfoController {
	@Autowired
	UserService service;
	
	@PostMapping(path="/add-user",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponce addProduct(@RequestBody UserInfo user) {
		UserInfoResponce response = new UserInfoResponce();
		if(service.addUser(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User with same name already exists");
		}
		return response;
	}
	
	@GetMapping(path="/view-user",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponce viewUser(@RequestParam("id") int id) {
		UserInfoResponce response = new UserInfoResponce();
		UserInfo user=service.getUser(id);
		if(user!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User found");
			response.setProduct(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/view-allusers",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponce viewAllUsers() {
		UserInfoResponce response = new UserInfoResponce();
		List<UserInfo> list=service.getAllUsers();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User found");
			response.setProduct(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@DeleteMapping(path = "/delete-user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponce deleteUser(@PathVariable("id") int id) {
		UserInfoResponce response = new UserInfoResponce();
		if(service.deleteUser(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User not found");
		}
		return response;
	}

	
	
	
	

}
