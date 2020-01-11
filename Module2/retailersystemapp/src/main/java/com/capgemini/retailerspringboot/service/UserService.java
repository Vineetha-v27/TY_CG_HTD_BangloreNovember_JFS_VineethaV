package com.capgemini.retailerspringboot.service;

import java.util.List;

import com.capgemini.retailerspringboot.dto.UserInfo;

public interface UserService {
	 public boolean addUser(UserInfo user);
		
		public UserInfo getUser(int id);
		
		public List<UserInfo> getAllUsers();
		
		public boolean deleteUser(int id);
		

}
