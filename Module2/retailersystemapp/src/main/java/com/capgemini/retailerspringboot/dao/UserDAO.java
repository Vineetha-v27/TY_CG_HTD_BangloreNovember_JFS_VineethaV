package com.capgemini.retailerspringboot.dao;

import java.util.List;

import com.capgemini.retailerspringboot.dto.UserInfo;

public interface UserDAO {
	
    public boolean addUser(UserInfo user);
	
	public UserInfo getUser(int id);
	
	public List<UserInfo> getAllUsers();
	
	public boolean deleteUser(int id);
	

}
