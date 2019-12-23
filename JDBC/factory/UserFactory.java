package com.capgemini.jdbc.factory;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOImpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImpl;

public class UserFactory {
	public class instanceOfDAOImpl implements UserDAO {

		@Override
		public List<UserBean> getAllUsers() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public UserBean userLogin(String username, String password) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean updateUser(int userid, String password, String email) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean deleteUser(int userid, String password) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean insertUser(UserBean user) {
			// TODO Auto-generated method stub
			return false;
		}

	}
	private UserFactory() {
		
	}
	public static UserDAO instanceOfUserDAOImpl() {
		UserDAO dao =  new UserDAOImpl();
		return dao;
	}
	public static UserServices instanceOfUserServices() {
		UserServices services = new UserServicesImpl();
		return services;
		
	}

}
