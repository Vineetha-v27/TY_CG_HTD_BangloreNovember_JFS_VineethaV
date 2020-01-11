package com.capgemini.retailerspringboot.dao;

import java.util.List;

import com.capgemini.retailerspringboot.dto.OrderInfo;

public interface OrderDAO {
	
	public boolean addOrder(OrderInfo order);
	
	public OrderInfo getOrder(int id);
	
	public List<OrderInfo> getAllOrders();
	
	public boolean deleteOrder(int id);
	

}
