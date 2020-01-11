package com.capgemini.retailerspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailerspringboot.dto.OrderInfo;
import com.capgemini.retailerspringboot.dto.ProductInfo;

@Repository
public class OrderDAOImpl implements OrderDAO{

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addOrder(OrderInfo order) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public OrderInfo getOrder(int id) {
		EntityManager manager = factory.createEntityManager();
		OrderInfo order = manager.find(OrderInfo.class, id);
		return order;
	}

	@Override
	public List<OrderInfo> getAllOrders() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from OrderInfo";
		TypedQuery<OrderInfo> query = manager.createQuery(getall, OrderInfo.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteOrder(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		OrderInfo order = manager.find(OrderInfo.class, id);
		if (order != null) {
			transaction.begin();
			manager.remove(order);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
