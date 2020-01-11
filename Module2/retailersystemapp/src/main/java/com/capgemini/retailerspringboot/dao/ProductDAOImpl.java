package com.capgemini.retailerspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailerspringboot.dto.Authentication;
import com.capgemini.retailerspringboot.dto.ProductInfo;
import com.capgemini.retailerspringboot.exceptions.ProductInfoExceptions;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public ProductInfo getProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product = manager.find(ProductInfo.class, id);
		return product;
	}

	@Override
	public List<ProductInfo> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from ProductInfo";
		TypedQuery<ProductInfo> query = manager.createQuery(getall, ProductInfo.class);
		return query.getResultList();
	}

	@Override
	public boolean deleteProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ProductInfo product = manager.find(ProductInfo.class, id);
		if (product != null) {
			transaction.begin();
			manager.remove(product);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean modifyProduct(int id, String name) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product = manager.find(ProductInfo.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (product != null) {
			transaction.begin();
			product.setName(name);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean register(Authentication account) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(account);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new ProductInfoExceptions("Account with same email already exists");
		}
		
	}

	@Override
	public Authentication login(Authentication credentials) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Authentication where email=:email";
		TypedQuery<Authentication> query = manager.createQuery(jpql, Authentication.class);
		query.setParameter("email", credentials.getEmail());
		try {
			Authentication account = query.getSingleResult();
			if (account.getPassword().equals(credentials.getPassword())) {
				return account;
			} else {
				System.out.println("here above valid");
				return null;
			}
		} catch (Exception e) {
			throw new ProductInfoExceptions("Account does not exist");
		}
	}

}
