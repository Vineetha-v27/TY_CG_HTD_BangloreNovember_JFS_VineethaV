package com.capgemini.retailerspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailerspringboot.dao.UserDAO;
import com.capgemini.retailerspringboot.dto.UserInfo;

@Service
public class UserServicesImpl implements UserService{
	@Autowired
	 private UserDAO userdao;

	@Override
	public boolean addUser(UserInfo user) {
		return userdao.addUser(user);
	}

	@Override
	public UserInfo getUser(int id) {
		return userdao.getUser(id);
	}

	@Override
	public List<UserInfo> getAllUsers() {
		return userdao.getAllUsers();
	}

	@Override
	public boolean deleteUser(int id) {
		return userdao.deleteUser(id);
	}

}
