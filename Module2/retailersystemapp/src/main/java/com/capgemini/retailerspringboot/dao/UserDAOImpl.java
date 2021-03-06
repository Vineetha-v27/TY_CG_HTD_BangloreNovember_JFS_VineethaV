package com.capgemini.retailerspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailerspringboot.dto.UserInfo;

@Repository
public class UserDAOImpl implements UserDAO{

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addUser(UserInfo user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public UserInfo getUser(int id) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, id);
		return user;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from UserInfo";
		TypedQuery<UserInfo> query = manager.createQuery(getall, UserInfo.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteUser(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		UserInfo user = manager.find(UserInfo.class, id);
		if (user != null) {
			transaction.begin();
			manager.remove(user);
			transaction.commit();
			return true;
		} else {
			return false;
		}

	}
}
